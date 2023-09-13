import javax.swing.JOptionPane;
import java.util.Scanner;
public class math {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
    System.out.println("Enter first number : ");
    Double x=scanner.nextDouble();
    JOptionPane.showMessageDialog(null, "The first number is " + x);
    System.out.println("Enter the second number : ");
    Double y=scanner.nextDouble();
    double z=Math.max(x,y);
    double n=Math.min(x, y);
    JOptionPane.showMessageDialog(null, " The largest number is " + z + " and the smallest number is " + n);
    System.out.println("The largest number is "+ z + " and the smallest number is " + n );
    
    //this is to return the absolute value
String num=JOptionPane.showInputDialog("Enter the number : ");
Double num1=Double.parseDouble(num);
//this is to print abs
System.out.println("The absolute value of " +num1 + " is " + Math.abs(num1));
//find square root
System.out.println("The square root of " +num1 + " is " + Math.sqrt(num1));
System.out.println("The roundoff " +num1 + " is " + Math.round(num1));
scanner.close();
    }
    
}
