package Polymorphsm;

public class Cat extends Animal{
    public Cat() {
        super(false, "Milk and Meat");
    }

    public void sound(){
        System.out.println("Meow");
    }

    @Override
    public void move(){
        System.out.println("Polymorphism.Cat can moves really quiet");
    }

    @Override
    public void print() {
        System.out.println("Meoww");
    }
}
