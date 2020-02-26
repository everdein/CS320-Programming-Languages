// Generated from json1.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link json1Parser}.
 */
public interface json1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link json1Parser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(json1Parser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link json1Parser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(json1Parser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link json1Parser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(json1Parser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link json1Parser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(json1Parser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link json1Parser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(json1Parser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link json1Parser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(json1Parser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link json1Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(json1Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link json1Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(json1Parser.ValueContext ctx);
}