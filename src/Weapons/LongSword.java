package Weapons;

public class LongSword extends Weapon{
    public LongSword(){
        weaponType = WeaponType.MELEE;
        maxDamage = 30;
        minDamage = 25;
        weaponName = "Длинный меч";
        System.out.println(weaponName + " создан!");
    }

    @Override
    public int getDamage() {
        return super.getDamage();
    }
}
