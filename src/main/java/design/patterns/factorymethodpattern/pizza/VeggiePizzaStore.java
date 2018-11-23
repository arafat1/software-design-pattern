package design.patterns.factorymethodpattern.pizza;

public class VeggiePizzaStore extends PizzaStore {
    @Override
    protected void create() {
        System.out.println("Creating Veggie Pizza ...");
        this.pizza = "Veggie Pizza"; //create veggie pizza object
    }
}
