package Factories;

import Armor.*;

public class HeavyArmorFactory extends ArmorFactory{
    public static HeavyArmorFactory instance;
    private HeavyArmorFactory(){
    }
    public static HeavyArmorFactory getInstance(){
        if(instance == null) instance = new HeavyArmorFactory();
        return instance;
    }

    @Override
    public Armor create() {
        int rand = 1 + (int)(Math.random() *2);
        if(rand == 1) return new SteelArmor();
        else return new BronzeArmor();
    }
}
