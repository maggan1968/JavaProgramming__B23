package Practice_08_04_2021.BMW;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class BMWMain {
    public static void main(String[] args) {


        BMW car1=new BMW();
        car1.setInfo("BMW","i8","White",20000,100000, LocalDate.of(2015,05,10));

        BMW car2=new BMW();
        car2.setInfo("BMW","750i","Black",20000,100000, LocalDate.of(2016,06,11));

        BMW car3=new BMW();
        car3.setInfo("BMW","x5","Red",20000,100000, LocalDate.of(2017,07,11));

        BMW car4=new BMW();
        car4.setInfo("BMW","i8","Black",20000,100000, LocalDate.of(2018,07,11));


        BMW car5=new BMW();
        car5.setInfo("BMW","x7","Black",20000,100000, LocalDate.of(2019,07,11));

        System.out.println("=====================");

        // 	Create an Arraylist to recall ALL BMW that were build before 2017

        ArrayList<BMW> recallBefore2017=new ArrayList<>();
        recallBefore2017.addAll(Arrays.asList(car1,car2,car3,car4,car5));
        System.out.println(recallBefore2017);

        recallBefore2017.removeIf(car->car.year>=2017);
        System.out.println("recallBefore2017 = " + recallBefore2017);


        //	Create an Arraylist to recall ALL BMW i8 that were build before 2016


        BMW[] cars={car1,car2,car3,car4,car5};
        ArrayList<BMW> recallI8AndBefore2016=new ArrayList<>(Arrays.asList(cars));

        for (BMW bmw : recallI8AndBefore2016) {
            if(bmw.model.equals("i8") && bmw.year<2016)
                System.out.println(bmw);
        }
        System.out.println("========================");

        recallI8AndBefore2016.removeIf(car->!(car.model.equals("i8") && car.year<2016));
        System.out.println(recallI8AndBefore2016);



    }
}
