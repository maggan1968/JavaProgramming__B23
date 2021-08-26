package day49_Exceptions;

import java.util.Scanner;

public class ExceptionHandlings {

    public static void main(String[] args) {

        String str = "Cybertek";

        try {
            System.out.println(str.charAt(200)); // StringIndexOutOfBounds
            System.out.println("Try block");
        }catch (RuntimeException e){
            System.out.println("Catch Block: Runtime exception occured");
        }


        str += " Shcool";

        System.out.println(str);

        System.out.println("------------------------------------------");

        try {
            System.out.println( 9/0 ); // Arithmetic exception
        }catch (IllegalArgumentException e){
          //  System.out.println( e.getMessage() );
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e){
          //  System.out.println( e.getMessage() );
            e.printStackTrace();
        } catch (ArithmeticException e){
         //   System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (RuntimeException e){
          //  System.out.println(e.getMessage());
            e.printStackTrace();
        }


        System.out.println("Test completed");

        System.out.println("---------------------------------------------------");


        System.out.println( new Scanner(System.in).nextInt() );






    }

}
