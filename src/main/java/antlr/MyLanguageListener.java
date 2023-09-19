// Generated from MyLanguage.g4 by ANTLR 4.13.0

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLanguageParser}.
 */
public interface MyLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(MyLanguageParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(MyLanguageParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(MyLanguageParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(MyLanguageParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MyLanguageParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MyLanguageParser.ExprContext ctx);
}