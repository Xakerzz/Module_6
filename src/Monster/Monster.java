package Monster;



public class Monster {
    private String name;
    private int health;
    private int damage;
    static String scream = "Raaaauuughhhh";
    public Monster(String name,int damage) {
        this.name = name;
        this.damage = damage;
        this.health = 100;
        printName(this.name);
    }

    public void growl() {
        System.out.printf("%s %s  growled\n",scream,name);
    }

    public void attack() {
        System.out.printf("Monster %s  attacked with damage %d\n",this.name,this.damage);
    }

    private void printName(String name) {
        System.out.printf("Monster %s  was created\n", name);
    }


}
