package design.patterns.factorymethodpattern.burger;

public class FishBurgerStore extends BurgerStore{
    @Override
    protected void create() {
        System.out.println("Creating Fish Burger ...");
        this.burger = "Fish Burger"; //create fish burger object
    }
}
