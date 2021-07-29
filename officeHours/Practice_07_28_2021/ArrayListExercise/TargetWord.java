package Practice_07_28_2021.ArrayListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class TargetWord {
    public static void main(String[] args) {
        /*
        Task 4 : Target Words

					Given an ArrayList of Strings and a target word (String) print how many times the target word is in the ArrayList
					Ex:
					Input:
						”java”, ”html”, “css”, “java”, “javascript”, “selenium”
						Target: java

						Output: 2
         */

        ArrayList<String> words=new ArrayList<>(Arrays.asList("java","html","css","java","javascript","selenium"));

        String targetWord="java";
        //Option1

        int count=0;

        for (String word : words) {
            if(word.equals(targetWord))
                count++;

        }

        System.out.println(count);

        //Option2
       /* words.removeIf(each->!each.equals(targetWord));
        System.out.println(words);
        System.out.println("words.size() = " + words.size());

        */


        //Option3

        System.out.println("Collections.frequency(words,targetWord) = " + Collections.frequency(words, targetWord));


            // Collection Methods

            Collections.sort(words);
            System.out.println("words = " + words);

            Collections.reverse(words);
            System.out.println("words = " + words);

            Collections.swap(words,0,1);
            System.out.println("words = " + words);

            Collections.replaceAll(words,"javascript","java");
            System.out.println("words = " + words);


    }
}
