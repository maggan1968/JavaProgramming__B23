package Practice_08_11_2021.statics;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlock {

    /*
    static initializer block

    - RUN ONLY ONCE before everythim when class is loaded
    - if you have a file, if you should take all data from here you should use
     */


    public static int num;
    public static ArrayList<String> carModels;

    static{

        num=10;
        // carModels=new ArrayList<>(Arrays.asList("Ford","Bentley","BMW","Aston MArtin"));
        carModels=new ArrayList<>();
        carModels.addAll(Arrays.asList("Ford","Bentley","BMW","Aston MArtin"));

    }

    public StaticBlock() {
        System.out.println("no arg");
        num+=5;

    }

    public StaticBlock(int value) {
        System.out.println("One param constr");
        num+=value;
    }
}
