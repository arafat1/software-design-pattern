package design.patterns.factorymethodpattern.pizza;

public abstract class PizzaStore {
    protected String pizza;

    public String getPizza() {
        return pizza;
    }

    public String order() {
        System.out.println("Prepare the dough");
        System.out.println("Spread sauce and cheese");
        create();
        return pizza;
    }

    protected abstract void create();
}
