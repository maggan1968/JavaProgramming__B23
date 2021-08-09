package day41_CustomClass_Constructor.ScrumTask;

public class BankOfAmerica {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Yuliang", 'M', "QA", 10, 110000);
        Tester tester2 = new Tester("Abbos", 'M', "SM", 11, 115000);
        Tester tester3 = new Tester("Selda", 'F', "QE", 12, 120000);

        System.out.println(tester1);
        System.out.println(tester2);
        System.out.println(tester3);
       // System.out.println(tester1.isEmployeed);

    }

}
