package Warriors;


import Factories.BowFactory;
import Factories.LightArmorFactory;

public class Archer extends Warrior{
    public Archer(){
        name = "Лучник";
        health = 100;
        weapon = BowFactory.getInstance().create();
        armor = LightArmorFactory.getInstance().create();
    }


}
