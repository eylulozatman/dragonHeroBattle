package game;

import dragon.Types.Dragon;
import hero.Hero;

import java.util.Random;

public class Fight {

    Random random = new Random();
    Random chooseChar = new Random();
    Random powerType = new Random();
    int damageNum;
    int Char;
    int powertyp;


    public void startFight(Dragon dragon, Hero hero)
    {

        System.out.println("first damage");
        System.out.println("********************************");

        while (hero.getHp() > 0 && dragon.getHp() > 0)
        {
            try {
                Thread.sleep(2000); // Pause for 2 seconds
            } catch (InterruptedException e) {
                // Handle the exception if necessary
            }
             damageNum =  random.nextInt(5); // select damage number
             Char =  chooseChar.nextInt(2); // select character
             powertyp = powerType.nextInt(4);
            if (Char == 0)// dragon attack
            {
                if (powertyp == 1)
                {
                   dragonUlti(dragon,hero);
                }
                else
                {
                   dragonAttack(dragon,hero);
                }


            }
            else  // hero attack
            {
                if (powertyp == 1)
                {
                     heroUlti(dragon,hero);
                }
                else
                {
                    heroAttack(dragon,hero);
                }


            }
        }
        if (hero.getHp() <= 0)
        {

            System.out.println(" dragon wins");
        }
        else
        {
            System.out.println(hero.getName() + " wins");
        }

    }

    public void heroUlti(Dragon dragon, Hero hero)
    {
        System.out.println("**** ULTI ATTACK *****");
        System.out.println( hero.getName() + " attack " + damageNum + " times");
        int damage = hero.getWeapon().getUltiPower()* damageNum;
        System.out.println( "damage " + damage);
        dragon.setHp(dragon.getHp()- damage);
        //  System.out.println("remaining hp" + dragon.getHp());
        System.out.println("********************************");
    }
    public void heroAttack(Dragon dragon, Hero hero)
    {
        System.out.println( hero.getName() + " attack " + damageNum + " times");
        int damage = hero.getWeapon().getPower() * damageNum;
        System.out.println( "damage"  + damage);
        dragon.setHp(dragon.getHp()- damage);
        //  System.out.println("remaining hp" + dragon.getHp());
        System.out.println("********************************");
    }
    public void dragonUlti(Dragon dragon, Hero hero)
    {
        System.out.println("**** ULTI ATTACK *****");
        System.out.println( dragon.getElement() + " " + dragon.getDragonType() + " attack " + damageNum + " times ");
        int damage =(dragon.getUltiAttack()) * damageNum;
        System.out.println( "damage " + damage);
        hero.setHp(hero.getHp() - damage);
        // System.out.println("remaining hp" + hero.getHp());
        System.out.println("********************************");
    }
    public void dragonAttack(Dragon dragon, Hero hero)
    {
        System.out.println(  dragon.getElement() + " " + dragon.getDragonType() + " attack " + damageNum + " times ");
        int damage = Integer.parseInt(dragon.getPower()) * damageNum;
        System.out.println( "damage " + damage);
        hero.setHp(hero.getHp() - damage);
        // System.out.println("remaining hp" + hero.getHp());
        System.out.println("********************************");
    }
}
