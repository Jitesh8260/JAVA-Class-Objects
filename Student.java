/*Write a java program deal with student information of a school. Define a class Student. The data members and methods for the class given below. 
Data members: roll, name, paper1,paper2,paper3 and grade.
Methods: getInfo(), calculate(), showDetails().

Use methods for initialization. Display for three students.*/

public class Student{
    int roll;
    String name;
    int paper1, paper2, paper3;
    String grade;

    public Student(int roll, String name, int paper1, int paper2, int paper3) {
        this.roll = roll;
        this.name = name;
        this.paper1 = paper1;
        this.paper2 = paper2;
        this.paper3 = paper3;
    }

    public void calculate() {
        int sum = paper1 + paper2 + paper3;
        float average = sum / 3.0f;

        if (average >= 90) {
            grade = "A";
        } else if (average >= 80) {
            grade = "B";
        } else if (average >= 70) {
            grade = "C";
        } else if (average >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    public void showDetails() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Paper1: " + paper1);
        System.out.println("Paper2: " + paper2);
        System.out.println("Paper3: " + paper3);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Alice", 85, 90, 88);
        Student s2 = new Student(2, "Bob", 95, 92, 90);
        Student s3 = new Student(3, "Charlie", 75, 80, 82);

        s1.calculate();
        s2.calculate();
        s3.calculate();

        System.out.println("Details of student 1:");
        s1.showDetails();
        System.out.println("\nDetails of student 2:");
        s2.showDetails();
        System.out.println("\nDetails of student 3:");
        s3.showDetails();
    }
}
