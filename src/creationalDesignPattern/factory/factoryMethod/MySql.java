package creationalDesignPattern.factory.factoryMethod;

public class MySql extends Database{
    @Override
    public Query createQuery(String q) {
        return new MySqlQuery();
    }
}
