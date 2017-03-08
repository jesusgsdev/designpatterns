package patterns.creational.singleton.threadSafe;

import patterns.creational.singleton.CarFactory;

import static java.util.Objects.isNull;

public class ThreadSafeSingleton {

    private static CarFactory instance;

    private ThreadSafeSingleton(){}

    public static synchronized CarFactory getInstance(){

        if(isNull(instance)){
            instance = new CarFactory();
        }

        return instance;
    }
}
