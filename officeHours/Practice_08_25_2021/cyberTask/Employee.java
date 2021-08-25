package Practice_08_25_2021.cyberTask;

import java.time.LocalDate;

public class Employee extends Person {
    /*
    2. Employee
		  variables: name, gender, age, dateOfBirth, jobTitle, employeeID, salary

		  methods: work(), attendMeeting()
     */

    private int employeeID;
    private String jobTitle;
    private double salary;

    public Employee(String name, char gender, LocalDate doB, int employeeID, String jobTitle, double salary) {
        super(name, gender, doB);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
        // set Condition
    }


    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println(getName() + " is working");
    }

    public void attendMeeting() {
        System.out.println(getName() + " is attending meeting");

    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString()+
                " employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
