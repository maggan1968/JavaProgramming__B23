package day36_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,10, 5, 0, -1, 30, 40, 15, 20, 20, 20, 20));

        // Arrays.sort(list);

        Collections.sort(list);

        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);

        Collections.swap(list, 2, 0);

        System.out.println(list);

        Collections.replaceAll(list, 10, 20);

        System.out.println(list);

        int f = Collections.frequency(list, 20);

        System.out.println(f);

        System.out.println("-------------------------------------------");
        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A', 'A', 'B', 'C', 'C', 'C', 'D'));

        /*
        ArrayList<Character> uniques = new ArrayList<>();

        for (Character each : chars) {
            if(Collections.frequency(chars, each) == 1 ){
                uniques.add(each);
            }
        }

         */

        ArrayList<Character> uniques = new ArrayList<>( chars );
        uniques.removeIf( p ->  Collections.frequency(uniques, p ) != 1);
        System.out.println(uniques);


        System.out.println("----------------------------------------------");
        /*
        String str = "ABABABCDEEEE";
        String unique = "";

        ArrayList<String> result = new ArrayList<>(  Arrays.asList(str.split("") ) );

        for(String each : result){
            if(Collections.frequency(result, each) == 1){
                unique+= each;
            }
        }

        System.out.println(unique);

         */

        String str = "ABABABCDEEEE";

        ArrayList<String> result = new ArrayList<>(  Arrays.asList(str.split("") ) );
        result.removeIf(p -> Collections.frequency(result, p) != 1 );

        System.out.println(result);







    }

}
