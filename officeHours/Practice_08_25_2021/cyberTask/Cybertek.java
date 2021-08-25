package Practice_08_25_2021.cyberTask;

import java.time.LocalDate;

public class Cybertek {
    public static void main(String[] args) {


    Tester  tester=new Tester("Ahmet",'M', LocalDate.of(1980,2,23), 0, "SDET", 100000);
    //OVERRIDEN METHODS
    tester.attendMeeting();
    tester.drink("coffee");
    tester.work();
    // COMES FROM PARENTS
    tester.eat("Pizza");
    tester.sleep();
    System.out.println("tester = " + tester);
    System.out.println("=========================");

    Developer developer=new Developer("Vitalii", 'M', LocalDate.of(1980,2,23),1, "Java Develeoper", 120000);
    //OVERRIDEN METHODS
    developer.attendMeeting();
    developer.drink("tea");
    developer.work();
    // COMES FROM PARENTS
    developer.eat("Steak");
    developer.sleep();
    System.out.println("developer = " + developer);
    System.out.println("=========================");





    }
}
