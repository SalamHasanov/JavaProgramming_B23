package day06_UnaryOperators;

public class LeapYear {

    public static void main(String[] args) {
        int year = 2023;
        boolean isLeapYear = year % 4 == 0 ;
        //if the year is evenly divisible by 4, then it's leap year.

        System.out.println(year + " is a leap year: " + isLeapYear);


    }
}
