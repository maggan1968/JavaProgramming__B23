package day52_Abstraction.animalTask;

public class Dolphin extends Animal implements Wild, Playable, Swimmable{


    public Dolphin(String name, String breed, char gender, String size, int age, String color) {
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
    public void play() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void hunt() {

    }
}
