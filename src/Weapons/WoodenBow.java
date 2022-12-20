package Weapons;

public class WoodenBow extends Weapon{
    public WoodenBow(){
        weaponType = WeaponType.RANGE;
        maxDamage = 25;
        minDamage = 10;
        weaponName = "Деревянный лук";
        System.out.println(weaponName + " создан!");
    }

    @Override
    public int getDamage() {
        return super.getDamage();
    }
}
