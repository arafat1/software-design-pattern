package design.patterns.singletonpattern;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonWithPublicFieldTest {
    private SingletonWithPublicField instance;

    @BeforeClass
    public static void setUp() throws Exception {
        System.out.println("Executing Singleton Pattern with a public field -> Type: Creational");
    }

    @Test
    public void singletonWithPublicFieldTest() {
        SingletonWithPublicField instance1 = SingletonWithPublicField.instance;
        SingletonWithPublicField instance2 = SingletonWithPublicField.instance;

        assertSame(instance1, instance2);

        instance1.accessSingleton();
        instance2.accessSingleton();
        instance2.accessSingleton();

        assertEquals(instance1.getAccessCount(), instance2.getAccessCount());
    }
}