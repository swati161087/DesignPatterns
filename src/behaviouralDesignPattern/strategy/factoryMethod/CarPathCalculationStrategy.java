package behaviouralDesignPattern.strategy.factoryMethod;

public class CarPathCalculationStrategy implements PathCalculationStrategy{
    @Override
    public void calculatePath(String from, String to) {
        System.out.println("I am driving car form " +from+" to "+to );
    }
}
