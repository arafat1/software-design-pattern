package design.patterns.abstractfactorypattern;

import design.patterns.abstractfactorypattern.exception.FoodTypeNotFoundException;
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
    public void abstractFactoryTest() throws FoodTypeNotFoundException {
        AbstractFastFoodFactory foodFactory = new FastFoodFactory();
        BurgerStore fishBurgerStore = foodFactory.getBurgerFactory(FoodTypes.FISH);
        PizzaStore veggiePizzaStore = foodFactory.getPizzaFactory(FoodTypes.VEGGIE);

        fishBurgerStore.order();
        veggiePizzaStore.order();

        assertEquals("Fish Burger", fishBurgerStore.getBurger());
        assertEquals("Veggie Pizza", veggiePizzaStore.getPizza());
    }
}