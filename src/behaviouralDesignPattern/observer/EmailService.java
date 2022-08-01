package behaviouralDesignPattern.observer;

public class EmailService implements Subscribers{
    @Override
    public void subscribeForEvent(Event e,Producer flipkart) {
        flipkart.registerSubscriber(e,this);
    }

    @Override
    public void listen(Event e,Order o) {
        System.out.println("the event "+e+" has occoured Send Email " + o.getId() + " at "+ o.getShopingSite());
    }
}
