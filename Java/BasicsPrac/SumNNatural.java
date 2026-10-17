package Coding.Java.BasicsPrac;

public class SumNNatural {

    public static int sumOfNNaturalNumbers(int n){
        if(n == 1){
            return 1;
        }

        return n + sumOfNNaturalNumbers(n-1);
    }



    public static void main(String[] args) {
        int n = 5;

        System.out.println(sumOfNNaturalNumbers(n));
    }

}
