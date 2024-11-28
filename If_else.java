

// import java.util.Scanner;
public class If_else {
    public static void main(String[] args) {
        
        // Scanner sc= new Scanner(System.in);

        int a= 4;
        int b=8;
        int c= 10;

        if (a>b){
            System.out.println("a is bigger than b");
            if (a > c) {
                System.out.println("a is bigger than c");
                System.out.println("a is largest" + a);
            
        }   else {
                System.out.println("C is bigger than a");
                System.out.println("C is largest" +c);
        }  
    }else {
        System.out.println("b is bigger than a");
        if(b > c){
            System.out.println("b is bigger than c" );
            System.out.println("b is largest" + b);
        }else{
            System.out.println("C is bigger than b" );
            System.out.println("C is largest" + c);
        }

    } 


    int max= 0;
    max= a> b ? a>c ? a : c : b> c?b:c;
  }
}
