package design.patterns.facadepattern.compiler;

public class SemanticAnalyzer {
    private String astRoot;

    public SemanticAnalyzer(String astRoot) {
        this.astRoot = astRoot;
    }

    public void typeCheck() {
        System.out.println("Type Checking");
    }
}
