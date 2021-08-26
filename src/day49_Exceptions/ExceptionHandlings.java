package day49_Exceptions;

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


    }

}
