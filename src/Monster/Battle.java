package Monster;

public class Battle {
    private int countMonsters=0;
    private Monster[] monsters = new Monster[5];
    void add(Monster monster){
        if (countMonsters<=4){
            monsters[countMonsters] =monster;
            countMonsters++;
        }else {
            System.out.println("No more monsters!!!");
        }
    }

    void start(){
        run();
    }

    void run(){
        for (Monster m:monsters) {
            m.attack();
        }
    }
}
