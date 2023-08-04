package week05.assignment;

import java.util.Scanner;

public class SpacedLogger implements Logger { // implementing a interface Logger


    @Override
    public void log(String argument1) { // implementing the method
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word : ");
        argument1 = scanner.next();
        for (int i = 0; i < argument1.length(); i++) { // looping a String word
            System.out.print(argument1.charAt(i) + " "); // charAt makes everything separate
        }
    }

    @Override
    public void error(String argument2) {
    	System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word : ");
        argument2 = scanner.next();
        String newWord=""; // initializing newWord

        int i;
        for ( i = 0; i < argument2.length(); i++) { // looping the word until it will be done
    newWord+=argument2.charAt(i)+" "; //  newWord= newWord+argument2.charAt(i)
        }
        System.out.print("ERROR:"+newWord.toString()); // printing with the ERROR message


    }
}
