package behaviouralDesignPattern.strategy.assingment;

public class RainWaterTapping implements Problems{
    SolutionRegistry registry;
    RainWaterTapping(SolutionRegistry registry){
        this.registry=registry;
    }
    @Override
    public String solve(Method m) {
        return registry.getSolution(m).code();
    }

}
