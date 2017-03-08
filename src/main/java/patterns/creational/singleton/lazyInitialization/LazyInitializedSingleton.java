package patterns.creational.singleton.lazyInitialization;

import patterns.creational.singleton.CarFactory;

import static java.util.Objects.isNull;

public class LazyInitializedSingleton {

    private static CarFactory instance;

    private LazyInitializedSingleton(){}

    public static CarFactory getInstance(){

        if(isNull(instance)){
            instance = new CarFactory();
        }

        return instance;
    }
}
