package Coding.Java.TrickQs;

public class ElectricityBill {

    public static void elecBill(int unit) {

        int unitS4 = 0,unitS3 = 0, unitS2 = 0;


        if(unit > 300){
            unitS4 = unit - 300;
//            System.out.println(unitS4);
        }

        if(unit > 200){
            unitS3 = unit - (200 + unitS4);
//            System.out.println(unitS3);
        }

        if(unit > 100){
            unitS2 = unit - (100 + unitS3 + unitS4);
//            System.out.println(unitS2);
        }

        int unitS1 = unit - (unitS2 + unitS3 + unitS4);
//        System.out.println(unitS1);


        int totalBill = (unitS1*5) + (unitS2 * 7) + (unitS3 * 10) + (unitS4 * 15);
        System.out.println(totalBill);

    }

    public static void main(String[] args) {


        int utilizedUnits = 250;

        elecBill(utilizedUnits);

    }

}
