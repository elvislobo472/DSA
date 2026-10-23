package Coding.Java.OOPS;

public class VehicleRental {
    public static void main(String[] args) {

        Car c1 = new Car("Range Rover", 50000, 5);

        c1.displayDetails();

        System.out.println();

        Motorcycle m1 = new Motorcycle("Royal Enfield", 2000, 450);

        m1.displayDetails();



    }

}
