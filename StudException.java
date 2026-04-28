import java.util.Scanner; 
class MyException extends Exception{ 
    MyException(String s){
        super(s); 

    }
} 
class ExceptionDemo { 
    public static void main(String[] args) throws MyException { 
    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter marks (1-100):"); int 
    marks = sc.nextInt(); 
    if(marks >= 1 && marks <= 100) 
    { 
        System.out.println("Valid Marks Entered:" + marks); 
    }else{ 
        throw new MyException("Invalid Marks! Please eneter a value between 1 and 100."); 
    } 
    sc.close(); 
    }
}