package Armor;

public class ComposedArmor extends Armor{
    public ComposedArmor(){
        armorType = ArmorType.LIGHT;
        durability = 10;
        armorName = "Композитная броня";
        System.out.println(armorName + " создана!");
    }
    @Override
    public int getDurability() {
        return super.getDurability();
    }
}
