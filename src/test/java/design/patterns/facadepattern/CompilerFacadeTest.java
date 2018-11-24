package design.patterns.facadepattern;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CompilerFacadeTest {

    @BeforeClass
    public static void setUp() throws Exception {
        System.out.println("Executing Facade Pattern -> Type: Structural");
    }

    @Test
    public void facadeTest() {
        CompilerFacade compFacade = new CompilerFacade("pongGame");
        String fileGenerated = compFacade.compile();

        assertEquals("Successfully compiled to pongGameIRCode.ext", fileGenerated);
    }
}