package control;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;

import antlr4.MiniZinc2JavaModel;
import antlr4.MiniZincGrammarLexer;
import antlr4.MiniZincGrammarParser;
import logger.AreaAppender;
import minizinc.representation.mznmodel.MiniZincSQLModel;

/**
 * Represents a MiniZinc model include SQL tables, dot notation and constraints
 * 
 * @author rafa
 *
 */
public class MiniZincPlusModel {
	private static final Logger logger = AreaAppender.getLogger(MiniZincPlusModel.class);

	private String filename;
	private MiniZincSQLModel model;

	public MiniZincPlusModel(String filename) throws Exception {
		this.model = null;
		this.filename = filename;
		String inputFile = null;
		inputFile = filename;

		// check if the file exists
		File f = new File(inputFile);

		if (!f.exists()) {
			logger.error("File  {} not found!", inputFile);
			throw new IOException("File " + inputFile + " not found!");
		}

		InputStream is = System.in;
		if (inputFile != null)
			is = new FileInputStream(inputFile);
		ANTLRInputStream input = new ANTLRInputStream(is);
		// prepare the parser
		MiniZincGrammarLexer lexer = new MiniZincGrammarLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		MiniZincGrammarParser parser = new MiniZincGrammarParser(tokens);
		ParseTree tree = parser.model(); // parse; start at model

		// prepare the listener
		ParseTreeWalker walker = new ParseTreeWalker();
		MiniZinc2JavaModel extractor = new MiniZinc2JavaModel(parser); // (parser,pu);
		walker.walk(extractor, tree);
		// System.out.println(tree.toStringTree(parser)); // print tree as text
		// <label id="code.tour.main.7"/>
		this.model = extractor.getModel();

	}

	/**
	 * @return The parsed model
	 */
	public MiniZincSQLModel getModel() {
		return model;
	}

}
