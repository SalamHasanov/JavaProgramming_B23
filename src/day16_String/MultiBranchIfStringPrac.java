package day16_String;

import java.util.Scanner;

public class MultiBranchIfStringPrac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter tree words:");
        String word1 = scan.next();
        String word2 = scan.next();
        String word3 = scan.next();
        scan.close();
        String result = "";

        boolean allSame = word1.length() == word2.length() && word1.length() == word3.length();
        boolean notSame = word1.length() != word2.length() && word2.length() != word3.length() && word1.length() != word3.length();



        if (allSame){
            result = "All word are same length";
        }else if(notSame) {
            result = "All different length";
        }else{
            result = "Not same nor different length";
        }
        System.out.println(result);
    }
}
