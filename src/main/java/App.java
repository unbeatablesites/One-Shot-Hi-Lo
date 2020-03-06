import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        doLogic();
    }

    public static void doLogic(){

        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");

        Scanner scan = new Scanner(System.in);

        int userInput = scan.nextInt();

        Random rand = new Random();

    }



}
