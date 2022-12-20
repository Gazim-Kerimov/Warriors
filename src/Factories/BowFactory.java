package Factories;

import Weapons.LongBow;
import Weapons.Weapon;
import Weapons.WoodenBow;

public class BowFactory extends WeaponFactory {
    public static BowFactory instance;
    private BowFactory(){
    }
    public static BowFactory getInstance(){
        if(instance == null) instance = new BowFactory();
        return instance;
    }

    @Override
    public Weapon create() {
        int rand = 1 + (int)(Math.random() *2);
        if(rand == 1) return new WoodenBow();
        else return new LongBow();
    }
}
