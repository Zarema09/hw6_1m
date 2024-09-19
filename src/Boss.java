public class Boss extends GameEntity {
    private Weapon weapon;


    public Boss(int health,int damage,Weapon magic){
        setHealth(health);
        setDamage(damage);
        this.weapon=magic;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo() {
        return "Heals: " + getHealth() + " WeaponType: " + weapon.getWeaponType() + " WeaponName: " + weapon.getName();
    }
}

