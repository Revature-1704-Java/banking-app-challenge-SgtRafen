package com.revature;
import java.util.Scanner;



public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        Savings savings = new Savings();
        Checkings checking = new Checkings();
        String answer = "";

        System.out.println("Please Select checking | saving | read");
        answer = sc.nextLine();
        System.out.println("");

        if(answer.equals("checking")){//testing to see if checkings class.openaccount works
            checking.openAccount();
        }
        else if(answer.equals("saving")){ //testing to see if savings class.openAccount works
            savings.openAccount();
        }
        else if(answer.equals("read")){ //test to see if the file is able to be read in
            savings.readFile();
        }
        else{
            System.out.println("Sorry, that is not a valid command");
        }
    }
}
