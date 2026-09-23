package Coding.Java.TrickQs;

public class ParkingFeeCalc {


    public static void parkingFeeCalculator(int hours){

        int slabS1 = 0, slabS2 = 0, slabS3 = 0;


        if(hours > 5){
            slabS3 = hours - 5;
        }

        if(hours > 2){
            slabS2 = hours - (2 + slabS3);
        }

        slabS1 = hours - (slabS3 + slabS2);

        int totalParkingFee = (slabS1 * 30) + (slabS2 * 20) + (slabS3 * 10);

        System.out.println(totalParkingFee);



    }



    public static void main(String[] args) {

        int hours = 10;


        parkingFeeCalculator(hours);


    }




}
