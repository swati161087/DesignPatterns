package creationalDesignPattern.singleton.implementaion2;

public class Database {
    private static Database db=new Database();
    private Database(){

    }
    public static  Database getInstance(){
        return db;
    }
}
