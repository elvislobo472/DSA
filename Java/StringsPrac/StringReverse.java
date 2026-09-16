package Coding.Java.StringsPrac;

public class StringReverse {

    public static String stringReverse(String s){

        String reversed = "";


        for(int i = s.length() -1; i >=0; i--){
            reversed = reversed + s.charAt(i);
        }

        return reversed;

    }




    public static void main(String[] args) {

        String word = "Lobo Elvis";


        String reversed = stringReverse(word);


        System.out.println(reversed);




    }
}
