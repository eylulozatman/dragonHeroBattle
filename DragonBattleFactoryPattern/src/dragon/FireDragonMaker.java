package dragon;

import dragon.Types.CruelDragon;
import dragon.Types.Dragon;
import dragon.Types.FuriousDragon;
import dragon.Types.PredatoryDragon;
import dragon.factories.FireDragonFactory;

public class FireDragonMaker extends DragonMaker{
    @Override
    public Dragon createDragon(int DragonType)
    {
        Dragon dragon = null;
       DragonFactory dragonFactoryFire = new FireDragonFactory();
       if (DragonType == 1)
       {
           dragon = new CruelDragon(dragonFactoryFire);
       }
       else if(DragonType == 2)
       {
           dragon = new PredatoryDragon(dragonFactoryFire);
       }
       else if ((DragonType == 3))
       {
         dragon = new FuriousDragon(dragonFactoryFire);
       }


       return dragon;
    }


}
