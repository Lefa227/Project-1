/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1usernamevalidator;
    //Import a Scanner 
import java.awt.BorderLayout;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Username {
    // Declarations 
    
    private String sUsername;
    private String sPassword;
    
    //Constructor to initialize sUsername and sPassword
    
    public login(String sUsername, String sPassword){
        this.sUsername = sUsername;
        this.sPassword = sPassword;
    }
    public boolean checkUsername(String sUsername){
        //Check if username is more than 5 characters long and contains an underscore 
        
        return sUsername.length()>=5 && sUsername.contains("_");
        
        boolean checkPasswordComplexity(String  sPassword){
            // Check if password is at least 8 characters long
        
        public boolean lengthCheck = sPassword.length() >=8;
        
        // Check if Password contains a capital letter, a number, and a special character. 
        
       public boolean capitalCheck = false;
       public boolean numberCheck = false;
       public boolean specialCheck = false;
        
        for(char c: sPassword.tocharArray()){
            if(character.isUpperCase(c)){
                
                capitalCheck = true;
            }else if(Charater.isDigit(c)){
                numberCheck = true;
            }else if(!Character.isLetterOrDigit(c)){
                SpecialCheck =true;
            }
        }
            // Return true only if all checks are passed return legthCheck && capitalCheck && numberCheck && SpecialCheck;
        
        public void registerUser(){
            
            //Check username validity
            
            boolean is UsernameValid = CheckUsername(sUsername);
            
            //Check password complexity 
            
            boolean sPasswordComplex = checkPassowrdComplexity (sPassword);
            
            //Display registration message
            
            if(isUsernameValid && sPassword complex){
            System.out.println("Username and Password meet the criteria. User registered successfully");
            
        }else{
                System.out.println("Username or Password does not meet the criteria.User registration failed");
                }
        boolean loginUser(String sUsername, String sPassword){   
        }
        //Check if the provided username and password match the stored ones
        
       return sUsername.equals(sUsername) && sPassword.equals(sPassword);
        }
         public void returnLoginStatus(boolean loginStatus) {
 
        // Display login status
        if(loginStatus){
            System.out.println("\n Login Successful!");
        }
        }
    }
}
