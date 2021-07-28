package Practice_07_28_2021.WrapperClass;

import java.util.Scanner;

public class WrapperClassIntro {
    public static void main(String[] args) {

        /*- Wrapper Class
			Intro

			- Why do we need ?
			       - Array can spport primitves objects.Collection allows only Object
			       - Useful methods
			       - to convert primmitive to object

			- parseInt(),parseDouble() etc vs valueOf()
			- Auto-Boxing vs Unboxing
			- WrapperClassMethods

			Task 1:
					String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

					Write a method that returns : Welcome To Core Java

         */

        // - Auto-Boxing vs Unboxing

        // Auto boxing primitve to object
        int b=30;
        Integer a=b;

        // Un boxing Object to primitve
        Integer num1=Integer.valueOf(300);
        int num2=num1;


        //  parseInt(),parseDouble() etc vs valueOf()

        Scanner sc =new Scanner(System.in);
        String str=new String("Test");

       // Integer num=new Integer(300);

        Integer num3=Integer.valueOf(300);   // return Onject
        int i = Integer.parseInt("123");  // return primitives

        // - WrapperClassMethods

        System.out.println(Integer.max(5, 4));
        System.out.println("Integer.min(5,4) = " + Integer.min(5, 4));
        System.out.println("Integer.sum(5,4) = " + Integer.sum(5, 4));

        System.out.println(Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);

        System.out.println("Integer.compare(5,4) = " + Integer.compare(5, 4));
        System.out.println("Integer.compare(5,5) = " + Integer.compare(5, 5));
        System.out.println("Integer.compare(4,5) = " + Integer.compare(4, 5));

        System.out.println("Character.isDigit('4') = " + Character.isDigit('4'));
        System.out.println("Character.isAlphabetic('0') = " + Character.isAlphabetic('0'));
        System.out.println("Character.isLetter('r') = " + Character.isLetter('r'));




    }
}
