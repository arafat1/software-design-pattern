package design.patterns.builderpattern;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static design.patterns.builderpattern.PersonalLaptop.Builder;
import static design.patterns.builderpattern.PersonalLaptop.Suite;
import static design.patterns.builderpattern.AbstractLaptop.Color;
import static design.patterns.builderpattern.AbstractLaptop.Size;
import static org.junit.Assert.*;

public class PersonalLaptopTest {

    @BeforeClass
    public static void setUp() throws Exception {
        System.out.println("Executing Builder Pattern -> Type: Creational");
    }

    @Test
    public void personalLaptopTest() {
        Builder personalLaptopBuilder = new Builder(Suite.PREMIUM);
        personalLaptopBuilder.setColor(Color.BLACK);

        PersonalLaptop laptop = personalLaptopBuilder.build();

        assertEquals(Suite.PREMIUM, laptop.getOfficeSuite());
        assertEquals(Color.BLACK, laptop.getColor());
        assertEquals(Size.MEDIUM, laptop.getSize());
    }
}