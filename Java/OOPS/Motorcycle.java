package Coding.Java.OOPS;

public class Motorcycle extends Vehicle{
    private int engineCapacity;


    public void setEngineCapacity(int engineCapacity){
        this.engineCapacity = engineCapacity;
    }


    Motorcycle(String name, double rentalPricePerDay, int engineCapacity){

        super(name, rentalPricePerDay);

        this.engineCapacity = engineCapacity;

    }


    @Override
    public void displayDetails(){
        System.out.println("===Motorcycle Details===");

        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity);
    }

}
