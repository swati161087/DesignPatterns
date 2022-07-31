package behaviouralDesignPattern.strategy.registryMethod;

public class Client {
    public static void main(String[] args) {
        PathCalculationRegistry registry=new PathCalculationRegistry();
        registry.register(Mode.Car,new CarPathCalculationStrategy());
        registry.register(Mode.Walk,new WalkPathCalculationStragtegy());
        GoogleMaps googleMaps=new GoogleMaps(registry);
        googleMaps.calculatePath("baroda","jaipur", Mode.Car);
    }
}
