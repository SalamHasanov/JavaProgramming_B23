package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9) );

        ArrayList<Integer> list = new ArrayList<>();
        //list.addAll(1,1,2,3,4,5,6,7,8,9)
        list.addAll(nums);
        list.addAll(Arrays.asList(10,11,12,13,14,15));
        System.out.println(list);
        list.clear();
        nums.clear();
        System.out.println("____________________________________");

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Muhtar","Filip", "Dilem", "Abbos", "Zorana"));

        System.out.println(students);
        students.removeAll(Arrays.asList("Muhtar", "Dilem", "Zorana", "Fili"));
        System.out.println(students);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,1,1,1,2,2,2,3,3,3,4,4,1,1,1,1,5,5,7,8,5,6,9));
        System.out.println(numbers);

        numbers.retainAll(Arrays.asList(9));
        //numbers.removeAll(Arrays.asList(1));
        System.out.println(numbers);
        numbers.clear();

        System.out.println("__________________________________________________");


        ArrayList<String> groceryList = new ArrayList<>();
         groceryList.addAll(Arrays.asList("Soda", "Milk", "Wine", "Beer", "Eggs", "Bread", "Water", "Apple", "Cherry"));

         boolean r = groceryList.containsAll(Arrays.asList("Wine", "Beer", "Soda"));

        System.out.println(r);


    }
}
