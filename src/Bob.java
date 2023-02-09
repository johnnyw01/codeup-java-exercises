import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String askAgain;
        do {
            System.out.println("Ask Bob a question, but be aware, his responses are very limited...");
            String userInput = scanner.nextLine();
            if(userInput.endsWith("?")){
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals(" ")) {
                System.out.println("Fine. Be that way!");
            }else{
                System.out.println("Whatever");
            }
            System.out.print("Do you want to continue? (y/n): ");
//            scanner.next();
            askAgain = scanner.nextLine();
        }while (askAgain.equalsIgnoreCase("y"));
        System.out.println("Goodbye!");
    }
}
