package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        String input = this.scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }

    public int getInt(int min, int max) {
        while (true) {
            try {
                int input = Integer.parseInt(this.scanner.nextLine());
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.println("Enter a number between " + min + " and " + max);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter an integer.");
            }
        }
    }

    public int getInt() {
        while (true) {
            try {
                return Integer.parseInt(this.scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter an integer.");
            }
        }
    }

    public double getDouble(double min, double max) {
        while (true) {
            try {
                double input = Double.parseDouble(this.scanner.nextLine());
                if (input >= min && input <= max) {
                    return input;
                } else {
                    System.out.println("Enter a number between " + min + " and " + max);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a decimal number.");
            }
        }
    }

    public double getDouble() {
        while (true) {
            try {
                return Double.parseDouble(this.scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a decimal number.");
            }
        }
    }
}


class InputTest {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("Enter a string: ");
        String stringInput = input.getString();
        System.out.println("You entered: " + stringInput);

        System.out.println("Enter yes or no: ");
        boolean yesNoInput = input.yesNo();
        System.out.println("You entered: " + yesNoInput);

        System.out.println("Enter an integer between 1 and 10: ");
        int intInput = input.getInt(1, 10);
        System.out.println("You entered: " + intInput);

        System.out.println("Enter an integer: ");
        int intInputWithoutRange = input.getInt();
        System.out.println("You entered: " + intInputWithoutRange);

        System.out.println("Enter a double between 1 and 10: ");
        double doubleInput = input.getDouble(1,10);
        System.out.println("You entered: " + doubleInput);

        System.out.println("Enter a double: ");
        double doubleInputWithoutRange = input.getDouble();
        System.out.println("You entered: " + doubleInputWithoutRange);
    }
}