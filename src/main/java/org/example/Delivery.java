package org.example;

import delivery.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

// antlr4 -visitor Delivery.g4

public class Delivery {
    public static void main(String[] args) {
        try {
            // Read the input file
            CharStream input = CharStreams.fromFileName("src/tests/trafiklys1.hw");

            // Create a lexer
            DeliveryLexer lexer = new DeliveryLexer(input);

            // Create a token stream from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create a parser
            DeliveryParser parser = new DeliveryParser(tokens);

            // Start parsing at the `prog` rule
            ParseTree tree = parser.function();

            // Do something with the parse tree (e.g., print it)
            System.out.println(tree.toStringTree(parser));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}