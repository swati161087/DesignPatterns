package behaviouralDesignPattern.observer;

public class EmailService implements Subscribers{
    @Override
    public void subscribeForEvent(Event e,Producer flipkart) {
        flipkart.registerSubscriber(e,this);
    }

    @Override
    public void listen(Event e) {
        System.out.println("the event "+e+" has occoured Send Email");
    }
}
