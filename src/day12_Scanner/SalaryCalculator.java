package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your hourly rate:");
        double hourlyRate = scan.nextDouble();
        System.out.println("How many hours do you work in a week?:");
        int hoursInWeek = scan.nextInt();
        System.out.println("How many weeks do you work in a year");
        int weeksInYear = scan.nextInt();
        double salary = (hourlyRate * hoursInWeek) * weeksInYear;
        System.out.println("You are making $"+hourlyRate+" per hour");
        System.out.println("You work " +hoursInWeek+ " hours in a week");
        System.out.println("Your salary is $"+ salary);

    }
}
