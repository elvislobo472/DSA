package Coding.Java.StringsPrac;

import java.util.Scanner;

public class UserName {

    public static String userName(String email){
        String user = "";
        for (int i =0; i < email.length(); i++){


            if(email.charAt(i) == '@'){
                break;
            }else{
                user += email.charAt(i);
            }

        }

        return user;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String email = "";


        System.out.println("Enter the email:");

        email = sc.next();

        String user = userName(email);


        System.out.println(user);

    }
}
