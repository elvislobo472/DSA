package Coding.Java.OOPS;

public class Employees {
    private String name;
    private double salary;

    public void setName(String name){
        this.name = name;
    }


//    public void getName(){
//        System.out.println(this.name);
//    }


    public void setSalary(double salary){
        this.salary = salary;
    }

//    public void getSalary(){
//        System.out.println(this.salary);
//    }


    Employees(String name, double salary){
        this.name = name;
        this.salary = salary;

    }



    public void displayDetails(){
        System.out.println("Employee Name: " + this.name);
        System.out.println("Salary: " + this.salary);
    }



}
