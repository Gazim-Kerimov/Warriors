package Warriors;

import Factories.HeavyArmorFactory;
import Factories.SwordFactory;

public class Swordsman extends Warrior{
    public Swordsman(){
        name = "Мечник";
        health = 100;
        weapon = SwordFactory.getInstance().create();
        armor = HeavyArmorFactory.getInstance().create();
    }
}
