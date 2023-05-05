package dragon;

import dragon.Types.CruelDragon;
import dragon.Types.Dragon;
import dragon.Types.FuriousDragon;
import dragon.Types.PredatoryDragon;
import dragon.factories.ThunderDragonFactory;

public class ThunderDragonMaker extends DragonMaker{

    @Override
    public Dragon createDragon(int DragonType)
    {
        Dragon dragon = null;
        DragonFactory dragonFactoryThunder = new ThunderDragonFactory();
        if (DragonType == 1)
        {
            dragon = new CruelDragon(dragonFactoryThunder);
        }
        else if(DragonType == 2)
        {
            dragon = new PredatoryDragon(dragonFactoryThunder);
        }
        else if ((DragonType == 3))
        {
            dragon = new FuriousDragon(dragonFactoryThunder);
        }


        return dragon;
    }


}
