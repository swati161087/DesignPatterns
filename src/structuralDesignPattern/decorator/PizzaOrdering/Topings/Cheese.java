package structuralDesignPattern.decorator.PizzaOrdering.Topings;

import structuralDesignPattern.decorator.PizzaOrdering.Pizza;

public class Cheese extends Topings implements Pizza {
    Pizza p;
    public Cheese(Pizza p){
        this.p=p;
    }
    @Override
    public double getCost() {
        return p.getCost()+20;
    }

    @Override
    public String getTopings() {
        return p.getTopings()+" Cheese topings ";
    }
}
