package patterns.behavioral.strategy.strategies;


import patterns.behavioral.strategy.TransportStrategy;

public class TaxiTransportStrategy implements TransportStrategy {

    @Override
    public String goToTheAirPort(String airport) {
        return "I am going to the Airport " + airport + " by Taxi transport from London.";
    }

    @Override
    public String goToLondon(String airport) {
        return "I am going from the Airport " + airport + " by Taxi transport to London.";
    }
}
