package design.patterns.factorymethodpattern.pizza;

public class ChickenPizzaStore extends PizzaStore {
    @Override
    protected void create() {
        System.out.println("Creating Chicken Pizza ...");
        this.pizza = "Chicken Pizza"; //create chicken pizza object
    }
}
