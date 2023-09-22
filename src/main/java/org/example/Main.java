package org.example;

import antlr.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

// antlr4 -visitor MyLanguage.g4

public class Main {
    public static void main(String[] args) {
        try {
            // Read the input file
            CharStream input = CharStreams.fromFileName("src/tests/test1.txt");

            // Create a lexer
            MyLanguageLexer lexer = new MyLanguageLexer(input);

            // Create a token stream from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create a parser
            MyLanguageParser parser = new MyLanguageParser(tokens);

            // Start parsing at the `prog` rule
            ParseTree tree = parser.prog();

            // Do something with the parse tree (e.g., print it)
            System.out.println(tree.toStringTree(parser));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
