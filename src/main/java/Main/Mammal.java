package Main;

public abstract class Mammal implements Creature {
    public abstract void move();
    public abstract void makeSound();
    @Override
    public void live() {
        System.out.println("Mammals are living");
    }
    @Override
    public void breathe() {
        System.out.println("Mammals breathe to be alive");
    }
}
