package day16_String;

import java.util.Scanner;

public class StringPractice3NestedIf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string with 3 letters:");
        String word = scan.next();
        scan.close();
        String result = "";

        if(word.length() == 3){
            if(word.charAt(1) == 'a'){
                result = "Cool word";

            }else{
                result = "Okay word";
            }


        }else{
            if(word.length()<3) {
                result = "Word is too short";
            }else {
                result = "Word is too long";
            }
            }
        System.out.println(result);
        }
    }

