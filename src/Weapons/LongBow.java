package Weapons;

public class LongBow extends Weapon{
    public LongBow(){
        weaponType = WeaponType.RANGE;
        maxDamage = 30;
        minDamage = 20;
        weaponName = "Длинный лук";
        System.out.println(weaponName + " создан!");
    }
}
