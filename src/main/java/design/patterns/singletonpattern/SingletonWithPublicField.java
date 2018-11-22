package design.patterns.singletonpattern;

public class SingletonWithPublicField {
    public static final SingletonWithPublicField instance = new SingletonWithPublicField();
    private int accessCount = 0;

    private SingletonWithPublicField() {}

    public int getAccessCount() {return accessCount;}

    public void accessSingleton() {accessCount++;}

}
