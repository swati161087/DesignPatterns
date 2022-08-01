package behaviouralDesignPattern.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flipkart implements Producer{
   HashMap<Event, List<Subscribers>> map;
    Flipkart(){
       map=new HashMap<>();
    }

    @Override
    public void registerSubscriber(Event e, Subscribers s) {
        if(!map.containsKey(e))
        {
            map.put(e,new ArrayList<>());
        }
        map.get(e).add(s);
    }

    @Override
    public void notify(Event e) {

        for(Subscribers s:map.get(e))
        {
            s.listen(e);
        }
    }

    public void placeOrder(){
        notify(Event.PLACEORDER);
    }
}

