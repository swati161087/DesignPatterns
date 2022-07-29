package structuralDesignPattern.adapter;

public class Main {
    public static void main(String[] args) {
        Flipkart fl=new Flipkart(new RazorpayAdapter());
       fl.makePaymentViaCC(1233,45,"rerere");
    }
}
