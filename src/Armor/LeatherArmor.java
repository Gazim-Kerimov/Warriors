package Armor;

public class LeatherArmor extends Armor{
    public LeatherArmor(){
        armorType = ArmorType.LIGHT;
        durability = 5;
        armorName = "Кожанная броня";
        System.out.println(armorName + " создана!");
    }

    @Override
    public int getDurability() {
        return super.getDurability();
    }
}
