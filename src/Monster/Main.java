package Monster;

public class Main {
    public static void main(String[] args) {
        Zombie zombie = new Zombie("Alice");
        zombie.attack();
        zombie.growl();
        Zombie zombie1 = new Zombie("Bob");
        zombie1.attack();
        zombie1.growl();
    }
}
