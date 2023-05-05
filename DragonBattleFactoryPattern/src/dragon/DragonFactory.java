package dragon;

import dragon.Types.Dragon;
import dragon.Types.DragonEnum;

public interface DragonFactory
{

    public String elementName();
    public String CreateSkinColor();
    public String CreateWings();

    public String CreatePower(int power);

    public String CreateSkinColor1(DragonEnum e);

    public int createHP();

    public int CreateUlti();

}
