package design.patterns.facadepattern.compiler;

public class Parser {
    private Lexer lexer;
    private String parseTreeRoot;

    public Parser(Lexer lexer) {
        this.lexer = lexer;
    }

    public void parse() {
        System.out.println("Generating Parse Tree");
        parseTreeRoot = "parsed";
    }

    public String getParseTreeRoot() {
        return parseTreeRoot;
    }
}
