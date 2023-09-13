import java.util.Scanner;
public class pythagorasTheorem {
public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the length of the first side : ");
    double a=scanner.nextDouble();
        System.out.println("Enter the length of the second side : ");
        double b=scanner.nextDouble();
  
            double c=Math.sqrt((Math.pow(a,2)+Math.pow(b,2)));
            System.out.println("The hypothenuse  of Triange is " + c );
scanner.close();

    
}
    
}
