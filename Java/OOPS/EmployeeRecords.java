package Coding.Java.OOPS;

public class EmployeeRecords {

    private long empId;

    private String departmentName;

    private String reportingManager;




    public void setEmpId(int empId){
        if(empId < 0){
            System.out.println("Please enter a valid Employee ID");

        }else{
            this.empId = empId;
        }
    }


    public void getEmpId(){

        System.out.println("Employee ID: "+ this.empId);

    }


    public void setDepartmentName(String departmentName){

        if(departmentName.isEmpty()){
            System.out.println("Please enter the department");
        }else{
            this.departmentName = departmentName;
        }


    }



    public void getDepartmentName(){

        System.out.println("Department Name: " + this.departmentName);
    }


    public void setReportingManager(String reportingManager){
        if(reportingManager.isEmpty()){
            System.out.println("Please enter a valid Name");
        }else{
            this.reportingManager = reportingManager;
        }


    }



    public void getReportingManager(){
        System.out.println("Reporting Manager: " + this.reportingManager);
    }






}
