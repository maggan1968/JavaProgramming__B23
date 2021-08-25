package Practice_08_25_2021.cyberTask;

import java.time.LocalDate;

public final class Developer extends Employee {

    /*

	 2. Developer
		     variables: name, gender, age, dateOfBirth, jobTitle, employeeID, salary

		     methods: work(), attendMeeting()
     */

    public Developer(String name, char gender, LocalDate doB, int employeeID, String jobTitle, double salary) {
        super(name, gender, doB, employeeID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+getName()+" is typing code");    }

    @Override
    public void attendMeeting() {
        System.out.println(getJobTitle()+" "+getName()+" is attending Grooming ");    }

    @Override
    public void drink(String drink) {
        System.out.println(getJobTitle()+" "+getName()+" is drinking "+drink);
    }



}
