package day35_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Eggs");
        groceryList.add("Milk");
        groceryList.add("Water");
        groceryList.add("Vinegar");
        groceryList.add("Bread");

        System.out.println(groceryList);
        groceryList.set(0, "Soda");
        groceryList.set(3, "Tea");
        System.out.println(groceryList);

        boolean hasTea = groceryList.contains("Tea");
        boolean hasTea2 = groceryList.indexOf("Tea") >= 0;

        System.out.println(hasTea);
        System.out.println(hasTea2);

        groceryList.clear();


        System.out.println("________________________________");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        Integer a = 30;
        list1.remove(Integer.valueOf(30));
        System.out.println(list1);
        list1.clear();
        System.out.println("_____________________________________");

        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('B');
        list.add('A');
        list.add('D');
        list.add('C');

        System.out.println(list);

        list.indexOf('A'); //index 0
        list.lastIndexOf('A'); // index 4

        ArrayList<Character> uniqueChars = new ArrayList<>();
        for (Character each : list) {
            if (list.indexOf(each) == list.lastIndexOf(each)){
                uniqueChars.add(each);
            }

        }
        System.out.println(uniqueChars);
        uniqueChars.clear();
        list.clear();
        System.out.println("__________________________________");

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('B');
        characters.add('A');
        characters.add('C');
        characters.add('C');

        System.out.println(characters);

        ArrayList<Character> result = new ArrayList<>();

        for (Character each : characters) {
            if (!result.contains(each)){
                result.add(each);
            }

        }
        System.out.println(result);
        result.clear();
        characters.clear();

        System.out.println("______________________________________________");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);

        ArrayList<Integer> result2 = new ArrayList<>();

        for (int i = nums.size() - 1; i >= 0; i--) {
            result2.add(nums.get(i));
            }
        System.out.println(result2);
        nums.clear();
        result2.clear();

        System.out.println("_____________________________________");

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(10);
        n2.add(20);

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);

        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));

        }

    }


