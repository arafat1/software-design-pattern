package design.patterns.singletonpattern;

public enum SingletonUsingEnum {
    INSTANCE;

    private int accessCount = 0;

    public int getAccessCount() {
        return accessCount;
    }

    public void accessSingleton() {accessCount++;}
}
