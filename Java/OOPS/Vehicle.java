package Coding.Java.OOPS;

public class Vehicle {
    private String brand;
    private double rentalPricePerDay;


    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setRentalPriceDay(double rentalPricePerDay){
        this.rentalPricePerDay = rentalPricePerDay;
    }


    Vehicle(String brand, double rentalPriceDay){
        this.brand = brand;
        this.rentalPricePerDay = rentalPriceDay;
    }


    public void displayDetails(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Rental Price/Day: " +this.rentalPricePerDay);

    }


}
