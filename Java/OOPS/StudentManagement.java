package Coding.Java.OOPS;


class Student{
    String name;
    int rollNumber;
    double marks;

    public void displayDetails(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks);
    }


    //Implemented Polymorphism

    // both printDetails() have different parameters

    public void printDetails(String name, int rollNumber){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);

    }


    public void printDetails(String name, double marks){
        System.out.println("Name: " + name);

        System.out.println("Marks: " + marks);
    }

    Student(String name, int rollNumber, double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;

    }

}



public class StudentManagement {


    public static void main(String[] args) {
        Student s1 = new Student("Elvis", 129, 85.0);


        Student s2 = new Student("Akhil", 104, 88.0);

        s1.displayDetails();


        System.out.println();
        s1.printDetails(s1.name, s1.rollNumber);


        System.out.println();
        s2.printDetails(s2.name, s2.marks);
    }
}
