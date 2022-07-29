package structuralDesignPattern.decorator.PizzaOrdering.Base;

import structuralDesignPattern.decorator.PizzaOrdering.Pizza;

public class ThinCrust extends Base implements Pizza {
    Pizza p;
    public ThinCrust(){

    }
    public ThinCrust(Pizza p){
        this.p=p;
    }
    @Override
    public double getCost() {
        return p.getCost()+13;

    }

    @Override
    public String getTopings() {
        return p.getTopings()+" ThinCrust crust ";
    }
}
