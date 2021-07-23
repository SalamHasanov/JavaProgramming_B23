package day25_ForEachLoop;

import java.util.Arrays;

public class ForEachLoopIntro {
    public static void main(String[] args) {

    int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {

        }
        System.out.println("______________________________");

        for (int each:numbers) { // each: elements of the array
            System.out.println(each);
        }
        System.out.println("____________________________________");
        String[] names = {"Ahmet","Boburbek", "Farid", "Robinson"};
        for (String each2 :
                names) {
            System.out.println(each2);
        }


}
}
