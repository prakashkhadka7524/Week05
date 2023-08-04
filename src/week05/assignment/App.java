package week05.assignment;

public class App {
    public static void main(String[] args) {
        AsteriskLogger asteriskLogger=new AsteriskLogger(); // object of the AsteriskLogger class 
        asteriskLogger.log(""); // calling method
        asteriskLogger.error("");// calling method

        SpacedLogger spacedLogger= new SpacedLogger();//  object of the SpacedLogger
        spacedLogger.log("");// calling method
        spacedLogger.error("");// calling method


    }
}
