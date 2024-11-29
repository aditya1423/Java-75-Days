import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter time : ");
        int a= sc.nextInt();

        if (a >= 12){
           if(a<=20){
            System.out.println("office is open");
           }else {
            System.out.println("office is closed ");
           }

        if( a>=10 && a<=20){
            System.out.println("time for snacks");
        }else{
            System.out.println("time to work");
        }
         
        if( a==12 || a ==18){
          System.out.println("time for snacks");
        }else{
            System.out.println("Time to work");
        }

    }

    }
}
