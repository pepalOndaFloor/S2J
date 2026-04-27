/*Create a hierarchy of Employee, Manager, Sales Manager, they should have the following functionality: 
a) Employee:Display name, date of birth and id of Employee. b) Manager: Display all above information with salary drawn. 
Sales Manager: Display all above information and commission if applicable */

import java.util.*;
class Employee{
    String name;
    String dob;
    int id;

    void accept(){
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter ID:");
        this.id = sc.nextInt();
        System.out.println("Enter Name:");
        this.name = sc.next();
        System.out.println("Enter Date of Birth:");
        this.dob = sc.next();
    }

    void display(){
        System.out.println("ID:" +this.id);
        System.out.println("Name:" +this.name);
        System.out.println("Date of Birth:" +this.dob);
    }

}

class Manager extends Employee{
    float salary;

    void accept(){
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Salary:");
        this.salary = sc.nextFloat();
    }

    void display(){
        super.display();
        System.out.println("Salary:"+this.salary);
    }
}

class SalesManager extends Manager{
    float commission;

    void accept(){
        super.accept();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Commission:");
        this.commission = sc.nextFloat();
    }

    void display(){
        super.display();
        System.out.println("Commission:"+this.commission);
    }
}

class TestEmpManager{
    public static void main(String ass[]){
        SalesManager sm = new SalesManager();
        sm.accept();
        sm.display();
    }
}
