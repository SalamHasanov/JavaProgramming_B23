package day25_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

        String [] arr1  = {"java", "java", "pyhton","c#"};
        int count = 0 ;

        for (String each : arr1) {

            for (String each1 :
                    arr1) {
                if (each1.equals("java")) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }
        }
    }
}
