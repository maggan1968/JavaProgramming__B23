package day52_Abstraction.animalTask;

public class Cat extends Animal implements Playable{


    public Cat(String name, String breed, char gender, String size, int age, String color) {
        super(name, breed, gender, size, age, color);
    }

    @Override
    public void sleep() {
        System.out.println(name +" is sleeping");
    }

    @Override
    public void eat() {
        System.out.println(name +" is eating");

    }

    @Override
    public void drink() {
        System.out.println(name +" is drinking");

    }

    @Override
    public void play() {
        System.out.println(name +" is playing");

    }
}
