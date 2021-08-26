package Practice_08_25_2021.cyberTask;

import java.time.LocalDate;

public final class Tester extends Employee {

    /*
    1. Tester
		   variables: name, gender, age, dateOfBirth, jobTitle, employeeID, salary

		   methods: work(), attendMeeting()
     */

    public Tester(String name, char gender, LocalDate doB, int employeeID, String jobTitle, double salary) {
        super(name, gender, doB, employeeID, jobTitle, salary);
    }
    /*
    Overriding Rules
        1- IS A Relationship
        2- Parameters-Return Type-Method name MUST be same
        3- Visibility should be at least same with parent
        4- private -final-static can not overriden
     */



    public void work(){
        System.out.println(getJobTitle()+" "+getName()+" is testing ");
    }

    public void attendMeeting(){
        System.out.println(getJobTitle()+" "+getName()+" is attending scrum meeting  ");
    }

    @Override
    public void drink(String beverage) {
        System.out.println(getJobTitle()+" "+getName()+" is drinking "+beverage);
    }






}
