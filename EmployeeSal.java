/**Write a Java program to calculate salary using packages. Creates a package employee and create a class Emp. Data members are name,employee id, category, basic pay, HRA, DA,net pay, provident fund, gross pay, income tax, and allowance. Calculate the values in methods. Call the methods to perform and print values. */


import java.util.Scanner;
class Emp{
    String name;
    int id;
    String category;
    float basicPay;
    float HRA;
    float DA;
    float netPay;
    float providentFund;
    float grossPay;
    float incomeTax;
    float allowance;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee ID: ");
        id = sc.nextInt();
        System.out.println("Enter employee Name: ");
        name = sc.next();
        System.out.println("Enter employee Category: ");
        category = sc.next();
        System.out.println("Enter employee Basic Pay: ");
        basicPay = sc.nextFloat();


    }
    void calculate(){
        HRA = 0.1f*basicPay;
        DA = 0.2f*basicPay;
        providentFund = 0.12f*basicPay;
        allowance = 0.05f*basicPay;
        grossPay = basicPay + HRA + DA;
        incomeTax = 0.1f*grossPay;
        netPay = grossPay - (providentFund + incomeTax);
    }
    void display(){
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Category: " + category);
        System.out.println("Employee Basic Pay: " + basicPay);
        System.out.println("Employee HRA: " + HRA);
        System.out.println("Employee DA: " + DA);
        System.out.println("Employee Allowance: " + allowance);
        System.out.println("Employee Net Pay: " + netPay);
        System.out.println("Employee Provident Fund: " + providentFund);
        System.out.println("Employee Income Tax: " + incomeTax);

    }

}

public class EmployeeSal{
    public static void main(String [] arss){
        Emp e1 = new Emp();
        e1.getData();
        e1.calculate();
        e1.display();
    }
}