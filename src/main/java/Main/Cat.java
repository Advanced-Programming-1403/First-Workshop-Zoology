package Main;

public class Cat extends Mammal implements Carnivore {
    private String breed;

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public Cat(String name, String gender , int age , int weight , String breed) {
        super(name , gender , age , weight);
        this.breed = breed;

        @Override
        public void move() {
            System.out.println(getName()  + " is walking on four legs");
        }
        @Override
        public void makeSound() {
            System.out.println(getName() + " is making mew sound");
        }
        @Override
        public void eatMeat() {
            System.out.println(getName() + " is eating meat");
        }
    }
}
