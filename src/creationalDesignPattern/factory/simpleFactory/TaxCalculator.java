package creationalDesignPattern.factory.simpleFactory;

public class TaxCalculator {
    public static double calculateTax(TaxRegime regime,SalaryDetails details)
    {
       return  TaxCalculatorFactory.getTaxAlgorithm(regime).calculateTax(details);
    }
}
