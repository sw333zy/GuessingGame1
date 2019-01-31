import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        //make variable that's random from 1 to 10 need to add 1 because otherwise it starts at 0
        int randomNum = 1 + (r.nextInt(10));

        System.out.println("I have chosen a number between 1 and 10. Try to guess it!");
        int userNum = keyboard.nextInt();

        while(randomNum != userNum){
            System.out.println("Your guess is " + userNum);
            System.out.println("This is incorrect. Try again!");
            userNum = keyboard.nextInt();
        }
        // Dont actually need an if statement because while loop exits to the next line when condition is NOT TRUE
//        if (randomNum == userNum){
            System.out.println("Your guess is " + userNum);
            System.out.println("That's right! Great answer!");
//        }
    }
}
