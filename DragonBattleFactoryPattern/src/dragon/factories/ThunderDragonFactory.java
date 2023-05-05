package dragon.factories;

import dragon.DragonFactory;
import dragon.Types.DragonEnum;

public class ThunderDragonFactory implements DragonFactory {

    @Override
    public String elementName() {
        return "THUNDER";
    }

    @Override
    public String CreateSkinColor() {
        return "purple";
    }

    @Override
    public String CreateWings() {
        return "deep purple small wings";
    }

    @Override
    public String CreatePower(int power) {
        int extra = 35;
        String totalPower = String.valueOf((power + extra));
       // System.out.println(( ":" + power + " + " + extra + " ice boost " + "\n" +  " total power:" + (power + extra) ));
        return totalPower;
    }

    @Override
    public String CreateSkinColor1(DragonEnum e) {
        if(e == DragonEnum.Furious)
        {
            return  "velvet purple";
        } else if (e == DragonEnum.Cruel)
        {
            return  "shiny purple";
        }
        else return "light purple";
    }

    @Override
    public int createHP() {
        return 2680;
    }

    @Override
    public int CreateUlti() {
        return 124;
    }
}
