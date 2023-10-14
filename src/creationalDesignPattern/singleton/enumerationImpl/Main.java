public class Main {
  public static void main(String[] args){
        Singleton singleton=Singleton.Instance;
   singleton.setValue(34);
    System.out.println(singleton.getValue());
  }}