import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(5, 5));
        System.out.println(subtraction(10, 5));
        System.out.println(multiplication(5, 5));
        System.out.println(division(10, 2));
        System.out.println(modulus(6, 3));

        int userInput = getInteger(1, 10);
        System.out.println("User input: " + userInput);

        factorial();
        dice();

    }

    //#1 Basic Arithmetic
    public static long addition(long input1, long input2) {
        return input1 + input2;
    }

    public static long subtraction(long input1, long input2) {
        return input1 - input2;
    }

    public static long multiplication(long input1, long input2) {
        return input1 * input2;
    }

    public static long division(long input1, long input2) {
        return input1 / input2;
    }

    public static long modulus(long input1, long input2) {
        return input1 % input2;
    }

    //#2 Validates that user input
        public static int getInteger(int min, int max) {
            Scanner scanner = new Scanner(System.in);
            int userInput = 0;
            while (true) {
                System.out.print("Enter a number between " + min + " and " + max + ": ");
                try {
                    userInput = scanner.nextInt();
                    if (userInput >= min && userInput <= max) {
                        break;
                    }
                    System.out.println("Invalid input, try again!");
                } catch (Exception e) {
                    System.out.println("Invalid input, try again!");
                    scanner.nextLine();
                }
            }
            scanner.close();
            return userInput;
        }

        //#3 Calculate the factorial of a number.


public static void factorial () {
        Scanner input = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter an integer between 1 and 10: ");
            int num = input.nextInt();

            while (num < 1 || num > 10) {
                System.out.print("Invalid input. Enter an integer between 1 and 10: ");
                num = input.nextInt();
            }

            long factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }

            System.out.println("The factorial of " + num + " is " + factorial);

            System.out.print("Do you want to continue? (y/n): ");
            choice = input.next();
        }

        System.out.println("Goodbye!");
        input.close();
    }

    //#4 Create an application that simulates dice rolling.

    public static int rollDice(int sides) {
        return (int) (Math.random() * sides) + 1;
    }
    public static void dice () {
        Scanner input = new Scanner(System.in);
        String choice = "y";

        System.out.print("Enter the number of sides for a pair of dice: ");
        int sides = input.nextInt();

        while (choice.equalsIgnoreCase("y")) {
            int dice1 = rollDice(sides);
            int dice2 = rollDice(sides);
            System.out.println("Roll: " + dice1 + " " + dice2);

            System.out.print("Do you want to roll again? (y/n): ");
            choice = input.next();
        }

        System.out.println("Goodbye!");
        input.close();
    }

}

