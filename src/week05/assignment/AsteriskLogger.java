package week05.assignment;

import java.util.Scanner;

public class AsteriskLogger implements Logger { // implementing the interface Logger


    @Override
    public void log(String argument1) { // implementing method from interface
        Scanner scanner= new Scanner(System.in); // creating Scanner object
        System.out.println("Enter a word : ");
        argument1=scanner.next(); // input argument1
        System.out.println("***"+argument1+"***");
    }

    @Override
    public void error(String argument1) { // impliemnting method from Logger
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter  a word : ");
        argument1=scanner.next();
        System.out.println(asterisk(argument1)); // calling astrisk method and print

        System.out.println("***Error:"+argument1+"***");
        System.out.println(asterisk(argument1)); // calling astrisk method and print
    }
    public String asterisk(String argument1){ // creating a method for the asterisks
        String asterisk=""; // initializing the asterisk with empty
        int asterisks=13+argument1.length();
        for (int i=0; i<asterisks; i++){ // looping
            asterisk+="*"; // asterisk=asterisk+"*"

        }
        return asterisk; // returning the method
    }

}




