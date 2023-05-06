package game;

import dragon.DragonMaker;
import dragon.FireDragonMaker;
import dragon.IceDragonMaker;
import dragon.ThunderDragonMaker;
import hero.Armor.Armor;
import hero.Armor.ArmorMaker;
import hero.Hero;
import hero.weapon.hammer;
import hero.weapon.sword;
import hero.weapon.weapon;

import java.util.Scanner;

public class play {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("select a dragon maker \n" +
                " 1 Fire \n" +
                " 2 Ice \n"+
                " 3 Thunder");
        int dragonmakernumber = sc.nextInt();

        DragonMaker dragonMaker = null;
        if(dragonmakernumber == 1)
        {
             dragonMaker = new FireDragonMaker();
            dragonMaker.selectDetails();

        }
        if (dragonmakernumber == 2)
        {
             dragonMaker = new IceDragonMaker();
            dragonMaker.selectDetails();
        }
        if (dragonmakernumber == 3)
        {
             dragonMaker = new ThunderDragonMaker();
            dragonMaker.selectDetails();
        }

        System.out.println(" Enter hero name ");
        String heroName= sc.next();
        System.out.println(" Now, select a weapon");
        System.out.println("1- SWORD");
        System.out.println("2- HAMMER");
        int weaponName = sc.nextInt();
        weapon weapon = null;
        if(weaponName == 1)
        {
             weapon = new sword();
             weapon.CreateWeapon();

        }
        else if (weaponName == 2)
        {
             weapon = new hammer();
             weapon.CreateWeapon();
       }
        else
        {
            System.out.println("you entered a wrong input");
        }
        System.out.println("Now,select an Armor");
        System.out.println("1- Shiny Armor");
        System.out.println("2- Gold Armor");
        int ArmorChoose = sc.nextInt();
        ArmorMaker armorMaker = new ArmorMaker();
        Armor armor = armorMaker.createArmor(ArmorChoose);
        Hero hero = new Hero(heroName,weapon,armor);
        hero.setWeapon(weapon);
        hero.setName(heroName);
        hero.setArmor(armor);
        System.out.println("battle is starting");
        System.out.println("Dragon: " + dragonMaker.getDragon().getElement() +" "+ dragonMaker.getDragon().getDragonType());
        System.out.println("Hero: " + heroName + " with " + weapon.getName() + "equipped" + armor.getName());
        Fight fight = new Fight();
        fight.startFight(dragonMaker.getDragon(), hero);


    }
}
