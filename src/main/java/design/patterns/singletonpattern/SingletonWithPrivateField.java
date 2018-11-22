package design.patterns.singletonpattern;

public class SingletonWithPrivateField {
    private static final SingletonWithPrivateField instance = new SingletonWithPrivateField();
    private int accessCount = 0;

    private SingletonWithPrivateField() {}

    public static SingletonWithPrivateField getInstance() {
        return instance;
    }

    public int getAccessCount() {return accessCount;}

    public void accessSingleton() {accessCount++;}
}
