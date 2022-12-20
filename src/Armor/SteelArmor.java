package Armor;

public class SteelArmor extends Armor{
    public SteelArmor(){
        armorType = ArmorType.HEAVY;
        durability = 15;
        armorName = "Стальная броня";
        System.out.println(armorName + " создана!");
    }

    @Override
    public int getDurability() {
        return super.getDurability();
    }
}
