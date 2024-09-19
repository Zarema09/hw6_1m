public class Weapon {
    private String weaponName;
    private WeaponType weaponType;

    public Weapon(String name, WeaponType type) {
        this.weaponName = name;
        this.weaponType = type;
    }

    public String getName() {
        return weaponName;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }


    public void setName(String name) {
        this.weaponName = name;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }
}
