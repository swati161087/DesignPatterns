package structuralDesignPattern.decorator.PizzaOrdering.Base;

import structuralDesignPattern.decorator.PizzaOrdering.Pizza;

public class Normal extends Base implements Pizza {
    Pizza p;
    public Normal(){

    }
    public Normal(Pizza p){
        this.p=p;
        if(p.getTopings().contains("topings")){
            throw new RuntimeException("can not make sandwich pizza");
        }
    }
    @Override
    public double getCost() {
        if(p!=null){
            return p.getCost()+13;
        }
       return 13;
    }

    @Override
    public String getTopings() {
        if(p!=null){
            return p.getTopings()+" normal crust ";
        }
        return "normal crust";
    }
}
