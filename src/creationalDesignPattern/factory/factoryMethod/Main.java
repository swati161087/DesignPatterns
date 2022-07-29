package creationalDesignPattern.factory.factoryMethod;

public class Main {
    public static void main(String[] args) {
        Database db=new MySql();
        Query q=db.createQuery("select * form table 1");
        q.executeCommand();
    }
}
