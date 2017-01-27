package patterns.behavioral.strategy;


public class Transport {

    private TransportStrategy transportStrategy;

    public Transport(TransportStrategy transportStrategy) {
        this.transportStrategy = transportStrategy;
    }

    public void setTransportStrategy(TransportStrategy transportStrategy) {
        this.transportStrategy = transportStrategy;
    }

    public void goToTheAirPort(String airport) {
        transportStrategy.goToTheAirPort(airport);
    }

    public void goToLondon(String airport) {
        transportStrategy.goToLondon(airport);
    }
}
