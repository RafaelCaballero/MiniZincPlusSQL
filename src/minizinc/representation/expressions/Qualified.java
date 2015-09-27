package minizinc.representation.expressions;

import java.util.List;
import java.util.stream.Collectors;

import antlr4.MiniZincGrammarParser.QualifiedContext;
import minizinc.representation.Parsing;
import minizinc.representation.TypeName;
import transformation.ExprTransformer;

/*
 * qualified : 
 *    ID '.' ID 
 *   | arrayaccess '.' ID   
 */
public class Qualified extends Expr {

	private ID id1; // can be null!
	private ArrayAccess aa; // can be null!
	private ID id2;

	public Qualified(ArrayAccess aa, ID id2) {
		this.id1 = null;
		this.aa = aa;
		this.id2 = id2;

	}

	public Qualified(ID id1, ID id2) {
		this.id1 = id1;
		this.aa = null;
		this.id2 = id2;

	}

	@Override
	public String print() {
		String s = "";
		if (id1 == null)
			s = aa.print() + "." + id2.print();
		else
			s = id1.print() + "." + id2.print();
		return s;
	}

	@Override
	public void subexpressions(ExprTransformer t) {
		if (aa != null) {
			ArrayAccess ep = applyTransformer2(t, aa);
			if (ep != null)
				aa = ep;
		}

	}

	@Override
	public TypeName type() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Qualified clone() {
		Qualified r = null;
		ID id2c = id2.clone();
		if (id1 == null) {
			ArrayAccess aa2 = aa.clone();
			r = new Qualified(aa, id2);
		} else {
			ID id1c = id1.clone();
			r = new Qualified(id1, id2);
		}
		return r;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aa == null) ? 0 : aa.hashCode());
		result = prime * result + ((id1 == null) ? 0 : id1.hashCode());
		result = prime * result + ((id2 == null) ? 0 : id2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Qualified other = (Qualified) obj;
		if (aa == null) {
			if (other.aa != null)
				return false;
		} else if (!aa.equals(other.aa))
			return false;
		if (id1 == null) {
			if (other.id1 != null)
				return false;
		} else if (!id1.equals(other.id1))
			return false;
		if (id2 == null) {
			if (other.id2 != null)
				return false;
		} else if (!id2.equals(other.id2))
			return false;
		return true;
	}

	/**
	 * Grammar:<br>
	 * qualified : ID '.' ID | arrayaccess '.' ID
	 * 
	 * @param ctx
	 *            Grammar context
	 * @return Qualifed representation
	 */
	public static Qualified qualified(QualifiedContext ctx) {
		Qualified t = null;
		List<ID> ids = ctx.ID().stream().map(x -> ID.IDTerm(x)).collect(Collectors.toList());
		if (ids.size() > 0) {
			if (ids.size() == 2) {
				ID id0 = ID.IDTerm(ctx.ID(0));
				ID id1 = ID.IDTerm(ctx.ID(1));
				t = new Qualified(id0, id1);
			} else if (Parsing.has(ctx.arrayaccess())) {
				ID id1 = ID.IDTerm(ctx.ID(0));
				ArrayAccess access = ArrayAccess.arrayaccess(ctx.arrayaccess());
				t = new Qualified(access, id1);
			} else
				Parsing.error("Qualified error in first symbol" + ctx.getText());
		} else
			Parsing.error("Qualified error in second symbol" + ctx.getText());
		return t;
	}

}
