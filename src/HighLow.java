import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 10) + 1;
//        System.out.println(randomNumber);
        int userGuess = 0;
        int numberOfUserGuesses = 0;
        int guessLimit = 5;
        Scanner input = new Scanner(System.in);
        System.out.println("This program generates a random number between 1-10. See if you can guess it correctly within " + guessLimit + " attempts or less.");

        while (userGuess != randomNumber && numberOfUserGuesses < guessLimit) {
            System.out.print("Enter your guess: ");
            userGuess = input.nextInt();
            numberOfUserGuesses++;

            if (userGuess < randomNumber) {
                System.out.println("HIGHER");
            } else if (userGuess > randomNumber) {
                System.out.println("LOWER");
            }
        }

        if (userGuess == randomNumber) {
            System.out.println("GOOD GUESS!");
            System.out.println("It took you " + numberOfUserGuesses + " attempts to guess it correctly.");
        } else {
            System.out.println("Oh...Sorry, you went over your guess limit of " + guessLimit + " attempts.");
            System.out.println("The number that the program generated was " + randomNumber + ".");
        }

        input.close();
    }

}
