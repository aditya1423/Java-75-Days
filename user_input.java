
import java.util.Scanner;


public class user_input {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter your age :");
        int age= sc.nextInt();
        System.out.println(" your age is :"+age);


        System.out.print("Enter first number :");
        int F_int=sc.nextInt();
        System.out.print("enter 2nd no : ");
        int G_int=sc.nextInt();

        int c = F_int + G_int;
        System.out.println("Total is " + c);
        sc.close();
    }
    
}
