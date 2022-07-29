package structuralDesignPattern.flyweight;

import java.util.HashMap;

public class BulletRegistry {
    HashMap<BulletType,Bullet> map;
    BulletRegistry(){
        this.map=new HashMap<BulletType,Bullet>();
    }
    public void registerBullet(BulletType type, Bullet bullet){
        map.put(type,bullet);
    }
    public Bullet getBullet(BulletType type)
    {
        return map.get(type);
    }
}
