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
	 * Visit a parse tree produced by {@link DeliveryParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(DeliveryParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeliveryParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(DeliveryParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeliveryParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(DeliveryParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DeliveryParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(DeliveryParser.CondContext ctx);
}