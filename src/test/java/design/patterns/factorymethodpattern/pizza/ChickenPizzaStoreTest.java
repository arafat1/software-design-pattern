package design.patterns.factorymethodpattern.pizza;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenPizzaStoreTest {

    @BeforeClass
    public static void setUp() throws Exception {
        System.out.println("Executing Factory Method Pattern -> Type: Creational");
    }

    @Test
    public void chickenPizzaFactoryMethodTest() {
        PizzaStore pizzaStore = new ChickenPizzaStore();
        pizzaStore.order();

        assertEquals("Chicken Pizza", pizzaStore.getPizza());
    }
}