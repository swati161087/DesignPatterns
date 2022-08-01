package behaviouralDesignPattern.observer;

import java.util.List;

public interface Producer {
     void registerSubscriber(Event e, Subscribers s);
     void notify(Event e,Order o);
}
