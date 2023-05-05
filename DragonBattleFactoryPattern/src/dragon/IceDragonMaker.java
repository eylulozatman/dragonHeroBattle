package dragon;

import dragon.Types.CruelDragon;
import dragon.Types.Dragon;
import dragon.Types.FuriousDragon;
import dragon.Types.PredatoryDragon;
import dragon.factories.IceDragonFactory;

public class IceDragonMaker extends DragonMaker{

    @Override
    public Dragon createDragon(int DragonType) {
        Dragon dragon = null;
        DragonFactory dragonFactoryIce = new IceDragonFactory();
        if (DragonType == 1)
        {
            dragon = new CruelDragon(dragonFactoryIce);
        }
        else if(DragonType == 2)
        {
            dragon = new PredatoryDragon(dragonFactoryIce);
        }
        else if ((DragonType == 3))
        {
            dragon = new FuriousDragon(dragonFactoryIce);
        }



        return dragon;
    }


}
