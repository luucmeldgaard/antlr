// Generated from Delivery.g4 by ANTLR 4.13.0

    package delivery;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DeliveryParser}.
 */
public interface DeliveryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DeliveryParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(DeliveryParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeliveryParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(DeliveryParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeliveryParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(DeliveryParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeliveryParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(DeliveryParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeliveryParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(DeliveryParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeliveryParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(DeliveryParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeliveryParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(DeliveryParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeliveryParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(DeliveryParser.CondContext ctx);
}