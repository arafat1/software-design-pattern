package design.patterns.abstractfactorypattern;

import design.patterns.abstractfactorypattern.exception.FoodTypeNotFoundException;
import design.patterns.factorymethodpattern.burger.BurgerStore;
import design.patterns.factorymethodpattern.pizza.PizzaStore;

public interface AbstractFastFoodFactory {

    PizzaStore getPizzaFactory(FoodTypes type) throws FoodTypeNotFoundException;

    BurgerStore getBurgerFactory(FoodTypes type) throws FoodTypeNotFoundException;
}
