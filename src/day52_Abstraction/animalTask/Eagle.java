package day52_Abstraction.animalTask;

public class Eagle extends Animal implements Wild, Flyable{


    public Eagle(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void hunt() {

    }
}
