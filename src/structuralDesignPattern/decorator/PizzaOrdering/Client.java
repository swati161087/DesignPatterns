package structuralDesignPattern.decorator.PizzaOrdering;

import structuralDesignPattern.decorator.PizzaOrdering.Base.Normal;
import structuralDesignPattern.decorator.PizzaOrdering.Base.ThinCrust;
import structuralDesignPattern.decorator.PizzaOrdering.Topings.Cheese;

public class Client {
    public static void main(String[] args) {
        Pizza p=new Normal();
        System.out.println(p.getCost());
        System.out.println(p.getTopings());
        Pizza p1=new ThinCrust(p);
        Pizza p2=new Cheese(p1);
        Pizza p3=new Normal(p2);
    }
}
