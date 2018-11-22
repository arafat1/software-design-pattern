package design.patterns.singletonpattern;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonLazilyInitializedTest {

    @BeforeClass
    public static void setUp() throws Exception {
        System.out.println("Executing Singleton Pattern with lazily initialization -> Type: Creational");
    }

    @Test
    public void singletonLazilyInitializedTest() {
        SingletonLazilyInitialized instance1 = SingletonLazilyInitialized.getInstance();
        SingletonLazilyInitialized instance2 = SingletonLazilyInitialized.getInstance();

        assertSame(instance1, instance2);

        instance1.accessSingleton();
        instance2.accessSingleton();
        instance2.accessSingleton();

        assertEquals(instance1.getAccessCount(), instance2.getAccessCount());
    }
}