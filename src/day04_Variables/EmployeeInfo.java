package day04_Variables;

public class EmployeeInfo {

    public static void main(String[] args) {
        String fistName = "Sam";
        String lastName = "Holden";
        String fullName = fistName + " " + lastName;
        System.out.println("Employee's full name is: " +fullName);

        System.out.println("----------------------------------");
        System.out.println(fistName + " " + lastName);

        String gender = "Male";
        String companyName = "Google";
        String jobTitle = "SDET";
        System.out.println(fullName +" " + "is" + " " + gender);
        int age = 25;

        System.out.println(fullName +" "+ "is" +" " +age+" years old");

        System.out.println(fullName +"' job title is "+jobTitle);
        boolean isMarried = true;
        boolean isFullTime = true;
        int salary = 110000;

        System.out.println(fullName + "is full time employee: " +isFullTime);
        System.out.println(fullName+ "is married: "+isMarried);
        System.out.println(fullName + " is making $"+salary);






    }
}
/*
 1. create a class named EmployeeInfo
                1. declare the following variables:
                    name, gender, age, companyName, jobTitle, isFullTime, isMarried, salary

                2. full info of the employee
 */