package behaviouralDesignPattern.strategy.factoryMethod;

public class Client {
    public static void main(String[] args) {
        GoogleMaps googleMaps=new GoogleMaps();
        googleMaps.calculatePath("baroda","jaipur",Mode.Bike);
    }
}
