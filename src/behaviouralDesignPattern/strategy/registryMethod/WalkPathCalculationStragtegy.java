package behaviouralDesignPattern.strategy.registryMethod;

public class WalkPathCalculationStragtegy implements PathCalculationStrategy {
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("I am walking");
    }
}
