package Coding.Java.OOPS;

public class Car extends Vehicle {

    private int numberOfSeats;


    public void setNumberOfSeats(int numberOfSeats){
        this.numberOfSeats = numberOfSeats;
    }


    Car(String name, double rentalPricePerday, int numberOfSeats){
        super(name, rentalPricePerday);

        this.numberOfSeats = numberOfSeats;

    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Number of Seats: " + numberOfSeats);
    }





}
