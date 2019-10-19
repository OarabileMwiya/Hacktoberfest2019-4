import java.util.Scanner;

public class Adding_numbers_read_via_keyboard {
  
  public static void main(String[] args) {
    
    Scanner obj = new Scanner(System.in);
    
    int x,y;
    
    
    System.out.print("Enter the first number");
    x=obj.nextInt();
    
    System.out.print("Enter the second number");
    y=obj.nextInt();
    
    System.out.print("Enter the operation");
    
    String operation = obj.next();
    
    
    if(operation.equals("+")) {System.out.print("The addition result is " +(x + y));}
    
    else if(operation.equals("-")) {System.out.print("The subtraction result is "+(x - y));}
    
    else if (operation.equals("*")) {System.out.print("The multiplication result is "+(x * y));}
    
    else if (operation.equals("/")) {System.out.print("The division result is "+(x / y));}
    
    else { System.out.print("Enter the correct operation");}
    
    
    
   System.exit(0);
    
  }
}