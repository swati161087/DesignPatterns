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
    public void notify(Event e,Order o) {

        for(Subscribers s:map.get(e))
        {
            s.listen(e,o);
        }
    }

    public void placeOrder(){
        Order o=new Order((int)(Math.random()*100),"FlipKart");
        notify(Event.PLACEORDER,o);
    }
}

