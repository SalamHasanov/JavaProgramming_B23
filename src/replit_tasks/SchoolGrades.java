package replit_tasks;

import java.util.Scanner;

public class SchoolGrades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        String subject1 = scan.next();
        double number1 = scan.nextDouble();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String subject2 = scan.next();
        double number2 = scan.nextDouble();
        System.out.println("Please enter subject name number 3 and score for this subject");
        String subject3 = scan.next();
        double number3 = scan.nextDouble();
        System.out.println("Please enter subject name number 4 and score for this subject");
        String subject4 = scan.next();
        double number4 = scan.nextDouble();
        System.out.println("Please enter subject name number 5 and score for this subject");
        String subject5 = scan.next();
        double number5 = scan.nextDouble();
        scan.close();

        double sum = (number1 + number2 + number3 + number4 + number5) / 5;

        System.out.println("Summary: "+subject1+" - "+number1+", "+subject2+ " - "+number2+", "+subject3+" - "+number3+", "+subject4+" - "+number4+", "+subject5+" - "+number5);
        System.out.println("Your average score is: "+sum);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye");
    }
}
