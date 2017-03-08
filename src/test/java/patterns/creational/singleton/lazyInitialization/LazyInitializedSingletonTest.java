package patterns.creational.singleton.lazyInitialization;

import org.junit.Before;
import org.junit.Test;
import patterns.creational.singleton.Car;
import patterns.creational.singleton.CarFactory;
import patterns.creational.singleton.eagerInitialization.EagerInitializedSingleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LazyInitializedSingletonTest {

    private CarFactory firstInstance;
    private CarFactory secondInstance;

    @Before
    public void setUp(){
        firstInstance = LazyInitializedSingleton.getInstance();
        secondInstance = LazyInitializedSingleton.getInstance();
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
