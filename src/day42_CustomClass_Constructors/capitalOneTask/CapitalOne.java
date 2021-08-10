package day42_CustomClass_Constructors.capitalOneTask;

import day41_CustomClass_Constructor.ScrumTask.ScrumTeam;

public class CapitalOne {

    public static void main(String[] args) {
        ScrumTeam scrumTeam1 = new ScrumTeam("Zengin", "Engin", "Cengiz");
        scrumTeam1.hireTester(HumanResource.testersTeam1);
        scrumTeam1.hireDeveloper(HumanResource.devopsTeam1);

        ScrumTeam scrumTeam2 = new ScrumTeam("Selda", "Mucahit", "Dilem");
        scrumTeam2.hireTester(HumanResource.testersTeam2);
        scrumTeam2.hireDeveloper(HumanResource.devopsTeam2);

        ScrumTeam scrumTeam3 =new ScrumTeam("Mohigul","Maftuna","Zulkhumor");
        scrumTeam3.hireTester(HumanResource.testersTeam3);
        scrumTeam3.hireDeveloper(HumanResource.devopsTeam3);






    }

}

/*
        1. total budget
        2. total Number of testers in CapitalOne
        3. total number of developers in Bank of America
        4. what's the max & min salaries of the testers
        5. what's the max & min salaries of the developers
 */
