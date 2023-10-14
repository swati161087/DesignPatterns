package creationalDesignPattern.singleton.implementaion3;

public class Database {
  private static Database db;

  private Database(){

  }
  public static  Database getInstance(){
        if(db==null) {
                  synchronized(Database.class){
                      if(db==null)
                      {
                          db = new Database();
                      }
                  }
                }
    return db;
  }
}

