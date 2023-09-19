// Generated from Delivery.g4 by ANTLR 4.13.0

    package delivery;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DeliveryParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DeliveryVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DeliveryParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(DeliveryParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeliveryParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(DeliveryParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeliveryParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(DeliveryParser.ExprContext ctx);
}