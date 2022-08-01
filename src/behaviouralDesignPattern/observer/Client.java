package behaviouralDesignPattern.observer;

public class Client {
    public static void main(String[] args) {
        Flipkart flipkart=new Flipkart();
        Amazon amazon=new Amazon();
        flipkart.registerSubscriber(Event.PLACEORDER,new EmailService());
        Subscribers inventoryService=new InventoryService();
        // registered same object for 2 different events.
        inventoryService.subscribeForEvent(Event.PLACEORDER,flipkart);
        inventoryService.subscribeForEvent(Event.PLACEORDER,amazon);
        flipkart.placeOrder();
        amazon.placeOrder();
    }
}
