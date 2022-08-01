package behaviouralDesignPattern.observer;

public interface Subscribers {
 void subscribeForEvent(Event e,Producer p);
 void listen(Event e,Order o);
}
