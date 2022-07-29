package structuralDesignPattern.adapter;

public interface PaymentGateway {
    public Long makePayment(int cc,int cvv, String expDate);
    public PaymentStatus getTransactionStatus(Long transactionIn);
}
