package design.patterns.abstractfactorypattern.exception;

public class FoodTypeNotFoundException extends Exception {

    public FoodTypeNotFoundException(String msg) {
        super("Food Type "+msg+" Not Found");
    }
}
