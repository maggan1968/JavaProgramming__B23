package day53_Abstraction.carTask;

public class Tesla extends Car implements ElectricCar, AutoPilot {
    public Tesla( String model, String color, int year, double price) {
        super("Tesla", model, color, year, price);
    }

    @Override
    public void autoPark() {
        System.out.println("Auto-parking Tesla" + getModel());
    }

    @Override
    public void selfDrive() {
        System.out.println("Self Driving Tesla" + getModel());
    }

    @Override
    public void start() {
        System.out.println("Start Tesla" + getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving Tesla" + getModel());
    }

    @Override
    public void charging() {
        System.out.println("Charging Tesla" + getModel());
    }

        public void dogMode(){
            System.out.println("Tesla"+getModel()+" ins in dog mode");
    }
}
