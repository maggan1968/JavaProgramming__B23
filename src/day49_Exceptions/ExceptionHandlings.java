package day49_Exceptions;

import day46_Inheritance.shapeTask.Circle;
import java.util.InputMismatchException;

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

        try { // plan A
            System.out.println("".substring(10, 20)); //"Cybertek"
        }catch (ArithmeticException e){ // Plan B
            e.printStackTrace();
        }catch (NumberFormatException e){ // Plan C
            e.printStackTrace();
        }catch (IllegalArgumentException e){ // Plan D
            e.printStackTrace();
        }catch (InputMismatchException e){ // Plan E
            e.printStackTrace();
        }catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("test completed");

        System.out.println("-----------------------------------------");

        Circle circle1 = null;

        try {
            circle1.getRadius();
        }catch(RuntimeException e){
            e.printStackTrace();
        }

        System.out.println("Test completed");







    }

}
