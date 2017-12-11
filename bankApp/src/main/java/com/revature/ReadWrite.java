package com.revature;
import java.util.Scanner;
import java.io.*;

public class ReadWrite 
{
    void fileWriter(String fileName, String firstName, String lastName, String accountType, float deposit)
    {
        FileWriter fw = null;

        try{
            fw = new FileWriter("C:/Users/Kenneth Franks/JavaFolder/bankApp/src/main/java/com/revature/bankAccounts/" +fileName);
            fw.write("First Name:" + firstName);
            fw.write("\nLast Name:" + lastName);
            fw.write("\naccountType:" + accountType);
            fw.write("\nBalance:$" + String.valueOf(deposit));
            fw.close();
        } catch (IOException ex){
            ex.printStackTrace();
        } finally {
        }
        
    }
    
    void fileReader(String fileName){
        FileReader fr = null;

        try{
            fr = new FileReader("C:/Users/Kenneth Franks/JavaFolder/bankApp/src/main/java/com/revature/bankAccounts/" +fileName);
            int i;
            while((i = fr.read()) != -1){
                System.out.print((char)i);
            } 
            fr.close();
        } catch (FileNotFoundException ex){
            System.out.println("We're Sorry this file does not exsist");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        

    }
    void rewriteLine(String fileName, float balance)
    {
        File fileRewrite = new File("C:/Users/Kenneth Franks/JavaFolder/bankApp/src/main/java/com/revature/bankAccounts/" +fileName);
        String oldContent = "";
        String oldString = "Balance:$";
        BufferedReader reader = null;
        FileWriter fw = null;

        try{
            reader = new BufferedReader(new FileReader(fileRewrite));

            String line = reader.readLine();

            while(line != null){
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }
            String newString = "Balance:$ " + balance;
            String newContent = oldContent.replaceAll(oldString, newString);
            fw = new FileWriter("C:/Users/Kenneth Franks/JavaFolder/bankApp/src/main/java/com/revature/bankAccounts/" +fileName);

            fw.write(newContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
    }
   
    
    
}