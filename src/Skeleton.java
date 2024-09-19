public class Skeleton extends Boss {

    private int arrowCount;

    public Skeleton(int health, int damage, Weapon magic, int arrowCount) {
        super(health, damage, magic);
        this.arrowCount = arrowCount;
    }

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    @Override
    public String printInfo() {
        return super.printInfo() + " ArrowCount " + arrowCount;
    }
}
