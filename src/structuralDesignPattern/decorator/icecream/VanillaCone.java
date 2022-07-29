package structuralDesignPattern.decorator.icecream;

public class VanillaCone implements IcecreamCone{
    IcecreamCone cone;
    VanillaCone(IcecreamCone cone){
        this.cone=cone;
    }
    @Override
    public int getCost() {
        return cone.getCost()+20;
    }

    @Override
    public String getTopings() {
        return cone.getTopings() + " vanilla ";
    }
}
