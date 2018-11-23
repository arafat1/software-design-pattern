package design.patterns.factorymethodpattern.burger;

import design.patterns.factorymethodpattern.pizza.ChickenPizzaStore;
import design.patterns.factorymethodpattern.pizza.PizzaStore;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class BeefBurgerStoreTest {

    @BeforeClass
    public static void setUp() throws Exception {
        System.out.println("Executing Factory Method Pattern -> Type: Creational");
    }

    @Test
    public void BeefBurgerFactoryMethodTest() {
        BurgerStore burgerStore = new BeefBurgerStore();
        burgerStore.order();

        assertEquals("Beef Burger", burgerStore.getBurger());
    }
}