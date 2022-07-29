package creationalDesignPattern.factory.simpleFactory;

public class TaxCalculatorFactory {
    public static TaxAlgorithm getTaxAlgorithm(TaxRegime regime)
    {
        switch (regime)
        {
            case NEW:
                return new NewTaxAlgorithm();
             case OLD:
                return new OldTaxAlgorithm();
        }
        throw new RuntimeException("Invalid Regime"+regime);
    }
}
