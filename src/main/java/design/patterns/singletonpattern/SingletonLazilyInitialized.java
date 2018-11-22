package design.patterns.singletonpattern;

public class SingletonLazilyInitialized {
    private volatile static SingletonLazilyInitialized instance;
    private int accessCount = 0;

    private SingletonLazilyInitialized() {}

    public static SingletonLazilyInitialized getInstance() {
        if (instance == null) {
            synchronized (SingletonLazilyInitialized.class) {
                if (instance == null)
                    instance = new SingletonLazilyInitialized();
            }
        }
        return instance;
    }

    public int getAccessCount() {return accessCount;}

    public void accessSingleton() {accessCount++;}

}
