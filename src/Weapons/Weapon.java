package Weapons;

public abstract class Weapon {
    String weaponName;
    WeaponType weaponType;
    int maxDamage;
    int minDamage;

    public int getDamage() {
        int damage = minDamage + (int)(Math.random() * maxDamage);
        return damage;
    }

    public String getWeaponName() {
        return weaponName;
    }
}
