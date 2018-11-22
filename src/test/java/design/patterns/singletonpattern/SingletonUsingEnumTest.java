package design.patterns.singletonpattern;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonUsingEnumTest {

    @BeforeClass
    public static void setUp() throws Exception {
        System.out.println("Executing Singleton Pattern using enum -> Type: Creational");
    }

    @Test
    public void singletonUsingEnumTest() {
        SingletonUsingEnum instance1 = SingletonUsingEnum.INSTANCE;
        SingletonUsingEnum instance2 = SingletonUsingEnum.INSTANCE;

        assertSame(instance1, instance2);

        instance1.accessSingleton();
        instance2.accessSingleton();
        instance2.accessSingleton();

        assertEquals(instance1.getAccessCount(), instance2.getAccessCount());
    }
}