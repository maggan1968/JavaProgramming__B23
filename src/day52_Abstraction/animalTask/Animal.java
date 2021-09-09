package day52_Abstraction.animalTask;

public abstract class Animal {

    /*
    variables
    getter/setter
    Const
     to String
     */

    public abstract void sleep();

    public abstract void eat();

    public abstract void drink();

    public String name;
    public String breed;
    public char gender;
    public String size;
    public int age;
    public String color;

    public static boolean sleeps = true;
    public static boolean eats = true;
    public static boolean drinks = true;

   public Animal(String name, String breed, char gender, String size, int age, String color) {
            this.name = name;
            this.breed = breed;
            this.gender = gender;
            this.size = size;
            this.age = age;
            this.color = color;

        }
    public String getName() {
            return name;
        }
    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static boolean isSleeps() {
        return sleeps;
    }

    public static void setSleeps(boolean sleeps) {
        Animal.sleeps = sleeps;
    }

    public static boolean isEats() {
        return eats;
    }

    public static void setEats(boolean eats) {
        Animal.eats = eats;
    }

    public static boolean isDrinks() {
        return drinks;
    }

    public static void setDrinks(boolean drinks) {
        Animal.drinks = drinks;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}


