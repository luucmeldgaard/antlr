// Generated from Delivery.g4 by ANTLR 4.13.0

    package delivery;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DeliveryParser}.
 */
public interface DeliveryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DeliveryParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(DeliveryParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeliveryParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(DeliveryParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeliveryParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(DeliveryParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeliveryParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(DeliveryParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link DeliveryParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DeliveryParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DeliveryParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DeliveryParser.ExprContext ctx);
}