import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %s%n", pi );
//        System.out.format("The value of pi is approximately %.2f", pi );

                Scanner scanner = new Scanner(System.in);
                scanner.useDelimiter("\n");


//                System.out.print("Please enter a word: ");
//                String userWord1 = scanner.nextLine();
//
//                System.out.print("Please enter another word: ");
//                String userWord2 = scanner.nextLine();
//
//                System.out.print("and one last word...please: ");
//                String userWord3 = scanner.nextLine();
//
//                System.out.println(userWord1);
//                System.out.println(userWord2);
//                System.out.println(userWord3);

//                  System.out.println("Please enter a sentence: ");
//                  String userSentence = scanner.nextLine();
//                  System.out.println(userSentence);

        System.out.print("In square feet, please enter the numerical length of the Codeup classroom: ");
        double classRoomLength = scanner.nextDouble();
        System.out.print("In square feet, please enter the numerical width of the Codeup classroom: ");
        double classRoomWidth = scanner.nextDouble();
        System.out.print("In square feet, please enter the numerical width of the Codeup classroom: ");
        double classRoomHeight = scanner.nextDouble();
        double area = classRoomWidth * classRoomLength ;
        double perimeter = 2 * (classRoomLength + classRoomWidth) ;
        double volume = classRoomLength * classRoomWidth * classRoomHeight;
        System.out.println("The area of the Codeup classroom is: " + area + " sq ft");
        System.out.println("The perimeter of the Codeup classroom is: " + perimeter + " ft");
        System.out.println("The volume of the Codeup classroom is: " + volume + " cu ft");
    }

}
