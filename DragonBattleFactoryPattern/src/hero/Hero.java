package hero;

import hero.Armor.Armor;
import hero.weapon.weapon;

public class Hero {
    String name;
    weapon weapon;
    int hp;
    Armor armor;
    public Hero(String name, hero.weapon.weapon weapon,Armor armor)
    {
        this.name = name;
        this.weapon = weapon;
        this.hp = 2000 + armor.getDef();
    }

    public Armor getArmor()
    {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public hero.weapon.weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(hero.weapon.weapon weapon) {
        this.weapon = weapon;
    }
}
