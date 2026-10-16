package Coding.Java.TwoPointer;

public class Palindrome {


    public static boolean isPalindrome(String s){

        String result = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();




        int start = 0;
        int end = result.length() -1;

        boolean palindrome = true;


        while(start < end){

            if(result.charAt(start) != result.charAt(end)){
                return false;

            }


            start++;
            end --;
        }



        return palindrome;
    }




    public static void main(String[] args) {
        String s = ",; W;:GlG:;l ;,";


        System.out.println(isPalindrome(s));

    }



}
