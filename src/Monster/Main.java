package Monster;

public class Main {
    public static void main(String[] args) {
//        Zombie zombie = new Zombie("Alice",5);
//        zombie.attack();
//        zombie.growl();
//        Zombie zombie1 = new Zombie("Bob",5);
//        zombie1.attack();
//        zombie1.growl();

        Zombie zombie = new Zombie("Alice",5);
        zombie.growl();
        zombie.growl(true);
        zombie.growl(false);
    }
}
