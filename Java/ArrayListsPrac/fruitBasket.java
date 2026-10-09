package Coding.Java.ArrayListsPrac;

import java.util.ArrayList;

public class fruitBasket {


    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Kiwi");


        System.out.println(fruits);

        System.out.println("Size: "+fruits.size());

        System.out.println("First: " + fruits.get(1));

        System.out.println("Last: " + fruits.get(fruits.size()-1));

    }
}
