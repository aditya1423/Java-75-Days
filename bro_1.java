 import java.util.Scanner;

import javax.swing.JOptionPane;
public class bro_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("print number : ");
        // String input = sc.nextLine(); 
        // int num= Integer.parseInt(input);
        // System.out.println("this is u " + num);
         
        String name= JOptionPane.showInputDialog("Enter Your name :");
        JOptionPane.showMessageDialog(null, "Hello "+ name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your age :"));
        JOptionPane.showMessageDialog(null, "You are now "+ age);

        Double Height = Double.parseDouble(JOptionPane.showInputDialog("Enter Your age :"));
        JOptionPane.showMessageDialog(null, "You are now "+ Height);
    }
}
