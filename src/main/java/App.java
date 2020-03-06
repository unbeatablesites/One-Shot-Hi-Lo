import java.util.Random;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        doLogic();
    }

    public static void doLogic(){

        Scanner scan = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");

        int userInput = scan.nextInt();

        Random rand = new Random();

        int randomNumber = 1 +rand.nextInt(100);

        if(randomNumber == userInput){

            System.out.println("You guessed it!  What are the odds?!?");

        }else if (randomNumber > userInput){

            System.out.println("Sorry, you are too low.  I was thinking of " + randomNumber);
        }else{
            System.out.println("Sorry, you are too High.  I was thinking of " + randomNumber);
        }


    }



}
