package org.example;

import hdl0.hdl0Parser;
import hdl0.hdl0Visitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;


public class Hdl0Interpreter extends AbstractParseTreeVisitor<String> implements hdl0Visitor<String> {

    final static String begin = "<!DOCTYPE html>\n" +
            "<html><head><title>HDL0 File Content</title>\n" +
            "<script src=\"https://polyfill.io/v3/polyfill.min.js?features=es6\"></script>\n" +
            "<script type=\"text/javascript\" id=\"MathJax-script\"\n" +
            "async src=\"https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-chtml.js\">\n" +
            "</script></head><body>\n";
    final static String end = "\n</body></html>";

    @Override
    public String visitStart(hdl0Parser.StartContext ctx) {
        StringBuilder builder = new StringBuilder();

        builder.append(begin);
        builder.append(visit(ctx.hw));
        builder.append(visit(ctx.in));
        builder.append(visit(ctx.out));
        builder.append(visit(ctx.lat));
        builder.append(visit(ctx.up));
        builder.append(visit(ctx.sim));
        builder.append(end);

        return builder.toString();
    }

    @Override
    public String visitHardware(hdl0Parser.HardwareContext ctx) {
        return "<h1>" + ctx.id.getText() + "</h1>\n";
    }

    @Override
    public String visitInputs(hdl0Parser.InputsContext ctx) {
        return "<h2>Inputs</h2>\n" + ctx.id.getText() + "\n";
    }

    @Override
    public String visitOutputs(hdl0Parser.OutputsContext ctx) {
        StringBuilder expressions = new StringBuilder();
        for (TerminalNode node : ctx.IDENTIFIER()) {
            expressions.append(node.getText());
            expressions.append("<br>\n");
        }
        return "<h2>Outputs</h2>\n" + expressions + "\n";
    }

    @Override
    public String visitLatches(hdl0Parser.LatchesContext ctx) {
        StringBuilder expressions = new StringBuilder();
        for (hdl0Parser.LatchExprContext context : ctx.latchExpr()) {
            expressions.append(visit(context));
            expressions.append("<br>\n");
        }
        return "<h2>Latches</h2>\n" + expressions + "\n";
    }

    @Override
    public String visitUpdate(hdl0Parser.UpdateContext ctx) {
        StringBuilder expressions = new StringBuilder();
        for (hdl0Parser.UpdateExprContext context : ctx.updateExpr()) {
            expressions.append(visit(context));
            expressions.append("<br>\n");
        }
        return "<h2>Updates</h2>\n" + expressions + "\n";
    }

    @Override
    public String visitSimulate(hdl0Parser.SimulateContext ctx) {
        StringBuilder expressions = new StringBuilder();
        for (hdl0Parser.SimulateExprContext context : ctx.simulateExpr()) {
            expressions.append(visit(context));
            expressions.append("<br>\n");
        }
        return "<h2>Simulate</h2>\n" + expressions + "\n";
    }

    @Override
    public String visitNeg(hdl0Parser.NegContext ctx) {
        return "(\\neg " + ctx.e.getText() + ")";
    }

    @Override
    public String visitOr(hdl0Parser.OrContext ctx) {
        return visit(ctx.e1) + " \\vee " + visit(ctx.e2);
    }

    @Override
    public String visitAnd(hdl0Parser.AndContext ctx) {
        return "(" + visit(ctx.e1) + " \\wedge " + visit(ctx.e2) + ")";
    }

    @Override
    public String visitExp(hdl0Parser.ExpContext ctx) {
        return ctx.e.getText();
    }

    @Override
    public String visitParen(hdl0Parser.ParenContext ctx) {
        return "(" + visit(ctx.e) + ")";
    }

    @Override
    public String visitLatchExpr(hdl0Parser.LatchExprContext ctx) {
        return visit(ctx.in) + " &rarr; " + visit(ctx.out);
    }

    @Override
    public String visitUpdateExpr(hdl0Parser.UpdateExprContext ctx) {
        return visit(ctx.out) + " &larr; \\(" + visit(ctx.exp) + "\\)";
    }

    @Override
    public String visitSimulateExpr(hdl0Parser.SimulateExprContext ctx) {
        return visit(ctx.in) + ": " + ctx.values.getText();
    }
}
