package dragon.Types;

import dragon.DragonFactory;

public class PredatoryDragon extends Dragon {

    DragonFactory dragonFactory;

    public PredatoryDragon(DragonFactory dragonFactory) {
        this.dragonFactory = dragonFactory;
    }

    @Override
    public void GetDragonProperties() {

        Element = dragonFactory.elementName();
        DragonType = "Predatory";
        wings = dragonFactory.CreateWings();
        skinColor = dragonFactory.CreateSkinColor1(DragonEnum.Predatory);
        power = dragonFactory.CreatePower(80);
        hp = dragonFactory.createHP();
        ultiAttack = dragonFactory.CreateUlti();

    }
}
