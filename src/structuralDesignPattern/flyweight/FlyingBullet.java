package structuralDesignPattern.flyweight;

public class FlyingBullet {
    private double direction;
    private double speed;
    private double status;
    private Bullet bullet;

    public FlyingBullet setDirection(double direction) {
        this.direction = direction;
        return  this;
    }

    public FlyingBullet setSpeed(double speed) {
        this.speed = speed;
        return  this;
    }

    public FlyingBullet setStatus(double status) {
        this.status = status;
        return this;
    }

    public FlyingBullet setBullet(Bullet bullet) {
        this.bullet = bullet;
        return this;
    }

    public void fireBullet(){
        System.out.println(bullet.getRadius() +" bullet is fired");
    }
}
