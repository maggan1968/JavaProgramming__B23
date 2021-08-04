package Practice_08_04_2021.BMW;

import java.time.LocalDate;

public class BMW {

/*
Task 2 : BMW

		Create a class for BMW
			- Create these variables in the class:
			 	- brand,model,color (String),      // BMW,x5,White
				- price,mileage (double)		   // 20000,10000
				- year (int)				       // 2015
				- DOfB(LocalDate)				   // 2015,5,20


		- Create these methods :
			- setInfo()
				- parameters: all atributes
				- returns: void
				- action: assigns necessary attributes for instance variables.

		- getBrandName()
			 no parameters, returns the brand variable

		- toString()   generate the toString method as shown in class.

		- Create a class MainClass for BMW

		- Create BMW  objects, call the getBrandName and get methods of the objects
			- Create an Arraylist to recall ALL BMW that were build before 2017
			- Create an Arraylist to recall ALL BMW i8 that were build before 2016

 */

    public String brand,model,color ;       // BMW,x5,White
	public double price,mileage ;		   // 20000,10000
	public int year ;			          // 2015
	public LocalDate DOfB;			      // 2015,5,20


    public void setInfo(String brand, String model, String color, double price, double mileage,  LocalDate DOfB) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.mileage = mileage;
        year = DOfB.getYear();
        this.DOfB = DOfB;
    }

    public String getBrand(){
        return brand;
    }


    @Override
    public String toString() {
        return "BMW{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", mileage=" + mileage +
                ", year=" + year +
                ", DOfB=" + DOfB +
                '}';
    }
}
