package Coding.Java.ArraysPrac;

public class FindMissing {


    public static int findMissing(int[] arr){
        int large = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > large){
                large = arr[i];
            }

            sum += arr[i];
        }

        int totSum = large * ((large + 1) / 2);



        int missingValue = totSum - sum;


        return missingValue;

    }


    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 7, 0, 1, 2};

        int result = findMissing(arr);

        System.out.print(result);
    }
}
