package behaviouralDesignPattern.strategy;

public class PathCalculatorFactory {
    public static PathCalculationStrategy getPath(Mode m){
       switch (m)
       {
           case Car : return new CarPathCalculationStrategy();
           case Walk : return new WalkPathCalculationStragtegy();
       }
       throw new RuntimeException("Incorrect mode"+m);
    }
}
