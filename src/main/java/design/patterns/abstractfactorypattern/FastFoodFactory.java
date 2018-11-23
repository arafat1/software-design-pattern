package design.patterns.abstractfactorypattern;

import design.patterns.abstractfactorypattern.exception.FoodTypeNotFoundException;
import design.patterns.factorymethodpattern.burger.BeefBurgerStore;
import design.patterns.factorymethodpattern.burger.BurgerStore;
import design.patterns.factorymethodpattern.burger.FishBurgerStore;
import design.patterns.factorymethodpattern.pizza.ChickenPizzaStore;
import design.patterns.factorymethodpattern.pizza.PizzaStore;
import design.patterns.factorymethodpattern.pizza.VeggiePizzaStore;

public class FastFoodFactory implements AbstractFastFoodFactory{
    @Override
    public PizzaStore getPizzaFactory(FoodTypes type) throws FoodTypeNotFoundException {
        switch (type) {
            case CHICKEN: return new ChickenPizzaStore();
            case VEGGIE:  return new VeggiePizzaStore();
        }
        throw new FoodTypeNotFoundException(type.toString());
    }

    @Override
    public BurgerStore getBurgerFactory(FoodTypes type) throws FoodTypeNotFoundException {
        switch (type) {
            case BEEF: return new BeefBurgerStore();
            case FISH:  return new FishBurgerStore();
        }
        throw new FoodTypeNotFoundException(type.toString());
    }
}
