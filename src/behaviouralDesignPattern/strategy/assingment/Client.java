package behaviouralDesignPattern.strategy.assingment;

public class Client {
    public static void main(String[] args) {
        SolutionRegistry registry=new SolutionRegistry();
        registry.register(Method.BruteForce,new BruteForce());
        Problems  p=new RainWaterTapping(registry);
        System.out.println(p.solve(Method.BruteForce));

    }
}
