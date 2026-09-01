package PracticeQs.ArrayQs.IntermediateQs;

public class SecSmall {



        public static void secSmall(int[] arr){
            int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

            if(arr.length < 2){
                System.out.println("Not enough elements in the array");
            } else {

                for(int i = 0; i < arr.length; i++){
                    if(arr[i] < min1){
                        min2 = min1;
                        min1 =  arr[i];
                    }else if(arr[i] > min1 && arr[i] < min2){
                        min2 = arr[i];
                    }


                }

                System.out.println(min2);

            }




        }




        public static void main(String[] args) {
            int[] arr = {10, 1, 4, 65, 22, 50, 64};


            secSmall(arr);
        }
    }


