package Coding.Java.OOPS;

public class EmployeeRecordDisplay {
    public static void main(String[] args) {


        EmployeeRecords emp1 = new EmployeeRecords();

        emp1.setEmpId(255);
        emp1.setDepartmentName("Hypervisor");
        emp1.setReportingManager("Kenneth Adams");


        emp1.getEmpId();
        emp1.getDepartmentName();
        emp1.getReportingManager();

        System.out.println();

        EmployeeRecords emp2 = new EmployeeRecords();


        emp2.setEmpId(2115);
        emp2.setDepartmentName("");
        emp2.setReportingManager("");

        emp2.getEmpId();
        emp2.getDepartmentName();
        emp2.getReportingManager();



    }

}
