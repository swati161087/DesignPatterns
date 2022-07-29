package structuralDesignPattern.decorator.PizzaOrdering.Base;

import structuralDesignPattern.decorator.PizzaOrdering.Pizza;

public class Pan extends Base implements Pizza {
    Pizza p;
    public Pan(){

    }
    public Pan(Pizza p){
        this.p=p;
    }
    @Override
    public double getCost() {
        return p.getCost()+13;

    }

    @Override
    public String getTopings() {
        return p.getTopings()+" Pan crust ";
    }
}