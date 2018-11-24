package design.patterns.facadepattern.compiler;

public class IRCodeGenerator {
    private String astRoot;
    private String ircFileName;

    public IRCodeGenerator(String astRoot, String fileName) {
        this.astRoot = astRoot;
        this.ircFileName = fileName;
    }

    public void generateCode() {
        System.out.println("Generating IR code");
        ircFileName = ircFileName + "IRCode.ext";
    }

    public String getIRCodeFile() {
        return ircFileName;
    }
}
