import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //#3  Display a table of powers:

        Scanner scanner = new Scanner(System.in);
        String askAgain;
        do {
            System.out.println("Please enter a number to see a table showing the powers of that number?");
            int userNumber = scanner.nextInt();
            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int i = 1; i <= userNumber; i++) {
                System.out.println(String.format("%-6d | %-7d | %-6d", i, i * i, i * i * i));
            }
            System.out.print("Do you want to continue? (y/n): ");
//            scanner.nextLine();
            askAgain = scanner.next();
        } while (askAgain.equals("y"));
        System.out.println("Goodbye!");
    }
}
