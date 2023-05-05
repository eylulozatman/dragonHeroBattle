package dragon.factories;

import dragon.DragonFactory;
import dragon.Types.DragonEnum;

public class IceDragonFactory implements DragonFactory {

    @Override
    public String elementName() {
        return "ICE";
    }

    @Override
    public String CreateSkinColor() {
        return "blue";
    }

    @Override
    public String CreateWings() {
        return "snowy wings ";
    }

    @Override
    public String CreatePower(int power) {
        int extra = 40;
        String totalPower = String.valueOf((power + extra));
      //  System.out.println(( ":" + power + " + " + extra + " ice boost " + "\n" +  " total power:" + (power + extra) ));
        return totalPower;
    }

    @Override
    public String CreateSkinColor1(DragonEnum e) {
        if(e == DragonEnum.Furious)
        {
            return  " velvet blue ";
        } else if (e == DragonEnum.Cruel)
        {
            return  " shiny blue ";
        }
        else return " ice blue ";
    }

    @Override
    public int createHP() {
        return 2400;
    }

    @Override
    public int CreateUlti()
    {
        return 122;
    }
}
