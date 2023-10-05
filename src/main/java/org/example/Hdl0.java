package org.example;

import hdl0.hdl0Lexer;
import hdl0.hdl0Parser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Hdl0 {
    public static void main(String[] args) throws IOException {

        //if (args.length != 1) {
        //    System.err.println("Please give as input argument a filename\n");
        //    System.exit(-1);
        //}

        //String filename=args[0];

        String filename = "src/tests/hdl0.txt";

        CharStream charStream = CharStreams.fromFileName(filename);

        hdl0Lexer lexer = new hdl0Lexer(charStream);

        CommonTokenStream tokenStream = new CommonTokenStream(lexer);

        hdl0Parser parser = new hdl0Parser(tokenStream);

        ParseTree parseTree = parser.start();

        Hdl0Interpreter interpreter = new Hdl0Interpreter();
        String html = interpreter.visit(parseTree);
        System.out.println(html);

        BufferedWriter writer = new BufferedWriter(new FileWriter("src/tests/hdl0.html", false));
        writer.write(html);
        writer.close();
    }
}

