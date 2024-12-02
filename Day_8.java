import java.util.Scanner;

public class Day_8 {
    public static void main(String[] args) {
    //     double x = 5;
    //     double y = -10;
    //     double a= 3.44;

    //    double z= Math.max(x,y);
    //    double z2= Math.sqrt(x);
    //    double z1= Math.min(x,y);
    //    double z3=Math.round(a);


    //    System.out.println(z);
    //    System.out.println(z2);
    //    System.out.println(z1);
    //    System.out.println(z3);


        double x;
        double y;
        double z;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side x:");
        x= sc.nextDouble();

        System.out.println("Enter side y:");
        y= sc.nextDouble();


        z= Math.sqrt((x*x)+ (y*y));
        System.out.print("The hypotenuse is :"+z);



    }
}
