package Main;

public class Human extends Mammal implements Carnivore, Herbivore {
    private int height;
    private String nationality;

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Human(String name, String gender , int age , int weight , int height , String nationality) {
        super(name , gender , age , weight);
        this.height = height;
        this.nationality = nationality;
    }

    @Override
    public void move() {
        System.out.println(getName()  + " is walking");
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " is speaking");
    }

    @Override
    public void eatMeat() {
        System.out.println(getName() + " is eating meat");
    }

    @Override
    public void eatPlants() {
        System.out.println(getName() + " is eating plants");
    }

    public void work() {
        System.out.println(getName() + " is working");
    }
}
