package Coding.Java.OOPS;

public class Developer extends Employees{

    private String programmingLanguage;




    public void setProgrammingLanguage(String programmingLanguage){
        this.programmingLanguage = programmingLanguage;
    }


    Developer(String name, String programmingLanguage, double salary){
        super(name, salary);

        this.programmingLanguage =programmingLanguage;

    }


    public void writeCode(){
        System.out.println("This Employee does coding in " + programmingLanguage);
    }





}
