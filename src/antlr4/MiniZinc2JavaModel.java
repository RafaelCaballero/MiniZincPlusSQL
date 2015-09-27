package antlr4;

import org.antlr.v4.runtime.misc.NotNull;

import minizinc.representation.mznmodel.MiniZincSQLModel;

@SuppressWarnings("deprecation")
public class MiniZinc2JavaModel extends MiniZincGrammarBaseListener {

	private MiniZincSQLModel model;
	@SuppressWarnings("unused")
	private MiniZincGrammarParser parser;

	public MiniZinc2JavaModel(MiniZincGrammarParser parser) {
		this.parser = parser;
		this.model = null;
	}

	/**
	 * {@inheritDoc}
	 *
	 * <p>
	 * Do nothing; everything has been done by each statement
	 * </p>
	 * <p>
	 * Model m has already all the information
	 * </p>
	 */
	@Override
	public void exitModel(@NotNull MiniZincGrammarParser.ModelContext ctx) {
		model = MiniZincSQLModel.model(ctx);
	}

	public MiniZincSQLModel getModel() {
		// System.out.println(model);
		return model;
	}

}
