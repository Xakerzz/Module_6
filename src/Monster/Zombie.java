package Monster;

public class Zombie extends Monster {
    boolean growlUp;

    public Zombie(String name) {
        super(name + " the Zombie",5);
    }



    @Override
    public void growl() {
        System.out.println();
        super.growl();
    }

    public void growl(boolean growlUp) {
        if (!growlUp) {
            growl();
        } else {
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
