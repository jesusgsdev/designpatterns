package patterns.behavioral.strategy;


public class Transport {

    private TransportStrategy transportStrategy;

    public Transport(TransportStrategy transportStrategy) {
        this.transportStrategy = transportStrategy;
    }

    public void setTransportStrategy(TransportStrategy transportStrategy) {
        this.transportStrategy = transportStrategy;
    }

    public String goToTheAirPort(String airport) {
        return transportStrategy.goToTheAirPort(airport);
    }

    public String goToLondon(String airport) {
        return transportStrategy.goToLondon(airport);
    }
}
