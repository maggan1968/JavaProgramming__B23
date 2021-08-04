package Practice_08_04_2021.Animal;

public class Earth {
    public static void main(String[] args) {


        AnimalSpecies dogs=new AnimalSpecies();
        /*dogs.growthRate=10;
        dogs.name="dogs";
        dogs.population=50;

         */
        dogs.setInfo("dogs",50,20);
        System.out.println("dogs.getGrowthRate() = " + dogs.getGrowthRate());
        System.out.println("dogs.getName() = " + dogs.getName());
        System.out.println("dogs.getPopulation() = " + dogs.getPopulation());
        System.out.println(dogs);
        System.out.println("================");


        AnimalSpecies cats=new AnimalSpecies();
        cats.setInfo("cats",100,15);
        System.out.println("cats = " + cats);
        System.out.println("================");

        AnimalSpecies birds=cats;
        System.out.println("birds = " + birds);
        birds.setInfo("birds",200,10);

        System.out.println("birds = " + birds);
        System.out.println("cats = " + cats);



    }
}
