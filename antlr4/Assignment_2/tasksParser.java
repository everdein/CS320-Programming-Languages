// Generated from tasks.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tasksParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, STRING=24, 
		WS=25;
	public static final int
		RULE_start = 0, RULE_task = 1, RULE_function = 2, RULE_parameter = 3, 
		RULE_value = 4, RULE_action = 5, RULE_result = 6, RULE_operate = 7, RULE_math = 8, 
		RULE_call = 9, RULE_loop = 10, RULE_compare = 11, RULE_assignment = 12;
	public static final String[] ruleNames = {
		"start", "task", "function", "parameter", "value", "action", "result", 
		"operate", "math", "call", "loop", "compare", "assignment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<-'", "'function'", "'('", "')'", "'{'", "'}'", "','", "'x'", 
		"'y'", "'from'", "'0'", "'1'", "'return('", "'+'", "'-'", "'*'", "'/'", 
		"'!='", "'print'", "'Sys'", "'.'", "'sleep'", "'while'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"STRING", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "tasks.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public tasksParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public List<TaskContext> task() {
			return getRuleContexts(TaskContext.class);
		}
		public TaskContext task(int i) {
			return getRuleContext(TaskContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			task();
			setState(27);
			task();
			setState(28);
			task();
			setState(29);
			task();
			setState(30);
			task();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TaskContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TaskContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).enterTask(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).exitTask(this);
		}
	}

	public final TaskContext task() throws RecognitionException {
		TaskContext _localctx = new TaskContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_task);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			function();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(tasksParser.STRING, 0); }
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				match(STRING);
				setState(35);
				match(T__0);
				setState(36);
				match(T__1);
				setState(37);
				match(T__2);
				setState(38);
				parameter();
				setState(39);
				match(T__3);
				setState(40);
				match(T__4);
				setState(41);
				action();
				setState(42);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(STRING);
				setState(45);
				match(T__0);
				setState(46);
				match(T__1);
				setState(47);
				match(T__2);
				setState(48);
				parameter();
				setState(49);
				match(T__3);
				setState(50);
				match(T__4);
				setState(51);
				action();
				setState(52);
				action();
				setState(53);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameter);
		try {
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				value();
				setState(58);
				match(T__6);
				setState(59);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public ResultContext result() {
			return getRuleContext(ResultContext.class,0);
		}
		public OperateContext operate() {
			return getRuleContext(OperateContext.class,0);
		}
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_action);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				result();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				operate();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(69);
				loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				assignment();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResultContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public ResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).enterResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).exitResult(this);
		}
	}

	public final ResultContext result() throws RecognitionException {
		ResultContext _localctx = new ResultContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_result);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(T__12);
			setState(74);
			action();
			setState(75);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperateContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public OperateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).enterOperate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).exitOperate(this);
		}
	}

	public final OperateContext operate() throws RecognitionException {
		OperateContext _localctx = new OperateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operate);
		try {
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				value();
				setState(78);
				math();
				setState(79);
				value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(T__9);
				setState(82);
				math();
				setState(83);
				value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathContext extends ParserRuleContext {
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).enterMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).exitMath(this);
		}
	}

	public final MathContext math() throws RecognitionException {
		MathContext _localctx = new MathContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_math);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).exitCall(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_call);
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(T__18);
				setState(90);
				match(T__2);
				setState(91);
				parameter();
				setState(92);
				match(T__3);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__19);
				setState(95);
				match(T__20);
				setState(96);
				match(T__21);
				setState(97);
				match(T__2);
				setState(98);
				parameter();
				setState(99);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).exitLoop(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__22);
			setState(104);
			match(T__2);
			setState(105);
			compare();
			setState(106);
			match(T__3);
			setState(107);
			match(T__4);
			setState(108);
			action();
			setState(109);
			action();
			setState(110);
			action();
			setState(111);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).exitCompare(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			value();
			setState(114);
			math();
			setState(115);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public OperateContext operate() {
			return getRuleContext(OperateContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tasksListener ) ((tasksListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(T__9);
			setState(118);
			match(T__0);
			setState(119);
			operate();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33|\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4:\n\4\3\5\3\5\3\5\3\5\3\5\5\5A\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7"+
		"J\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tX\n\t\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13h\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\4\3\2\n\16\3\2\20"+
		"\24\2v\2\34\3\2\2\2\4\"\3\2\2\2\69\3\2\2\2\b@\3\2\2\2\nB\3\2\2\2\fI\3"+
		"\2\2\2\16K\3\2\2\2\20W\3\2\2\2\22Y\3\2\2\2\24g\3\2\2\2\26i\3\2\2\2\30"+
		"s\3\2\2\2\32w\3\2\2\2\34\35\5\4\3\2\35\36\5\4\3\2\36\37\5\4\3\2\37 \5"+
		"\4\3\2 !\5\4\3\2!\3\3\2\2\2\"#\5\6\4\2#\5\3\2\2\2$%\7\32\2\2%&\7\3\2\2"+
		"&\'\7\4\2\2\'(\7\5\2\2()\5\b\5\2)*\7\6\2\2*+\7\7\2\2+,\5\f\7\2,-\7\b\2"+
		"\2-:\3\2\2\2./\7\32\2\2/\60\7\3\2\2\60\61\7\4\2\2\61\62\7\5\2\2\62\63"+
		"\5\b\5\2\63\64\7\6\2\2\64\65\7\7\2\2\65\66\5\f\7\2\66\67\5\f\7\2\678\7"+
		"\b\2\28:\3\2\2\29$\3\2\2\29.\3\2\2\2:\7\3\2\2\2;<\5\n\6\2<=\7\t\2\2=>"+
		"\5\n\6\2>A\3\2\2\2?A\5\n\6\2@;\3\2\2\2@?\3\2\2\2A\t\3\2\2\2BC\t\2\2\2"+
		"C\13\3\2\2\2DJ\5\16\b\2EJ\5\20\t\2FJ\5\24\13\2GJ\5\26\f\2HJ\5\32\16\2"+
		"ID\3\2\2\2IE\3\2\2\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\r\3\2\2\2KL\7\17\2"+
		"\2LM\5\f\7\2MN\7\6\2\2N\17\3\2\2\2OP\5\n\6\2PQ\5\22\n\2QR\5\n\6\2RX\3"+
		"\2\2\2ST\7\f\2\2TU\5\22\n\2UV\5\n\6\2VX\3\2\2\2WO\3\2\2\2WS\3\2\2\2X\21"+
		"\3\2\2\2YZ\t\3\2\2Z\23\3\2\2\2[\\\7\25\2\2\\]\7\5\2\2]^\5\b\5\2^_\7\6"+
		"\2\2_h\3\2\2\2`a\7\26\2\2ab\7\27\2\2bc\7\30\2\2cd\7\5\2\2de\5\b\5\2ef"+
		"\7\6\2\2fh\3\2\2\2g[\3\2\2\2g`\3\2\2\2h\25\3\2\2\2ij\7\31\2\2jk\7\5\2"+
		"\2kl\5\30\r\2lm\7\6\2\2mn\7\7\2\2no\5\f\7\2op\5\f\7\2pq\5\f\7\2qr\7\b"+
		"\2\2r\27\3\2\2\2st\5\n\6\2tu\5\22\n\2uv\5\n\6\2v\31\3\2\2\2wx\7\f\2\2"+
		"xy\7\3\2\2yz\5\20\t\2z\33\3\2\2\2\79@IWg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}