package behaviouralDesignPattern.observer;

public class Order {
    private final int id;
    private final String shopingSite;
    Order(int id,String shopingSite)
    {
        this.id=id;
        this.shopingSite=shopingSite;
    }

    public int getId() {
        return id;
    }

    public String getShopingSite() {
        return shopingSite;
    }
}
