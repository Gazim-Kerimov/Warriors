package Factories;

import Armor.*;


public class LightArmorFactory extends ArmorFactory{
    public static LightArmorFactory instance;
    private LightArmorFactory(){
    }
    public static LightArmorFactory getInstance(){
        if(instance == null) instance = new LightArmorFactory();
        return instance;
    }

    @Override
    public Armor create() {
        int rand = 1 + (int)(Math.random() *2);
        if(rand == 1) return new LeatherArmor();
        else return new ComposedArmor();
    }
}
