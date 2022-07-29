package creationalDesignPattern.factory.factoryMethod;

public abstract class Database {
    private int host;
    private int port;
    private int type;
    public abstract Query createQuery(String q);
}
