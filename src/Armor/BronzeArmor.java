package Armor;

public class BronzeArmor extends Armor{
    public BronzeArmor(){
        armorType = ArmorType.HEAVY;
        durability = 20;
        armorName = "Бронзовая броня";
        System.out.println(armorName + " создана!");
    }

    @Override
    public int getDurability() {
        return super.getDurability();
    }
}
