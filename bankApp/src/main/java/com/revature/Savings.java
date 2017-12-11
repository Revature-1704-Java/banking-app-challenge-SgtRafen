package com.revature;
import java.io.*;
import java.util.Scanner;

public class Savings implements Accounts{
    float balance;
    ReadWrite rw = new ReadWrite();

    public void openAccount()
    {
        String fileName = "";
        String firstName = "";
        String lastName = "";
        String accountType = "Savings";
        float deposit = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter AccountName (First name and last initial)");
        fileName = sc.nextLine();
        File f = new File("C:/Users/Kenneth Franks/JavaFolder/bankApp/src/main/java/com/revature/bankAccounts/" + fileName);

        if (f.exists()){
            System.out.println("Sorry, but that account already exsists");
        }
        else{
            System.out.println("");
            System.out.println("Enter First Name: ");
            firstName = sc.nextLine();
    
            System.out.println("");
            System.out.println("Enter Last Name: ");
            lastName = sc.nextLine();
            
            System.out.println("");
            System.out.println("Enter First Deposit: ");
            while(!sc.hasNextFloat()){
                System.out.println("");
                System.out.println("Please enter numbers only!");
                sc.next();
            }
                deposit = sc.nextFloat();

         
    
            rw.fileWriter(fileName, firstName, lastName, accountType, deposit);
        }
        sc.close();
        
    }
    public void depositNumber(float amount){
        if(amount > 0){
            balance += amount;
        }
        else{
            System.out.println("");
            System.out.println("You must enter a number greater than 0");
            System.out.println("To deposit into the current account");
            System.out.println("");
        }
        //write new balance to the current account
     
    }

    public void withdrawNumber(float amount){
        if(amount >= 0 && amount <= balance){
            balance -= amount;
        }
        else{
            System.out.println("");
            System.out.println("You must enter a number greater than 0");
            System.out.println("To withdraw from the current account");
            System.out.println("");
        }
        // write new balance to the current account
    }
    public void readFile(){
        String fileName = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter AccountName (First name and last initial)");
        fileName = sc.nextLine();
        rw.fileReader(fileName);
        sc.close();
    }
}