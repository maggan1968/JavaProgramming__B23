package day48_Recap.cybertekTask;

import java.time.LocalDate;

public class Cybertek {

    public static void main(String[] args) {

        Tester tester = new Tester("Yasin", 'M', LocalDate.of(1995, 5, 28), 11, "SDET", 110000);
        Developer developer = new Developer("Mucahit", 'M', LocalDate.of(1992, 6, 16), 12, "Java Developer", 120000);
        Teacher teacher= new Teacher("Asiya", 'F', LocalDate.of(1996, 8, 19), 18, "Softskill Teacher", 130000);
        Student student = new Student("Yuliia", 'F', LocalDate.of(1996, 7, 19), "Cybetek", 28);


    }


}
