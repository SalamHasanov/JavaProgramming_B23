package day35_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add( 10 );
        numbers.add( 20 );
        numbers.add( 30 );
        numbers.add( 40 );
        System.out.println(numbers.get(2));
        numbers.set(2, 15);

        System.out.println(numbers);
        System.out.println("_________________________________________");


        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

        }
        System.out.println("___________________________________");
        for (Integer each : numbers) {
            System.out.println(each);

        }


    }
}
