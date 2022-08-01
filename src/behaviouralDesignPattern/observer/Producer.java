package behaviouralDesignPattern.observer;

import java.util.List;

public interface Producer {
    public void registerSubscriber(Event e, Subscribers s);
    public void notify(Event e);
}
