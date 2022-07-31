package behaviouralDesignPattern.strategy.registryMethod;

public class GoogleMaps {
    PathCalculationRegistry registry;
    GoogleMaps(PathCalculationRegistry registry){
        this.registry=registry;
    }
    public void  calculatePath(String from, String to, Mode m)
    {
        registry.getPath(m).calculatePath(from,to);
    }
}
