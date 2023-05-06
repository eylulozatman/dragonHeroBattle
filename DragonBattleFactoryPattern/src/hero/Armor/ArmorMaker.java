package hero.Armor;

public class ArmorMaker
{

    public Armor createArmor(int armorChoose)
    {
        Armor armor;
        if (armorChoose == 1)
        {
             armor = new ShinyArmor();
             return armor;
        }
        else if(armorChoose == 2)
        {
            armor = new GoldArmor();
            return armor;
        }
        return null;
    }

}
