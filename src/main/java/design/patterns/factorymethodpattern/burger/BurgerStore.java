package design.patterns.factorymethodpattern.burger;

public abstract class BurgerStore {
    protected String burger;

    public String getBurger() {
        return burger;
    }

    public String order() {
        System.out.println("Prepare the dough");
        System.out.println("Bake the buns");
        create();
        return burger;
    }

    protected abstract void create();
}
