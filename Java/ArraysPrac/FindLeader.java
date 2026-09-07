package Coding.Java.ArraysPrac;

public class FindLeader {

    public static int findLeader(int[] arr) {
        int id = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    arr[id++] = arr[i];
                }else{
                    id = 0;break;
                }
            }
        }

        return id;

    }


    public static void main(String[] args) {


        int[] arr = {16, 17, 4, 3, 5, 2};


        int id = findLeader(arr);


        for(int i = 0; i < id; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
