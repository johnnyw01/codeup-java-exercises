package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("Johnny");
        student.addGrade(89);
        student.addGrade(95);
        student.addGrade(75);
        student.addGrade(83);
        student.addGrade(79);
        System.out.println(student.getName());
        System.out.println("Johnny's average grade in the class is: " + student.getGradeAverage());

    }
}
