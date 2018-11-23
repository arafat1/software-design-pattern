package design.patterns.builderpattern;

import org.junit.BeforeClass;
import org.junit.Test;

import static design.patterns.builderpattern.GameLaptop.Builder;
import static design.patterns.builderpattern.AbstractLaptop.Color;
import static design.patterns.builderpattern.AbstractLaptop.Size;
import static org.junit.Assert.*;

public class GameLaptopBuilderTest {

    @BeforeClass
    public static void setUp() throws Exception {
        System.out.println("Executing Builder Pattern -> Type: Creational");
    }

    @Test
    public void gameLaptopTest() {
        Builder gameLaptopBuilder = new Builder(4, 2);
        gameLaptopBuilder.setColor(Color.GREEN);
        gameLaptopBuilder.setSize(Size.LARGE);
        GameLaptop laptop = gameLaptopBuilder.build();

        assertEquals(4, laptop.getGpuMem());
        assertEquals(2, laptop.getFans());
        assertEquals(Color.GREEN, laptop.getColor());
        assertEquals(Size.LARGE, laptop.getSize());
    }
}