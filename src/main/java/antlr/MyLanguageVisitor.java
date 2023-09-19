// Generated from MyLanguage.g4 by ANTLR 4.13.0

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(MyLanguageParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(MyLanguageParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MyLanguageParser.ExprContext ctx);
}