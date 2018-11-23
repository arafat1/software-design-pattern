package design.patterns.abstractfactorypattern;

import design.patterns.factorymethodpattern.burger.BurgerStore;
import design.patterns.factorymethodpattern.burger.FishBurgerStore;
import design.patterns.factorymethodpattern.pizza.PizzaStore;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FastFoodFactoryTest {

    @BeforeClass
    public static void setUp() throws Exception {
        System.out.println("Executing Abstract Factory Pattern -> Type: Creational");
    }

    @Test
    public void abstractFactoryTest() {
        AbstractFastFoodFactory foodFactory = new FastFoodFactory();
        BurgerStore fishBurgerStore = foodFactory.getBurgerFactory("Fish");
        PizzaStore veggiePizzaStore = foodFactory.getPizzaFactory("Veggie");

        fishBurgerStore.order();
        veggiePizzaStore.order();

        assertEquals("Fish Burger", fishBurgerStore.getBurger());
        assertEquals("Veggie Pizza", veggiePizzaStore.getPizza());
    }
}