package Coding.Java.OOPS;

public class Vehicle {
    private String brand;
    private double rentalPriceDay;


    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setRentalPriceDay(double rentalPriceDay){
        this.rentalPriceDay = rentalPriceDay;
    }


    Vehicle(String brand, double rentalPriceDay){
        this.brand = brand;
        this.rentalPriceDay = rentalPriceDay;
    }


    public void displayDetails(){
        System.out.println("Brand: " + this.brand);
        System.out.println("Rental Price/Day: " +this.rentalPriceDay);

    }


}
