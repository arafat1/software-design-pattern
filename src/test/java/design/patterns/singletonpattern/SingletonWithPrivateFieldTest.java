package design.patterns.singletonpattern;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonWithPrivateFieldTest {

    @BeforeClass
    public static void setUp() throws Exception {
        System.out.println("Executing Singleton Pattern with a private field -> Type: Creational");
    }

    @Test
    public void singletonWithPrivateFieldTest() {
        SingletonWithPrivateField instance1 = SingletonWithPrivateField.getInstance();
        SingletonWithPrivateField instance2 = SingletonWithPrivateField.getInstance();

        assertSame(instance1, instance2);

        instance1.accessSingleton();
        instance2.accessSingleton();
        instance2.accessSingleton();

        assertEquals(instance1.getAccessCount(), instance2.getAccessCount());
    }
}