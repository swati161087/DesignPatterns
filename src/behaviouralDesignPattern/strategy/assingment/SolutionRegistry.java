package behaviouralDesignPattern.strategy.assingment;

import java.util.HashMap;

public class SolutionRegistry {
    private HashMap<Method,Solution> map;
    SolutionRegistry(){
        map=new HashMap<>();
    }
    public void register(Method m, Solution s){
        map.put(m,s);
    }
    public Solution getSolution(Method m)
    {
       return map.get(m);
    }
}
