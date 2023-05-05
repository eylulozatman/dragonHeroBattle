package dragon.Types;

import dragon.DragonFactory;


public class CruelDragon extends Dragon
{
      DragonFactory dragonFactory;

    public CruelDragon(DragonFactory dragonFactory) {
        this.dragonFactory = dragonFactory;
    }

    @Override
    public void GetDragonProperties()
    {
        Element = dragonFactory.elementName();
        DragonType = "Cruel";
        wings = dragonFactory.CreateWings();
        skinColor = dragonFactory.CreateSkinColor1(DragonEnum.Cruel);
        power = dragonFactory.CreatePower(80);
        hp = dragonFactory.createHP();
        ultiAttack = dragonFactory.CreateUlti();


    }
}
