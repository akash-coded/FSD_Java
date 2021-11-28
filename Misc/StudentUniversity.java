class Student {
    private String name; // instance member
    private static String university; // class member

    Student() {
        name = "NA";
        university = "MIT";
    }

    Student(String name) {
        this();
        this.name = name;
    }

    Student(String name, String uni) {
        this(name);
        university = uni;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getUniversity() {
        return university;
    }

    public static void setUniversity(String uni) {
        university = uni;
    }
}

public class StudentUniversity {
    public static void main(String[] args) {
        Student.setUniversity("ABC");
        System.out.println(Student.getUniversity());

        Student student1 = new Student();
        Student student2 = new Student("Akash");
        Student student3 = new Student("Akash Das", "Cambridge");

        System.out.println(student1.getName() + " " + student1.getUniversity());
        System.out.println(student2.getName() + " " + student2.getUniversity());
        System.out.println(student3.getName() + " " + student3.getUniversity());
    }
}
