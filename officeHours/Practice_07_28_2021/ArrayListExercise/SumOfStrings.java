package Practice_07_28_2021.ArrayListExercise;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfStrings {
    public static void main(String[] args) {
        /*

		    Task 3 : String numbers to sum

					Given an ArrayList of numbers in String format, add each digit of each element and store into a different ArrayList.

					Ex:

					Input:
					“123”, “34”, “513”

					Output:
					[ 6, 7, 9 ]
         */

        ArrayList<String> list=new ArrayList<>(Arrays.asList("123","34","513"));
        ArrayList<Integer> result=new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {
            int total=0;
            // Option1
            /*String eachElement = list.get(i);

            for (int j = 0; j <eachElement.length() ; j++) {
                total+=Integer.parseInt(""+eachElement.charAt(j));
            }

             */

            // Option2
            /*String[] split = list.get(i).split("");  // 123    [1,2,3]
            for (String each : split) {
                total+=Integer.parseInt(each);
            }

             */

            // Option3
            char[] chars = list.get(i).toCharArray();

            for (char each : chars) {
                total+=Integer.parseInt(""+each);

            }


            result.add(total);

        }

        System.out.println(result);




    }
}
