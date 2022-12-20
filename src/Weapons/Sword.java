package Weapons;

public class Sword extends Weapon{
    public Sword(){
        weaponType = WeaponType.MELEE;
        maxDamage = 25;
        minDamage = 5;
        weaponName = "Короткий меч";
        System.out.println(weaponName + " создан!");
    }

    @Override
    public int getDamage() {
        return super.getDamage();
    }
}
