package Coding.Java.StringsPrac;

import java.util.*;

public class ReplaceCharacter {

    public static String replaceCharacter(String original){
        String edited = "";

        for(int i = 0; i< original.length(); i++){
            if(original.charAt(i) == 'e' || original.charAt(i) == 'E' ){
                edited += "i";
            }else{
                edited += original.charAt(i);
            }
        }


        return edited;

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String original = new String();

        System.out.println("Enter String:");

        original = sc.next();


        String edited  = replaceCharacter(original);


        System.out.println(edited);






    }
}
