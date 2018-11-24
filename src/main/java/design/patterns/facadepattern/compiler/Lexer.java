package design.patterns.facadepattern.compiler;

import java.util.ArrayList;
import java.util.List;

public class Lexer {
    private String fileName;

    public Lexer(String fileName) {
        this.fileName = fileName;
    }

    public void tokenize() {
        System.out.println("Generating Tokens");
    }

}
