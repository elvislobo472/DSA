package Coding.Java.StringsPrac;

public class FrequentCharacter {

    public static void mostFrequent(String word){

        if(word == null || word.isEmpty()){
            throw new IllegalArgumentException("String cannot be empty");
        }

        int[] freq = new int[256];

        for(int i = 0; i < word.length(); i++){
            freq[word.charAt(i)]++;
        }


        int maxCount = -1;
        char mostFreq =' ';

        for(int i = 0; i < word.length(); i++){
            if(freq[word.charAt(i)] > maxCount){
                mostFreq = word.charAt(i);
                maxCount = freq[word.charAt(i)];
            }
        }


        System.out.println(mostFreq +" "+ maxCount);

    }

    public static void main(String[] args) {
        String word = "Test String";

        word = word.toLowerCase();

        mostFrequent(word);



    }

}
