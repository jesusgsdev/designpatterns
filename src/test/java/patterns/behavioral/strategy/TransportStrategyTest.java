package patterns.behavioral.strategy;

import org.junit.Test;
import patterns.behavioral.strategy.strategies.BusTransportStrategy;
import patterns.behavioral.strategy.strategies.TaxiTransportStrategy;
import patterns.behavioral.strategy.strategies.TrainTransportStrategy;
import patterns.behavioral.strategy.strategies.UberTransportStrategy;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TransportStrategyTest {

    @Test
    public void when_UsingTrain_Then_TheMessageIsTrainRelated(){
        TransportStrategy transportStrategy = new TrainTransportStrategy();

        Transport transport = new Transport(transportStrategy);

        String goingToTheAirportMessage = transport.goToTheAirPort("Gatwick");
        String goingToLondonMessage = transport.goToLondon("Heathrow");

        assertThat(goingToTheAirportMessage, is("I am going to the Airport Gatwick by Train transport from London."));
        assertThat(goingToLondonMessage, is("I am going from the Airport Heathrow by Train transport to London."));
    }

    @Test
    public void when_UsingTaxi_Then_TheMessageIsTrainRelated(){
        TransportStrategy transportStrategy = new TaxiTransportStrategy();

        Transport transport = new Transport(transportStrategy);

        String goingToTheAirportMessage = transport.goToTheAirPort("Gatwick");
        String goingToLondonMessage = transport.goToLondon("Heathrow");

        assertThat(goingToTheAirportMessage, is("I am going to the Airport Gatwick by Taxi transport from London."));
        assertThat(goingToLondonMessage, is("I am going from the Airport Heathrow by Taxi transport to London."));
    }

    @Test
    public void when_UsingBus_Then_TheMessageIsTrainRelated(){
        TransportStrategy transportStrategy = new BusTransportStrategy();

        Transport transport = new Transport(transportStrategy);

        String goingToTheAirportMessage = transport.goToTheAirPort("Gatwick");
        String goingToLondonMessage = transport.goToLondon("Heathrow");

        assertThat(goingToTheAirportMessage, is("I am going to the Airport Gatwick by Bus transport from London."));
        assertThat(goingToLondonMessage, is("I am going from the Airport Heathrow by Bus transport to London."));
    }

    @Test
    public void when_UsingUber_Then_TheMessageIsTrainRelated(){
        TransportStrategy transportStrategy = new UberTransportStrategy();

        Transport transport = new Transport(transportStrategy);

        String goingToTheAirportMessage = transport.goToTheAirPort("Gatwick");
        String goingToLondonMessage = transport.goToLondon("Heathrow");

        assertThat(goingToTheAirportMessage, is("I am going to the Airport Gatwick by Uber transport from London."));
        assertThat(goingToLondonMessage, is("I am going from the Airport Heathrow by Uber transport to London."));
    }
}
