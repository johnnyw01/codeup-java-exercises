import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        //#4  Convert given number grades into letter grades:

        Scanner scanner = new Scanner(System.in);
        String askAgain;
        do {
            System.out.println("Please enter a number between 0-100 to see a a letter grade: ");
            int userNumber = scanner.nextInt();

            if(userNumber >= 88 && userNumber <= 100){
                        System.out.println("Your grade is an A");
            }
            else if (userNumber >= 80  && userNumber <= 87) {
                System.out.println("Your grade is an B");
            }
            else if (userNumber >= 67 && userNumber <= 79) {
                System.out.println("Your grade is an C");
            }
            else if (userNumber >= 60 && userNumber <= 66) {
                System.out.println("Your grade is an D");
            }else if (userNumber >= 0 && userNumber <= 59) {
                System.out.println("Your grade is an F");
            }else if (userNumber < 0 || userNumber > 100) {
                System.out.println("Please enter a number between 0-100");
            }
            System.out.print("Do you want to continue? (y/n): ");
//            scanner.nextLine();
            askAgain = scanner.next();
        } while (askAgain.equals("y"));
        System.out.println("Goodbye!");
    }
}
