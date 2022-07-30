package behaviouralDesignPattern.strategy;

public class GoogleMaps {
    public void  calculatePath(String from, String to,Mode m)
    {
        PathCalculatorFactory.getPath(m).calculatePath(from,to);
    }
}
