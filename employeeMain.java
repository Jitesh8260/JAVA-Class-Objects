/*Develop a java program that will deal with employee information of an organization.
Define a class Employee. Minimum number of data member and member function are as
follows:
Data members:empName, empNo, basicSal, da, hra, grossSal
Methods:calGrossSal(), showEmpDetails()
You are free to add more number of relevant data member and member function.Define
parameterized constructor to intilaizeempName, empNo and basicSal. Create anytwo
objects of Employee class and initialize their data members while object creation. Use the
method calGrossSal()to calculate the gross salary and method showEmpDetails() to display
the detail informationof the employees in a tabular manner. Note that da is 20% of basicSal
and hra is 10% of basicSal. grossSal is the sum of basicSal, da and hra.*/ 


import java.util.Scanner;
public class employeeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for employee 1: ");
        System.out.println("Employee Name: ");
        String empName1 = scanner.next();
        System.out.println("Employee Number: ");
        int empNo1 = scanner.nextInt();
        System.out.println("Basic Salary: ");
        double basicSal1 = scanner.nextDouble();

        Employee employee1 = new Employee(empName1, empNo1, basicSal1);
        
        System.out.println("\nEnter details for employee 2: ");
        System.out.println("Employee Name: ");
        String empName2 = scanner.next();
        System.out.println("Employee Number: ");
        int empNo2 = scanner.nextInt();
        System.out.println("Basic Salary: ");
        double basicSal2 = scanner.nextDouble();

        Employee employee2 = new Employee(empName2, empNo2, basicSal2);
        employee1.calGrossSal();
        employee1.showEmpDetails();
        employee2.calGrossSal();
        employee2.showEmpDetails();
    }
}
class Employee {
    String empName;
    int empNo;
    double basicSal;
    double da;
    double hra;
    double grossSal;

    // Parameterized constructor to initialize empName, empNo and basicSal
    Employee(String empName, int empNo, double basicSal) {
        this.empName = empName;
        this.empNo = empNo;
        this.basicSal = basicSal;
    }

    // Calculate gross salary
    void calGrossSal() {
        da = basicSal * 0.2;
        hra = basicSal * 0.1;
        grossSal = basicSal + da + hra;
    }

    // Show employee details
    void showEmpDetails() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Number: " + empNo);
        System.out.println("Basic Salary: " + basicSal);
        System.out.println("Dearness Allowance: " + da);
        System.out.println("House Rent Allowance: " + hra);
        System.out.println("Gross Salary: " + grossSal);
    }
}

