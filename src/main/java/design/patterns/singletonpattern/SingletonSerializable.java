package design.patterns.singletonpattern;

import java.io.Serializable;

public class SingletonSerializable implements Serializable {
    private transient static final SingletonSerializable instance = new SingletonSerializable();
    private transient int accessCount = 0;

    private SingletonSerializable() {}

    public static SingletonSerializable getInstance() {
        return instance;
    }

    public int getAccessCount() {return accessCount;}

    public void accessSingleton() {accessCount++;}

    // necessary for (de)serialization
    private Object readResolve() {
        return instance;
    }
}
