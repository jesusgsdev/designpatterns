package patterns.creational.singleton.serialized;

import patterns.creational.singleton.CarFactory;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{

    private static final long serialVersionUID = -7604766932017737115L;

    private static final CarFactory instance = new CarFactory();

    //private constructor to avoid client applications to use constructor
    private SerializedSingleton(){}

    private static class SingletonHelper{
        private static final CarFactory instance = new CarFactory();
    }

    public static CarFactory getInstance(){
        return SingletonHelper.instance;
    }

    protected Object readResolve() {
        return getInstance();
    }

}
