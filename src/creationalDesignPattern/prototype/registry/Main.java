package creationalDesignPattern.prototype.registry;

public class Main {
    public static void main(String[] args) {
//        List<Bird> birds=List.of(new Crow(),new Sprarow());
//        List<Bird> children=new ArrayList<>();
//        for(Bird parent:birds)
//        {
//            children.add(parent.copy());
//        }
        Crow c=new Crow();
        c.setSound(34);
        c.setColor("red");
        c.setName("pergion");
        c.setWeight(34);
        Crow nc=c.copy();
        BirdRegistry brg=new BirdRegistry();
        brg.registerBird("goodcrow",c);
        brg.registerBird("blueCrow", new Crow());
        brg.registerBird("bird",new Bird());
       Crow crow= (Crow)brg.getBird("blueCrow");
    }
}
