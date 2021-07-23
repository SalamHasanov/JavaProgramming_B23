package day23_Arrays;

import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {

        String[] months = {"January" , "February" , "March" , "April" ,
                "May" , "Jun" , "July" , "August" , "September" , "October" ,
                "November" , "December" , };

        System.out.println("Enter a number form 1 to 12:");
        int n = new Scanner(System.in).nextInt();


        System.out.println(months[n-1]);



    }
}
