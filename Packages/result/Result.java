package result;
import student.Student;
public class Result {
    public static void main(String[] args) {

        Student s = new Student("Keshav", 85);

        s.display();

        // Grade calculation
        if (s.marks >= 90)
            System.out.println("Grade: A");
        else if (s.marks >= 75)
            System.out.println("Grade: B");
        else if (s.marks >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: Fail");
    }
}