package creationalDesignPattern.factory.simpleFactory;

public class OldTaxAlgorithm implements TaxAlgorithm{
    @Override
    public double calculateTax(SalaryDetails details)
    {
        return details.getBasePay()*3+details.getHra()*5+details.getLta();
    }
}
