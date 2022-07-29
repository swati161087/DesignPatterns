package structuralDesignPattern.adapter;

public class RazorpayAdapter implements PaymentGateway{
   private Razorpay rp=new Razorpay();
    @Override
    public Long makePayment(int cc, int cvv, String expDate) {
        return (long)rp.createPaymentbycc(cc,cvv,expDate);
    }

    @Override
    public PaymentStatus getTransactionStatus(Long transactionIn) {
        rp.getPaymentStatus(Integer.parseInt(String.valueOf((int)transactionIn.longValue())));
        return PaymentStatus.SUCCESS;
    }
}
