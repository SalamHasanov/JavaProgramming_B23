package day28_CustomMethodsIntro;

public class MethodsWithParameter {

    public static void main(String[] args) {

        eligibleToBuyAlcohol(30);
    }


    public static void eligibleToBuyAlcohol(int age) {
        if (age >= 21) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible");
        }



    }


    }


/// 1. create a method that can print odd numbers between 1~100 in a same line seperated by space
//
//    2. create a method that can print even numbers between 1~100
//
//    3. create a method that can calculate the age of the person
//
//    4. check eligibility to vote
