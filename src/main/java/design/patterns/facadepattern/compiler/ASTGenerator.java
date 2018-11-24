package design.patterns.facadepattern.compiler;

public class ASTGenerator {
    private String parseTreeRoot;
    private String astRoot;

    public ASTGenerator(String parseTreeRoot) {
        this.parseTreeRoot = parseTreeRoot;
    }

    public void generateAST() {
        System.out.println("Generating AST");
        astRoot = "AST";
    }

    public String getAstRoot() {
        return astRoot;
    }
}
