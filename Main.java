import java.util.*;

interface Exam {
    void takeExam();

    void viewResult();
}

class Person {
    void introduction() {
        System.out.println("I am a Person.");
    }

}

class Student extends Person implements Exam {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void takeExam() {
        System.out.println(name + " is taking exam.");
    }

    public void viewResult() {
        if (marks > 35) {
            System.out.println(name + " passed with " + marks + " marks.");
        } else {
            System.out.println(name + " failed with " + marks + " marks.");
        }
    }

    @Override
    void introduction() {
        System.out.println("I am " + name);
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the student name :");
        String name = scan.nextLine();
        System.out.print("Enter the marks obtained :");
        int marks = scan.nextInt();

        Exam student1 = new Student(name, marks);
        Student studentobj = (Student) student1;

        studentobj.introduction();
        studentobj.takeExam();
        studentobj.viewResult();

    }
}

// output

// Enter the student name :Vardhan
// Enter the marks obtained :71
// I am Vardhan
// Vardhan is taking exam.
// Vardhan passed with 71 marks.
