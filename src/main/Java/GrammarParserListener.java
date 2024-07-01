// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParserParser}.
 */
public interface GrammarParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParserParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(GrammarParserParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParserParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(GrammarParserParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParserParser#entryPoint}.
	 * @param ctx the parse tree
	 */
	void enterEntryPoint(GrammarParserParser.EntryPointContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParserParser#entryPoint}.
	 * @param ctx the parse tree
	 */
	void exitEntryPoint(GrammarParserParser.EntryPointContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParserParser#grammar_rule}.
	 * @param ctx the parse tree
	 */
	void enterGrammar_rule(GrammarParserParser.Grammar_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParserParser#grammar_rule}.
	 * @param ctx the parse tree
	 */
	void exitGrammar_rule(GrammarParserParser.Grammar_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParserParser#parse_rule}.
	 * @param ctx the parse tree
	 */
	void enterParse_rule(GrammarParserParser.Parse_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParserParser#parse_rule}.
	 * @param ctx the parse tree
	 */
	void exitParse_rule(GrammarParserParser.Parse_ruleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tokenRule}
	 * labeled alternative in {@link GrammarParserParser#lexer_rule}.
	 * @param ctx the parse tree
	 */
	void enterTokenRule(GrammarParserParser.TokenRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tokenRule}
	 * labeled alternative in {@link GrammarParserParser#lexer_rule}.
	 * @param ctx the parse tree
	 */
	void exitTokenRule(GrammarParserParser.TokenRuleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code skipRule}
	 * labeled alternative in {@link GrammarParserParser#lexer_rule}.
	 * @param ctx the parse tree
	 */
	void enterSkipRule(GrammarParserParser.SkipRuleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code skipRule}
	 * labeled alternative in {@link GrammarParserParser#lexer_rule}.
	 * @param ctx the parse tree
	 */
	void exitSkipRule(GrammarParserParser.SkipRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParserParser#terminal_value}.
	 * @param ctx the parse tree
	 */
	void enterTerminal_value(GrammarParserParser.Terminal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParserParser#terminal_value}.
	 * @param ctx the parse tree
	 */
	void exitTerminal_value(GrammarParserParser.Terminal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParserParser#input_attributes}.
	 * @param ctx the parse tree
	 */
	void enterInput_attributes(GrammarParserParser.Input_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParserParser#input_attributes}.
	 * @param ctx the parse tree
	 */
	void exitInput_attributes(GrammarParserParser.Input_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParserParser#output_attributes}.
	 * @param ctx the parse tree
	 */
	void enterOutput_attributes(GrammarParserParser.Output_attributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParserParser#output_attributes}.
	 * @param ctx the parse tree
	 */
	void exitOutput_attributes(GrammarParserParser.Output_attributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParserParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(GrammarParserParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParserParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(GrammarParserParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParserParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_name(GrammarParserParser.Attribute_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParserParser#attribute_name}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_name(GrammarParserParser.Attribute_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParserParser#attribute_value}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_value(GrammarParserParser.Attribute_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParserParser#attribute_value}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_value(GrammarParserParser.Attribute_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParserParser#rule_elements}.
	 * @param ctx the parse tree
	 */
	void enterRule_elements(GrammarParserParser.Rule_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParserParser#rule_elements}.
	 * @param ctx the parse tree
	 */
	void exitRule_elements(GrammarParserParser.Rule_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParserParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(GrammarParserParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParserParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(GrammarParserParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParserParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(GrammarParserParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParserParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(GrammarParserParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParserParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(GrammarParserParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParserParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(GrammarParserParser.ArgumentContext ctx);
}