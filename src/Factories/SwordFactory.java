package Factories;

import Weapons.*;

public class SwordFactory extends WeaponFactory {
    public static SwordFactory instance;
    private SwordFactory(){
    }
    public static SwordFactory getInstance(){
        if(instance == null) instance = new SwordFactory();
        return instance;
    }

    @Override
    public Weapon create() {
        int rand = 1 + (int)(Math.random() *2);
        if(rand == 1) return new Sword();
        else return new LongSword();
    }
}
