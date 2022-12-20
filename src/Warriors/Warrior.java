package Warriors;

import Armor.Armor;
import Weapons.Weapon;

public abstract class Warrior implements Attack {
    String name;
    Weapon weapon;
    Armor armor;
    int health;
    public boolean isAlive = true;
    public int getHealth(){
        return health;
    }

    public String getName() {
        return name;
    }

    @Override
    public void attack(Warrior warrior) {
        int damage = weapon.getDamage();
        if(damage > warrior.armor.getDurability()){
            System.out.println(this.name + " поразил " + warrior.name + " оружием: " +
                    this.weapon.getWeaponName() +". Нанесенный урон: " + damage);
            warrior.health -= damage - warrior.armor.getDurability();
            aliveCheck(warrior);
        }
        else System.out.println("Атака " + name + " не пробила броню противника");
    }

    public void aliveCheck(Warrior warrior){
        if(warrior.getHealth() <= 0){
            warrior.isAlive = false;
        }
    }
}
