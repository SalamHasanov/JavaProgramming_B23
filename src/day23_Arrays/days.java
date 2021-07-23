package day23_Arrays;

import java.util.Scanner;

public class days {
    public static void main(String[] args) {

        String[] days = {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println("Enter a number");
        int number = new Scanner(System.in).nextInt();

        System.out.println(days[number-1]);


    }
}
