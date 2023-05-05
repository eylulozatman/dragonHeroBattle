package hero;

public class Hero {
    String name;
    weapon weapon;
    int hp;
    public Hero(String name, hero.weapon weapon)
    {
        this.name = name;
        this.weapon = weapon;
        this.hp = 2000;
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

    public hero.weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(hero.weapon weapon) {
        this.weapon = weapon;
    }
}
