// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParserParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(GrammarParserParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParserParser#entryPoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntryPoint(GrammarParserParser.EntryPointContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParserParser#grammar_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrammar_rule(GrammarParserParser.Grammar_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParserParser#parse_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse_rule(GrammarParserParser.Parse_ruleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tokenRule}
	 * labeled alternative in {@link GrammarParserParser#lexer_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokenRule(GrammarParserParser.TokenRuleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code skipRule}
	 * labeled alternative in {@link GrammarParserParser#lexer_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipRule(GrammarParserParser.SkipRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParserParser#terminal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal_value(GrammarParserParser.Terminal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParserParser#input_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_attributes(GrammarParserParser.Input_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParserParser#output_attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_attributes(GrammarParserParser.Output_attributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParserParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(GrammarParserParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParserParser#attribute_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_name(GrammarParserParser.Attribute_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParserParser#attribute_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_value(GrammarParserParser.Attribute_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParserParser#rule_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_elements(GrammarParserParser.Rule_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParserParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(GrammarParserParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParserParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(GrammarParserParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParserParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(GrammarParserParser.ArgumentContext ctx);
}