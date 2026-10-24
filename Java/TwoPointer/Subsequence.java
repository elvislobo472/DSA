package Coding.Java.TwoPointer;

public class Subsequence {

        public static boolean isSubsequence(String s, String t){
            int sIndex = 0, tIndex = 0;

            if(s.isEmpty()){
                return true;
            }

            while(sIndex < s.length() && tIndex < t.length()){

                if(s.charAt(sIndex) == t.charAt(tIndex)){
                    sIndex++;
                }

                tIndex++;
            }


            return sIndex == s.length();



        }


    static void main(String[] args) {
        String s = "";
        String t = "ahgdcb";


        System.out.println(isSubsequence(s, t));

    }

}
