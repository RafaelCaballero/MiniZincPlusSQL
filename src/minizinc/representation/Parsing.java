package minizinc.representation;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.slf4j.Logger;

import logger.AreaAppender;

/**
 * Classes that represent MiniZinc terms in Java
 * 
 * @author rafa
 *
 */
public class Parsing {

	private static final Logger logger = AreaAppender.getLogger(Parsing.class);

	public static boolean has(ParserRuleContext ctx) {
		return ctx != null;
	}

	public static boolean hasTerminal(TerminalNode ctx) {
		return ctx != null;
	}

	/**
	 * At the moment the error is just displayed Notice that these errors should
	 * only occur if the grammar is changed but this code is not changed
	 * accordingly
	 * 
	 * @param error
	 */
	public static void error(String error) {
		// String e = "Parser error. Unexpected " + error;
		logger.error("Parser error. Unexpected {}", error);
	}

}
