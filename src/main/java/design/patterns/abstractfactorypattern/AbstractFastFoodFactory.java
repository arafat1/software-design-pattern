package design.patterns.abstractfactorypattern;

import design.patterns.factorymethodpattern.burger.BurgerStore;
import design.patterns.factorymethodpattern.pizza.PizzaStore;

public interface AbstractFastFoodFactory {

    PizzaStore getPizzaFactory(String type);

    BurgerStore getBurgerFactory(String type);
}
