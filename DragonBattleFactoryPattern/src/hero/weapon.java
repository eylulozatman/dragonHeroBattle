package hero;

public abstract class weapon
{
     String name;
     int power;
     int ultiPower;

    public int getUltiPower() {
        return ultiPower;
    }

    public void setUltiPower(int ultiPower) {
        this.ultiPower = ultiPower;
    }

    public abstract void CreateWeapon();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }



}
