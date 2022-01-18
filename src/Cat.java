public class Cat extends Animal{
    public Cat() {
        super(false, "Milk and Meat");
    }

    public void sound(){
        System.out.println("Meow");
    }

    @Override
    public void move(){
        System.out.println("Cat can moves really quiet");
    }
}
