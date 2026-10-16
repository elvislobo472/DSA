package Coding.Java.TwoPointer;

public class Palindrome {


    public static boolean isPalindrome(String s){

        String result = s.replaceAll("[^a-zA-Z0-9]", "");




        int start = 0;
        int end = result.length() -1;

        boolean palindrome = true;


        while(start < end){

            if(result.charAt(start) == result.charAt(end)){
                palindrome = true;

            }else{
                palindrome = false;
            }


            start++;
            end --;
        }



        return palindrome;
    }




    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";


        System.out.println(isPalindrome(s));

    }



}
