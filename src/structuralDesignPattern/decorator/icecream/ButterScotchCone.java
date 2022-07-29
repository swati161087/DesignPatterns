package structuralDesignPattern.decorator.icecream;

public class ButterScotchCone implements IcecreamCone
{
    IcecreamCone cone;
    ButterScotchCone(IcecreamCone cone){
        this.cone=cone;
    }
    @Override
    public int getCost() {
        return cone.getCost()+20;
    }

    @Override
    public String getTopings() {
        return cone.getTopings() + " butterscotch ";
    }
}
