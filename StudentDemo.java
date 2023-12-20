 import java.util.Scanner;
 class Student {
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
 public class StudentDemo{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student 1 details: ");
        System.out.print("Name: ");
        String name1 = sc.nextLine();
          System.out.println("Enter Student 2 details: ");
        System.out.print("Name: ");
        String name2 = sc.nextLine();
         System.out.print("Mark for Programming of "+name1+" : ");
        int markForProgramming1 = sc.nextInt();
         System.out.print("Mark for Logic of "+name1+" : ");
        int markForLogic1 = sc.nextInt();
          System.out.print("Grade for Lab of "+name1+" : ");
        char gradeForLab1 = sc.next().charAt(0);

      
        System.out.print("Mark for Programming of "+name2+" : ");
        int markForProgramming2 = sc.nextInt();
        System.out.print("Mark for Logic of "+name2+" : ");
        int markForLogic2 = sc.nextInt();
        System.out.print("Grade for Lab "+name2+" : ");

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

  
