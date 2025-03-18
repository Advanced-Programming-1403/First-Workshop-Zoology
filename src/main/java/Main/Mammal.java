package Main;

public abstract class Mammal implements Creature {
    public abstract void move();
    public abstract void makeSound();
    @Override
    public void live() {
        System.out.println(getClass().getSimpleName() + " is living its life.");
    }
}
