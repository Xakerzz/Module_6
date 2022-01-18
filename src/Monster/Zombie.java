package Monster;

public class Zombie extends Monster{
    boolean growlUp;

    public Zombie(String name, int damage) {
        super(name,damage);
    }

    @Override
    public void growl() {
        System.out.println();
        super.growl();
    }

    public void growl(boolean growlUp) {
        if (!growlUp) {
            growl();
        }
        else {
            System.out.print(scream.toUpperCase());
            super.growl();
        }
    }

    @Override
    public void attack() {
        super.attack();
        growl();
    }
}
