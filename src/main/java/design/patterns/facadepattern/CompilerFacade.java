package design.patterns.facadepattern;

import design.patterns.facadepattern.compiler.*;

public class CompilerFacade {
    private String fileNme;

    public CompilerFacade(String fileName) {
        this.fileNme = fileName;
    }

    public String compile() {
        // tokenizing
        Lexer lexer = new Lexer(fileNme);
        lexer.tokenize();

        // parsing
        Parser parser = new Parser(lexer);
        parser.parse();
        String parseTree = parser.getParseTreeRoot();

        // generate AST
        ASTGenerator astGenerator = new ASTGenerator(parseTree);
        astGenerator.generateAST();
        String ast = astGenerator.getAstRoot();

        // type checking
        SemanticAnalyzer sa = new SemanticAnalyzer(ast);
        sa.typeCheck();

        // IR code generation
        IRCodeGenerator irc = new IRCodeGenerator(ast, fileNme);
        irc.generateCode();
        String ircFile = irc.getIRCodeFile();

        return "Successfully compiled to " + ircFile;
    }
}
