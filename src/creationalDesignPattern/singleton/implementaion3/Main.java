package creationalDesignPattern.singleton.implementaion3;

public class Main {
    public static void main(String[] args) {
    Database d1= Database.getInstance();
    Database d2= Database.getInstance();
    RandomClass rc=new RandomClass();
    System.out.println();
    }
}
