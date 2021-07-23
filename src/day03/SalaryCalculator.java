package day03;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate = 55;
        int weeklyHours = 40;

        int salary = hourlyRate * weeklyHours * 52;

        System.out.print("Yearly Salary is: ");
        System.out.println(salary);

        double taxRate = 0.32;
        double totalTax = salary * taxRate;
        double salaryAfterTax = salary - totalTax;

        System.out.println(salaryAfterTax);


    }
}
