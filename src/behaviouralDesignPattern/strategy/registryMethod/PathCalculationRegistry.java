package behaviouralDesignPattern.strategy.registryMethod;

import java.util.HashMap;

public class PathCalculationRegistry {
    HashMap<Mode,PathCalculationStrategy> map;
    PathCalculationRegistry(){
        this.map=new HashMap<>();
    }
    public void register(Mode m, PathCalculationStrategy path){
        map.put(m,path);
    }
    public PathCalculationStrategy getPath(Mode m)
    {
        return map.get(m);
    }
}
