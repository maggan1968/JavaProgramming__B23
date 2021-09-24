package Day67_Collection;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Remove_Even {
    public static void main(String[] args) {

        Set<Integer>set = new TreeSet<>();
        set.addAll(Arrays.asList(10,10,10,9,11,8,12,7,14,15,6,5,4,3,2,1));

        System.out.println(set);

        Iterator<Integer>it = set.iterator();//remove even number DO NOT use Lambda expressions, use Iterator
        while (it.hasNext()){ //this condition has to be true
            if(it.next()%2 == 0){
                it.remove();
            }
        }
        System.out.println(set);

        System.out.println("------------------------------------------------------------------------");

       // lombda expression
        Set<Integer>set2 = new TreeSet<>();
        set.addAll(Arrays.asList(10,10,10,9,11,8,12,7,14,15,6,5,4,3,2,1));

        set2.removeIf( n ->n%2 ==0);

        System.out.println(set2);


    }
}
/*
write a program that can remove the even numbers from a Set of Integers
            DO NOT use Lambda expressions

 */