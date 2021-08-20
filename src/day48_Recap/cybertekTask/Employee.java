package day48_Recap.cybertekTask;

import java.time.LocalDate;

public class Employee extends Person{
    private int employeeId;
    private String jobTitle;
    private double salary;

    public Employee(String name, char gender, LocalDate dOB, int employeeId, String jobTitle, double salary) {
        super(name, gender, dOB);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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
        if(salary < 0){
            return;
        }
        this.salary = salary;
    }
}

/*
 2. Employee
    variables: name, gender, age, dateOfBirth, jobTitle, employeeID, salary
    methods: work(), attendMeeting()
 */