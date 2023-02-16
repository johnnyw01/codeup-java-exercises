public class PersonLectureEx {
    private String name;
    private int age;

    public static void progressOneYear(PersonLectureEx[] people) {
        for (PersonLectureEx person : people) {
            person.setAge(person.getAge() + 1);
        }
    }

    public static void printOutAgesOfPeople(PersonLectureEx[] people) {
        for (PersonLectureEx person : people) {
            System.out.println(person.getAge());
        }
    }

    public PersonLectureEx(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
