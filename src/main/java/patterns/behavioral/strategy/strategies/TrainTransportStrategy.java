package patterns.behavioral.strategy.strategies;


import patterns.behavioral.strategy.TransportStrategy;

public class TrainTransportStrategy implements TransportStrategy {

    @Override
    public String goToTheAirPort(String airport) {
        return "I am going to the Airport " + airport + " by Train transport from London.";
    }

    @Override
    public String goToLondon(String airport) {
        return "I am going from the Airport " + airport + " by Train transport to London.";
    }
}
