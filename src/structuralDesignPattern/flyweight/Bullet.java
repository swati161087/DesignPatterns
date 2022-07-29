package structuralDesignPattern.flyweight;

public class Bullet {
    private double radius;
    private double weight;
    private BulletType type;
    private int[][] image;
   Bullet(double radius, double weight, BulletType type, int[][] image){
       this.radius=radius;
       this.weight=weight;
       this.type=type;
       this.image=image;
   }

    public double getRadius() {
        return radius;
    }

    public double getWeight() {
        return weight;
    }

    public BulletType getType() {
        return type;
    }

    public int[][] getImage() {
        return image;
    }
}
