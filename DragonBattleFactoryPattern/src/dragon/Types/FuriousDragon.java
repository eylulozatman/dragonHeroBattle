package dragon.Types;

import dragon.DragonFactory;

public class FuriousDragon extends Dragon {

    DragonFactory dragonFactory;

    public FuriousDragon(DragonFactory dragonFactory) {
        this.dragonFactory = dragonFactory;
    }

    @Override
    public void GetDragonProperties()
    {

        setElement(dragonFactory.elementName());
        setDragonType("Furious");
        setWings(dragonFactory.CreateWings());
        setSkinColor(dragonFactory.CreateSkinColor1(DragonEnum.Furious));
        setPower(dragonFactory.CreatePower(80));
        setHp(dragonFactory.createHP());
        setUltiAttack(dragonFactory.CreateUlti());


    }
}
