public class Main {
    public static void main(String[] args) {

        Weapon weapon = new Weapon("fire", WeaponType.FIRE);

        Boss boss = new Boss(100, 20, weapon);
        Boss boss2 = new Boss(700, 70, weapon);
        System.out.println(boss2.printInfo());

        System.out.println("Boss health: " + boss.getHealth());
        System.out.println("Boss damage: " + boss.getDamage());
        System.out.println("Boss Weapon Type:" + weapon.getWeaponType());
        System.out.println("Boss Weapon Name:" + weapon.getName());

        Skeleton skeleton = new Skeleton(200, 10, new Weapon("catalist", WeaponType.CATALYST), 12);
        Skeleton skeleton2 = new Skeleton(300, 20, new Weapon("MAGICAL", WeaponType.MAGICAL), 15);

        System.out.println(skeleton.printInfo());
        System.out.println(skeleton2.printInfo());

    }
}
