package dragon;

import dragon.Types.Dragon;

import java.util.Scanner;

public abstract class DragonMaker
{
       public abstract Dragon createDragon(int DragonType);


       Dragon dragon;

       public Dragon getDragon() {
              return dragon;
       }

       public  void selectDetails()
       {
              // System.console().flush();
              Scanner scanner = new Scanner(System.in);
              System.out.println("Select a dragon type");
              System.out.println(
                      " 1 CRUEL \n" +
                              " 2 PREDATORY \n"+
                              " 3 FURIOUS");
              int type = scanner.nextInt();
              dragon = createDragon(type);
              dragon.GetDragonProperties();
              System.out.println("YOUR DRAGON İS CREATING...");
              try {
                     Thread.sleep(1000); // Pause for 1 second
              } catch (InterruptedException e) {
                     // Handle the exception if necessary
              }
              dragon.write();

       }



}
