package creationalDesignPattern.prototype.registry;

public class Sprarow extends Bird{
    private int noOfLegs;
    Sprarow(){
    super();
    }
    private Sprarow(Sprarow old)
    {
       super();

    }
    public Sprarow copy(){
        Sprarow s=new Sprarow();
     return s;
    }
}
