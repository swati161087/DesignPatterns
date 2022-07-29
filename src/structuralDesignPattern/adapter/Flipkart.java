package structuralDesignPattern.adapter;

public class Flipkart {
    private PaymentGateway paymentGateway;
    Flipkart(PaymentGateway paymentGateway)
    {
        this.paymentGateway=paymentGateway;
    }
    public void makePaymentViaCC(int cc,int cvv, String expDate){
    Long transactionId=paymentGateway.makePayment(cc,cvv,expDate);
    while (!paymentGateway.getTransactionStatus(transactionId).equals(PaymentStatus.SUCCESS))
    {
        System.out.println("Waiting");
    }
    }
}
