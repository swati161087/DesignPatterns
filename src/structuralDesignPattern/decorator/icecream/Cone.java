package structuralDesignPattern.decorator.icecream;

public class Cone implements IcecreamCone{
    @Override
    public int getCost() {
        return 10;
    }

    @Override
    public String getTopings() {
        return " Cone ";
    }
}
