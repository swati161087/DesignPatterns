package structuralDesignPattern.flyweight;

public class Client {
    public static void main(String[] args) {
        BulletRegistry bulletRegistry=new BulletRegistry();
        bulletRegistry.registerBullet(BulletType.FiveMM,new Bullet(5,6,BulletType.FiveMM,new int[5][6]));
        bulletRegistry.registerBullet(BulletType.SixMM,new Bullet(6,7,BulletType.SixMM,new int[5][6]));
        FlyingBullet flyingBullet=new FlyingBullet();
        flyingBullet.setDirection(34).setDirection(67).setSpeed(45).setBullet(bulletRegistry.getBullet(BulletType.FiveMM));
        FlyingBullet flyingBullet1=new FlyingBullet();
        flyingBullet1.setBullet(bulletRegistry.getBullet(BulletType.FiveMM));
        flyingBullet.fireBullet();
        flyingBullet1.fireBullet();
    }
}

