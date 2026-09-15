package Coding.Java.BasicsPrac;

public class PatternSix {


    public static void main(String[] args) {
        int n = 5;

        for(int i = 0; i < n; i++){

            int stars = (2*i) + 1;

            int space = 2 * (n - (i+1));

            for(int j = 0; j < space; j++){
                System.out.print(" ");
            }


            for(int k =0; k < stars; k++) {

                if (k == stars - 1) {
                    System.out.print("*");

                } else {
                    System.out.print("* ");

                }
            }
            System.out.println();







        }

    }
}
