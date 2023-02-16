import org.w3c.dom.ls.LSOutput;

public class MethodsLecture {
    public static void main(String[] args) {

        System.out.println(sayName("Justin", "Reich"));
    }

    // ----------- DEFINING AND CALLING METHODS WITH VARIOUS INPUTS (examples)

    // no input or returned output
//        public static void sayGreeting() {
//            System.out.println("Hello");
//        }

    // no returned output with input
//        public static void sayInput(String input) {
//            System.out.println(input);
//        }

    // returned output without input
//        public static int returnSeven() {
//            return 7;
//        }

    // return output given an input
//        public static int returnInt(int someInt) {
//            return someInt;
//        }

    // return value based on multiple inputs
//        public static double returnProductOfThreeNums(double num1, double num2, double num3) {
//            return num1 * num2 * num3;
//        }

    // return type different from input type
//        public static int returnLengthOfString(String input) {
//            return input.length();
//        }

    // multiple input types
//        public static void printCharMultipleTimes(char c, int repetitions) {
//            System.out.println(String.valueOf(c).repeat(repetitions));
//        }

    // calling other methods from a method
//        public static void printCharSevenTimes(char c) {
//            printCharMultipleTimes(c, returnSeven());
//        }


    // ----------- OVERLOADING

    /*

        Method overloading is a way to define the same method with different method signatures.
        It is a convenience to prevent the programmer from having to create many more method names
        when defining functionality for various data type inputs.

        Much of the Java language is defined using overloaded methods (e.g. println())


     */

//        public static void sayHello() {
//            System.out.println("Hello World");
//        }
//
//        public static void sayHello(String punctuation) {
//            System.out.println("Hello World" + punctuation);
//        }
//
//        public static void sayHello(int times) {
//            for (int i = 0; i < times; i += 1) {
//                sayHello();
//            }
//        }


    // different return type is not enough alone to overload a method
    // must have a unique method signature

//         public static double sayHello(int x) {
//            return x;
//         }

    // with a unique method signature, can return any type
//        public static double sayHello(double x) {
//            return x;
//        }


    /**
     * OVERLOAD MINI-EXERCISES
     */

    // TODO: create a method, sayName, that can take in a single name String input or two name String inputs and will return
    //  a greeting message to the user by either their first or first and last name.

    // example: sayName("Justin") - "Hi Justin"
    // example: sayName("Justin", "Reich") - "Hi Justin Reich"

    public static String sayName (String firstName, String lastName){
        return String.format("Hello %s %s, nice to meet you!", firstName, lastName);
    }

    // TODO: overload the math exercises from the curriculum exercise to work with both integers and doubles

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static double add(double input1, double input2) {
        return input1 + input2;
    }

    public static int subtract(int input1, int input2) {
        return input1 - input2;
    }
    public static double subtract(double input1, double input2) {
        return input1 - input2;
    }

    public static int multiply(int input1, int input2) {
        return input1 * input2;
    }
    public static double multiply(double input1, double input2) {
        return input1 * input2;
    }

    public static int divide(int input1, int input2) {
        return input1 / input2;
    }
    public static double divide(double input1, double input2) {
        return input1 / input2;
    }

    public static int modulo(int input1, int input2) {
        return input1 % input2;
    }
    public static double modulo(double input1, double input2) {
        return input1 % input2;
    }


}