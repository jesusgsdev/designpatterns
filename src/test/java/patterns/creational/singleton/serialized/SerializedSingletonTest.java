package patterns.creational.singleton.serialized;

import org.junit.Before;
import org.junit.Test;
import patterns.creational.singleton.Car;
import patterns.creational.singleton.CarFactory;

import java.io.Serializable;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SerializedSingletonTest implements Serializable{

    private CarFactory firstInstance;
    private CarFactory secondInstance;

    @Before
    public void setUp(){
        firstInstance = SerializedSingleton.getInstance();
        secondInstance = SerializedSingleton.getInstance();
    }

    @Test
    public void when_2InstancesRequired_Then_BothAreThemSame(){
        assertEquals(firstInstance, secondInstance);
        assertTrue(firstInstance == secondInstance);
    }

    @Test
    public void when_2InstancesRequired_Then_BothCountersAreTheSame(){
        Car car1 = firstInstance.create();
        Car car2 = secondInstance.create();

        assertEquals(firstInstance.getNumberOfCarsCreated(), secondInstance.getNumberOfCarsCreated());
    }

}
