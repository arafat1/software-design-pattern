package design.patterns.factorymethodpattern.burger;

public class BeefBurgerStore extends BurgerStore {
    @Override
    protected void create() {
        System.out.println("Creating Beef Burger ...");
        this.burger = "Beef Burger"; //create beef burger object
    }
}
