package day29_ReturnMethods;

public class ReturnMethodsPractice3 {


    public static String removeDuplicates(String str){
        String result = "";
        for (String each: str.split("")){
            if (!result.contains(each)){
                result += each;
            }

        }
        return result;
    }

}
