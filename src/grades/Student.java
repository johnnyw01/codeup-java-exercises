package grades;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
    public void addGrade(int grade) {

        this.grades.add(grade);
    }

    public double getGradeAverage() {
        if (this.grades.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (int grade : this.grades) {
            sum += grade;
        }

        double average = sum / this.grades.size();
        return Math.round(average * 100.0) / 100.0; // round to two decimal places
    }

    public ArrayList<Integer> getGrade() {

        return grades;
    }


}
