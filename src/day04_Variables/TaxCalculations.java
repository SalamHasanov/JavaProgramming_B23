package day04_Variables;

public class TaxCalculations {

    public static void main(String[] args) {


        int salary = 120000;
        double stateTax = 0;
        double federalTax = 0.21;
        double totalTax = stateTax + federalTax;

        double totalStateTax = salary * stateTax;
        double totalFederalTax = salary * federalTax;
        double salaryAfterTax = salary - totalStateTax - totalFederalTax;

        System.out.println("Your salary is "+salary);
        System.out.println("You need to pay $"+totalStateTax + " to state tax");
        System.out.println("You need to pay $"+totalFederalTax + " to federal tax");
        System.out.println("Your take home salary is $" +salaryAfterTax);

    }
}
