
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int day= sc.nextInt();

        // if(day == 1) {
        //     System.out.println("Today is sunday");    
        // }else if(day==2){
        //     System.out.println("Today is monaday");
        // }else if(day==3){
        //     System.out.println("Today is tuesday");
        // }else if(day==4) {
        //     System.out.println("today is wenesday");
        // }else if (day==5){
        //     System.out.println("Today is thursday");
        // }else if(day==6){
        //     System.out.println("Today is friday");
        // }else if (day==7){
        //     System.out.println("Today is saturday");
        // }


        switch(day){
            case 1: 
                System.out.println("Today is Sunday");
                break;
            case 2: 
                System.out.println("Today is monaday");
                break;
            case 3:
                System.out.println("Today is tuesday");
                break;
            case 4: 
                System.out.println("today is wenesday");
                break;
            case 5: 
                System.out.println("Today is thursday");
                break;
            case 6:
                System.out.println("Today is friday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;

        }



    }
}
