package controllStatements;
import java.util.Scanner;
public class multiplicationTable {
public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter number : ");
    int num=scanner.nextInt();
    int i=1;
 while(i<=10){
    System.out.println(i + "*" + num + " = " +i*num );
    i++;
 }
 scanner.close();
}
    
    
}
