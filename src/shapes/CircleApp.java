package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {

        Input input = new Input();
        boolean condition = true;

        while(condition){
            System.out.println("Enter in a decimal number to get the area and circumference of a circle: ");

            double radius = input.getDouble();
            System.out.println("You entered: " + radius);
            Circle circle = new Circle(radius);

            System.out.println("The circumference of the circle is: " + circle.getCircumference(radius));
            System.out.println("The area of the circle is: " + circle.getArea(radius));

            System.out.print("Do you want to make another circle? (yes/no): ");
            condition = input.yesNo();
        }


        System.out.println("Number of circles created: " + Circle.getNumberOfCircles());

    }


}
