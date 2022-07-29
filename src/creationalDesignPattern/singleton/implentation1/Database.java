package creationalDesignPattern.singleton.implentation1;

public class Database {
    private static Database db;
     int a=23;
    private Database(){

    }
    public static  Database getInstance(){
        if(db==null) {
            db = new Database();
        }
        return db;
    }
}
