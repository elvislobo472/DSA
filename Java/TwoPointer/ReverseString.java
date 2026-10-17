package Coding.Java.TwoPointer;

public class ReverseString {


    public static String reverseString(char[] arr){




        int start = 0;
        int end = arr.length -1;




        while(start < end){

            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;


            start++;
            end --;
        }



        return new String(arr);
    }







    public static void main(String[] args) {
        String s = "Hello";

        char[] arr = s.toCharArray();


        System.out.println(reverseString(arr));

    }
}
