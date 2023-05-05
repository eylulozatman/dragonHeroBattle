package dragon.factories;

import dragon.DragonFactory;
import dragon.Types.Dragon;
import dragon.Types.DragonEnum;
import dragon.Types.FuriousDragon;

import java.text.ParseException;

public class FireDragonFactory implements DragonFactory {


    @Override
    public String CreateSkinColor1(DragonEnum e) {
       if(e == DragonEnum.Furious)
       {
           return  " velvet red";
       } else if (e == DragonEnum.Cruel)
       {
           return  " shiny red";
       }
       else return " light red";

    }

    @Override
    public int createHP()
    {
        return 2470;
    }

    @Override
    public int CreateUlti()
    {
        return 134;
    }

    @Override
    public String elementName() {
        return "FIRE";
    }

    @Override
    public String CreateSkinColor() {
        return null;
    }

    @Override
    public String CreateWings()
    {
        return " Big black wings";
    }

    @Override
    public String CreatePower(int power)
    {
        int extra = 30;
        String totalPower = String.valueOf((power + extra));
       // System.out.println(( ":" + power + " + " + extra + " ice boost " + "\n" +  " total power:" + (power + extra) ));
        return totalPower;
    }


}
