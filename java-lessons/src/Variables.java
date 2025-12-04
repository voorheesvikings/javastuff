// * Two types of variables: instance variables and static variables
// * Variables are camelCase
// * constants use UPPER_SNAKE_CASE

class Student {
    String studentName; // * Instance variable
    static int studentCount = 0; // * Static variable: only belongs to the class
    static final String SCHOOL_NAME = "CSAEA"; // * Constant - Never changes

    Student(String studentName) {
        this.studentName = studentName; //belongs to the specific object
        studentCount++;
        System.out.println(this.studentName + " is at " + SCHOOL_NAME + " for a total of " + studentCount + " students");
        
    }

}

public class Variables {
    public static void main(String[] args) {
        Student goat = new Student("goat");
        Student corbin = new Student("corbin");
        Student haha = new Student("haha");
        Student moo = new Student("mooo");

    }
}
