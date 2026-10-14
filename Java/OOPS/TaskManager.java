package Coding.Java.OOPS;


class Task{
    int taskID;
    String title;
    String description;
    boolean isCompleted;


    Task(int taskID, String title, String description, boolean isCompleted){
        this.taskID = taskID;
        this.title = title;
        this.description = description;
        this.isCompleted = isCompleted;

    }

    public void markCompleted(){

        isCompleted = true;
        System.out.println("Marking task as completed.....");
        System.out.println("Completed: " + isCompleted);

    }

    public void reopenTask(){
        isCompleted = false;

        System.out.println("Reopening task.....");
        System.out.println("Completed: " + isCompleted);
    }

    public void displayTask(){
        System.out.println("Task ID: " +taskID);
        System.out.println("Task Name: " + title );
        System.out.println("Description: " + description );
        System.out.println("Completed: " + isCompleted);
    }


}

public class TaskManager {

    public static void main(String[] args) {
        Task t1 = new Task(1001, "Learn Java", "Start with OOPS", false);


        Task t2 = new Task(1002, "Learn Linux", "Learn Process Management", true);


        t1.displayTask();

        System.out.println();

        t1.markCompleted();

        System.out.println();

        t1.displayTask();

        System.out.println();

        t2.displayTask();

        System.out.println();

        t2.reopenTask();
        System.out.println();

        t2.displayTask();








    }


}
