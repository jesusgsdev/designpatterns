package patterns.behavioral.strategy.strategies;


import patterns.behavioral.strategy.TransportStrategy;

public class TaxiTransportStrategy implements TransportStrategy {

    @Override
    public void goToTheAirPort(String airport) {
        System.out.println("I am going to the Airport " + airport + " by Taxi transport from London.");
    }

    @Override
    public void goToLondon(String airport) {
        System.out.println("I am going from the Airport " + airport + " by Taxi transport to London.");
    }
}
