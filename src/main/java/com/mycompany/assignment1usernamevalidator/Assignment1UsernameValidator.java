/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment1usernamevalidator;
//Import a scanner 
    import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Assignment1UsernameValidator {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
       //Declarations 
       String Username;
       String Password;
       String Firstname;
       String Lastname;
       
       //Prompt the user to enter their validation details 
        System.out.println("Enter username");
        String username = scanner.nextLine();
        
        System.out.println("Enter your password");
        String password = scanner.nextLine();
        
        System.out.println("Enter firstname");
        String firstname = scanner.nextLine();
        
        System.out.println("Enter lastname");
        String lastname = scanner.nextLine();
        
        //Username is valid
        if(username.contains("username must contain an underscore")&& username.length()<=5){
            System.out.println("username is valid proceed with the action");}
       //Username is valid
        else{
            //Username is not valid
                System.out.println("Username is forbidden. Please ensure that the username contains an underscore and is 5 characters or less");
                }   
        
        //An if statement that supports the requirements of the password 
        
        if(password.length()>=8 && password.matches("[A-Z].") && password.matches("[0-9].") && password.contains(".!@#$^%&*()")){
            System.out.println("Password input deemed correct");
            //Password is valid
        }else{
            //Password is not valid
            System.out.println("Password is forbidden. Please ensure that the passwrd contains a special character and and a number and is less or equals to 8 characters");
        }
        
    }
}
