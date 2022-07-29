package creationalDesignPattern.prototype.registry;

import java.util.HashMap;

public class BirdRegistry {
    HashMap<String,Bird> map;
    BirdRegistry()
    {
        map=new HashMap<String,Bird>();
    }
    public void registerBird(String name,Bird obj)
    {
        map.put(name,obj);
    }
    public Bird getBird(String name)
    {
        return map.get(name).copy();
    }
}
