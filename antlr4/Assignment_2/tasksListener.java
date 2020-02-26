// Generated from tasks.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tasksParser}.
 */
public interface tasksListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tasksParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(tasksParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link tasksParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(tasksParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link tasksParser#task}.
	 * @param ctx the parse tree
	 */
	void enterTask(tasksParser.TaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link tasksParser#task}.
	 * @param ctx the parse tree
	 */
	void exitTask(tasksParser.TaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link tasksParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(tasksParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tasksParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(tasksParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tasksParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(tasksParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tasksParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(tasksParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tasksParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(tasksParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link tasksParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(tasksParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link tasksParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(tasksParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link tasksParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(tasksParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link tasksParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(tasksParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tasksParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(tasksParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tasksParser#result}.
	 * @param ctx the parse tree
	 */
	void enterResult(tasksParser.ResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link tasksParser#result}.
	 * @param ctx the parse tree
	 */
	void exitResult(tasksParser.ResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link tasksParser#operate}.
	 * @param ctx the parse tree
	 */
	void enterOperate(tasksParser.OperateContext ctx);
	/**
	 * Exit a parse tree produced by {@link tasksParser#operate}.
	 * @param ctx the parse tree
	 */
	void exitOperate(tasksParser.OperateContext ctx);
	/**
	 * Enter a parse tree produced by {@link tasksParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMath(tasksParser.MathContext ctx);
	/**
	 * Exit a parse tree produced by {@link tasksParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMath(tasksParser.MathContext ctx);
	/**
	 * Enter a parse tree produced by {@link tasksParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(tasksParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link tasksParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(tasksParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link tasksParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(tasksParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link tasksParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(tasksParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link tasksParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(tasksParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link tasksParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(tasksParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link tasksParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(tasksParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link tasksParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(tasksParser.AssignmentContext ctx);
}