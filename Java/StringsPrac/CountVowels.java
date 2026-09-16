package Coding.Java.StringsPrac;

public class CountVowels {

    public static int countVowels(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            s.toLowerCase();
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                count++;
            }
        }

        return count;

    }


    public static void main(String[] args) {

        String s = "Java Programming";

        int c = countVowels(s);

        System.out.println(c);


        String el = "Episcopal Ordination";

        c= countVowels(el);

        System.out.println(c);



    }
}
