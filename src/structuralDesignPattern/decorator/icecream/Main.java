package structuralDesignPattern.decorator.icecream;

public class Main {
    public static void main(String[] args) {
        IcecreamCone cone=new Cone();
        IcecreamCone vanillacone=new VanillaCone(cone);
        System.out.println(vanillacone.getCost());
        System.out.println(vanillacone.getTopings());
        IcecreamCone butterscotch=new ButterScotchCone(vanillacone);
        System.out.println(butterscotch.getCost());
        System.out.println(butterscotch.getTopings());
        IcecreamCone vanilla2=new VanillaCone(butterscotch);
        System.out.println(vanilla2.getCost());
        System.out.println(vanilla2.getTopings());
    }
}
