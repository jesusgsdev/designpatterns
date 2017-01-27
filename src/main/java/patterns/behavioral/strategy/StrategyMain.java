package patterns.behavioral.strategy;


import patterns.behavioral.strategy.strategies.BusTransportStrategy;
import patterns.behavioral.strategy.strategies.TaxiTransportStrategy;
import patterns.behavioral.strategy.strategies.TrainTransportStrategy;
import patterns.behavioral.strategy.strategies.UberTransportStrategy;

public class StrategyMain {

    public static void main(String args[]){
        //I am creating a Train strategy to use the Train
        TransportStrategy transportStrategyByTrain = new TrainTransportStrategy();
        Transport transport = new Transport(transportStrategyByTrain);
        transport.goToTheAirPort("Gatwick");
        transport.goToLondon("Heathrow");

        //I am creating a Taxi strategy to use the Train
        TransportStrategy transportStrategyByTaxi = new TaxiTransportStrategy();
        //I am updating the existing strategy
        transport.setTransportStrategy(transportStrategyByTaxi);
        transport.goToTheAirPort("Gatwick");
        transport.goToLondon("Heathrow");

        //I am creating a Taxi strategy to use the Train
        TransportStrategy transportStrategyByBus = new BusTransportStrategy();
        transport.setTransportStrategy(transportStrategyByBus);
        transport.goToTheAirPort("Gatwick");
        transport.goToLondon("Heathrow");

        //I am creating a Taxi strategy to use the Train
        TransportStrategy transportStrategyByUber = new UberTransportStrategy();
        transport.setTransportStrategy(transportStrategyByUber);
        transport.goToTheAirPort("Gatwick");
        transport.goToLondon("Heathrow");
    }

}
