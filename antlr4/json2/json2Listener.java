// Generated from json2.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link json2Parser}.
 */
public interface json2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link json2Parser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(json2Parser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link json2Parser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(json2Parser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link json2Parser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(json2Parser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link json2Parser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(json2Parser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link json2Parser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(json2Parser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link json2Parser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(json2Parser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link json2Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(json2Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link json2Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(json2Parser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link json2Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(json2Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link json2Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(json2Parser.ArrayContext ctx);
}