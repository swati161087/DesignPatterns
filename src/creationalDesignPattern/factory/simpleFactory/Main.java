package creationalDesignPattern.factory.simpleFactory;

public class Main {
    public static void main(String[] args) {
        TaxRegime regime=TaxRegime.OLD;
       try {
           SalaryDetails details=new SalaryDetails();
           details.setBasePay(123);
           details.setHra(3454);
           details.setLta(78);
           double tax=TaxCalculator.calculateTax(TaxRegime.RANDOM,details);
           System.out.println(tax);
       }
       catch (Exception error)
       {
           System.out.println(error.getMessage());
       }
    }
}
