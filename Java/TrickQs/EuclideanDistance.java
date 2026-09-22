package Coding.Java.TrickQs;

public class EuclideanDistance {
    public static void euclidDist(int x1, int x2, int y1, int y2) {

        double eucDist = Math.sqrt(
                ((x2 - x1) * (x2 - x1) ) + ((y2 - y1) * (y2 - y1) )
        );

        System.out.println(eucDist);

    }


    public static void main(String[] args) {

        int x1 = 3, x2 = 10, y1 = 2, y2 = 8;


        euclidDist(x1, x2, y1, y2);


    }

}
