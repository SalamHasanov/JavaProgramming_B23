package replit_tasks;

import java.util.Scanner;

public class TestReplit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the patient portal!");
        System.out.println("Enter your first name");
        String fistName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        System.out.println("Enter your email");
        String email = scan.next();

        System.out.println("Enter your street");
        String street = scan.nextLine();
        scan.nextLine();

        System.out.println("Enter your city");
        String city = scan.next();

        System.out.println("Enter your state");
        String state = scan.next();

        System.out.println("Enter your zipcode");
        int zipCode = scan.nextInt();

        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();

        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();
        scan.close();

        String fullName ="Fullname:"+ lastName+","+fistName;
        String contacts = "Contacts: work phone number-" + workPhoneNumber + ",personal phone number -"+ personalPhoneNumber+", email: "+email+
                " Age:" + age + " Height: "+ height+ " Weight: "+weight+ "pounds Married?:"+isMarried;
        String address = "Address:" + street+","+city+","+state+", "+zipCode;

        System.out.println("Patient personal information"+fullName+address+contacts);








    }
}


