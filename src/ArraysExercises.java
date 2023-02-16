import java.util.Arrays;
import java.util.Objects;

public class ArraysExercises {

    //Add person method for Exercise #1: Array Basics
    static Person[] addPerson(Person[] people, Person newPerson) {
        int arrLength = people.length;
        Person[] newPeople = new Person[arrLength + 1];
        System.arraycopy(people, 0, newPeople, 0, arrLength);
        newPeople[arrLength] = newPerson;
        return newPeople;
    }
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

        //Exercise #1: Array Basics
        Person[] people = new Person[3];

        people[0] =  new Person("Jack");
        people[1] =  new Person("Jill");
        people[2] =  new Person("John");

        for(Person person : people){
            System.out.println("This is BEFORE the static method 'addPerson' was added " + person.getName());
        }

        System.out.println("-----------------------------------------------------------");

        Person newPerson = new Person("Jane");
        people = addPerson(people, newPerson);

        for (Person person : people) {
            System.out.println("This is AFTER the static method 'addPerson' was added " +person.getName());
        }

    }
}
