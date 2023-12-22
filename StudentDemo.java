/*Declare a variable Student which consists of a student’sname, markfor Programming, mark
for Logic and a grade for Lab. A mark is a number (between 0 and100) and a grade is a
letter (between A and F). Write a predicate (a boolean method) isStronger, which takes two
students and returns true if and only if the first student has done better than the second in
the ordering below.
a. the Programming mark is most important,
b. numerical order of Logic marks is the determining factor when two students have
the same Programming mark,
c. alphabetical order of Lab grades is the determining factor when two students have
the same Programming and Maths marks.*/

import java.util.Scanner;
 public class Student {
    String name;
    int markForProgramming;
    int markForLogic;
    char gradeForLab;

    public Student(String name, int markForProgramming, int markForLogic, char gradeForLab) {
        this.name = name;
        this.markForProgramming = markForProgramming;
        this.markForLogic = markForLogic;
        this.gradeForLab = gradeForLab;
    }

    public static boolean isStronger(Student s1, Student s2) {
         if (s1.markForProgramming > s2.markForProgramming) {
            return true;
        } else if (s1.markForProgramming == s2.markForProgramming) {
            if (s1.markForLogic > s2.markForLogic) {
                return true;
            } else if (s1.markForLogic == s2.markForLogic) {
                if (s1.gradeForLab < s2.gradeForLab) {
                    return true;
                }
            }
        }
        return false;
    }
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student 1 details: ");
        System.out.println("Name: ");
        String name1 = sc.nextLine();
          System.out.println("Enter Student 2 details: ");
        System.out.println("Name: ");
        String name2 = sc.nextLine();
         System.out.println("Mark for Programming of "+name1+" : ");
        int markForProgramming1 = sc.nextInt();
         System.out.println("Mark for Logic of "+name1+" : ");
        int markForLogic1 = sc.nextInt();
          System.out.println("Grade for Lab of "+name1+" : ");
        char gradeForLab1 = sc.next().charAt(0);

      
        System.out.println("Mark for Programming of "+name2+" : ");
        int markForProgramming2 = sc.nextInt();
        System.out.println("Mark for Logic of "+name2+" : ");
        int markForLogic2 = sc.nextInt();
        System.out.println("Grade for Lab "+name2+" : ");

        char gradeForLab2 = sc.next().charAt(0);

        Student s1 = new Student(name1, markForProgramming1, markForLogic1, gradeForLab1);
        Student s2 = new Student(name2, markForProgramming2, markForLogic2, gradeForLab2);

        if (isStronger(s1, s2)) {
            System.out.println(s1.name + " is stronger than " + s2.name);
        } else {
            System.out.println(s1.name + " is not stronger than " + s2.name);
        }
    }
}

  
