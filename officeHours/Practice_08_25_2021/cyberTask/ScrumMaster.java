package Practice_08_25_2021.cyberTask;

import java.time.LocalDate;

public class ScrumMaster extends Employee {

    /*
    4. ScrumMaster
		 variables: name, gender, age, dateOfBirth, jobTitle, employeeID, salary

		 methods: work(), attendMeeting()
     */

    public ScrumMaster(String name, char gender, LocalDate doB, int employeeID, String jobTitle, double salary) {
        super(name, gender, doB, employeeID, jobTitle, salary);
    }


    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is removing obstacles");    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle()+" "+getName()+" is attending Scrum Meetings");
    }

    @Override
    public void drink(String drink) {
        System.out.println(getJobTitle()+" "+getName()+" is drinking "+drink);
    }

}
