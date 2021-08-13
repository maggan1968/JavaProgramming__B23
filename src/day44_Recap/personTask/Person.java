package day44_Recap.personTask;

import java.time.LocalDate;

public class Person {

    private String name;
    private char gender;
    private final int age ;
    private final LocalDate dateOfBirth;
    private final String countryOfBirth;
    private final String language;

    public Person(String name, char gender, LocalDate dateOfBirth, String countryOfBirth, String language) {
        setName(name);
        setGender(gender);
        if(dateOfBirth.isBefore(LocalDate.now())) {
            this.dateOfBirth = dateOfBirth;
        }else{
            this.dateOfBirth = null;
        } // age cannot be negative

        this.countryOfBirth = countryOfBirth;
        this.language = language;
        age = LocalDate.now().getYear() - this.dateOfBirth.getYear();
    }

    public String getName(){
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCountryOfBirth() {
        return countryOfBirth;
    }

    public String getLanguage() {
        return language;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        if(gender != 'M' || gender != 'F' || gender != 'm' || gender != 'f' ){ // if gender is not male or female
            return; // exits the method
        }
        this.gender = gender;
    }


}

/*
PersonTask:
    private variables:
        name (String)
        gender (char)
        age (int)
        dateOfBirth (LocalDate & constant)
        countryOfBirth (String & constant)
        language (String & constant)

    public variables:
        isHuman (static boolean & constant)
        planet (static boolean & constant)

    Encapsulate all the fields (instances)
        (age cannot be set to negative)

    Add a constructor that can set the instances when the object is created
         (Avoid any duplicated or unnecessary code fragments)

     Extra methods:
         eat(), sleep(), drink(), toString()
 */
