package patterns.creational.singleton.eagerInitialization;

import patterns.creational.singleton.CarFactory;

public class EagerInitializedSingleton {

    private static final CarFactory instance = new CarFactory();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}

    public static CarFactory getInstance(){
        return instance;
    }
}
