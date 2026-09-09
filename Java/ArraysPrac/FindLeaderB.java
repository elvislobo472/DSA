package Coding.Java.ArraysPrac;



public class FindLeaderB {


    public static int findLeader(int[] arr) {
        int id = 0;
//        boolean isLeader = true;

        for(int i = 0; i < arr.length; i++){
            boolean isLeader = true;

            for(int j= i+1; j < arr.length; j++){

                if(arr[i] <= arr[j]){
                    isLeader = false;
                    break;
                }
            }

            if(isLeader){
                arr[id++] = arr[i];
            }
        }

//        System.out.println(id);
        return id;

    }


    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};

        int newSize = findLeader(arr);


        for(int i = 0; i < newSize; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
