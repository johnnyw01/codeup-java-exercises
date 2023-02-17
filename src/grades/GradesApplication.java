package grades;

import util.Input;

import java.util.HashMap;


public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<String, Student>();

        Student john = new Student("John");
        john.addGrade(97);
        john.addGrade(85);
        john.addGrade(74);
        students.put("BlankFacelift45",john);

        Student ashely = new Student("Ashely");
        ashely.addGrade(91);
        ashely.addGrade(88);
        ashely.addGrade(94);
        students.put("UtterBeyond4",ashely);

        Student tom = new Student("Tom");
        tom.addGrade(76);
        tom.addGrade(93);
        tom.addGrade(80);
        students.put("AttachedWatcher91",tom);

        Student katy = new Student("Katy");
        katy.addGrade(84);
        katy.addGrade(77);
        katy.addGrade(90);
        students.put("ColorfulPod95",katy);




        Input input = new Input();
        String userInput;
        boolean condition = true;
        System.out.println("Welcome to the Student Info App!\n" + "Here are the GitHub usernames of our students: ");

        for(String username : students.keySet()) {
                System.out.print("| " + username + " ");
            }
        while (condition) {

            System.out.println("\nWhat username would you like to see more information on?");

            userInput = input.getString();

            if (students.containsKey(userInput)) {
                Student student = students.get(userInput);
                System.out.println("Name: " + student.getName());
                System.out.println("GitHub Username: " + userInput);
                System.out.println("Current Class Grades: " + student.getGrade());
                System.out.println("Current Overall Average: " + student.getGradeAverage());
            } else {
                System.out.println("Sorry, no student with that username was found.");
            }
                System.out.print("Do you want to select another movie category? (yes/no): ");
                condition = input.yesNo();
            }
        System.out.println("Thanks for using the Student Info App. Goodbye.");
        }
    }

