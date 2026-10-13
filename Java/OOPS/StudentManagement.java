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
        s2.displayDetails();
    }
}
