package creationalDesignPattern.factory.simpleFactory;

public class NewTaxAlgorithm implements TaxAlgorithm{
    @Override
    public double calculateTax(SalaryDetails details)
    {
        return details.getBasePay()*6+details.getHra()*4+details.getLta();
    }
}

