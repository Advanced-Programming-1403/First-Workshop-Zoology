package Main;

class Cat extends Mammal implements Carnivore {
    @Override
    public void eatMeat() {
        System.out.println("Cat is eating meat.");
    }
}