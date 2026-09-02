package Coding.Java.ArraysPrac;


public class SecLarge {
    public static void secLarge(int[] arr){
        int max1 = -1, max2 = -1;

        if(arr.length < 2){
            System.out.println("Not enough elements in the array");
        } else {

            for(int i = 0; i < arr.length; i++){
                if(arr[i] > max1){
                    max2 = max1;
                    max1 = arr[i];
                }else if(arr[i] < max1 && arr[i]  > max2){
                    max2 = arr[i];
                }


            }

            System.out.println(max2);

        }




    }




    public static void main(String[] args) {
        int[] arr = {10, 1, 4, 65, 22, 50, 64};


        secLarge(arr);
    }
}