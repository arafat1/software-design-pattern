package design.patterns.abstractfactorypattern;

import design.patterns.factorymethodpattern.burger.BeefBurgerStore;
import design.patterns.factorymethodpattern.burger.BurgerStore;
import design.patterns.factorymethodpattern.burger.FishBurgerStore;
import design.patterns.factorymethodpattern.pizza.ChickenPizzaStore;
import design.patterns.factorymethodpattern.pizza.PizzaStore;
import design.patterns.factorymethodpattern.pizza.VeggiePizzaStore;

public class FastFoodFactory implements AbstractFastFoodFactory{
    @Override
    public PizzaStore getPizzaFactory(String type) {
        switch (type) {
            case "Chicken": return new ChickenPizzaStore();
            case "Veggie":  return new VeggiePizzaStore();
        }
        return null;
    }

    @Override
    public BurgerStore getBurgerFactory(String type) {
        switch (type) {
            case "Beef": return new BeefBurgerStore();
            case "Fish":  return new FishBurgerStore();
        }
        return null;
    }
}
