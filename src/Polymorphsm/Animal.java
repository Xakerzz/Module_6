package Polymorphsm;

public abstract class Animal {
    private boolean vegetarian;
    private String eats;

    public Animal(){
        System.out.println("Creature was created as Polymorphism.Animal!");
    }

    public Animal(boolean vegetarian, String eats) {
        this.vegetarian = vegetarian;
        this.eats = eats;
    }

    public void move(){
        System.out.println("Animals can to move");
    }

    public abstract void print();
    public boolean isVegetarian(){
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }
}
