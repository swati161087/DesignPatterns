package creationalDesignPattern.singleton.implentation1;

public class Main {
    public static void main(String[] args) {
    Database d1=Database.getInstance();
    d1.a=34;
    Database d2=Database.getInstance();
    RandomClass rc=new RandomClass();
    System.out.println();
    }
}
