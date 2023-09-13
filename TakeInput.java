
//this is to import scanner for using in getting the user input
import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args){
    //I am applying oop in  using scanner

   Scanner scanner=new Scanner(System.in);
   System.out.println("Enter the firstname : ");
   String firstname=scanner.nextLine();
      System.out.println("Enter the secondname : ");
         String lastname=scanner.nextLine();
            System.out.println("Enter your age : ");
            int age=scanner.nextInt();
            System.out.println("My full name is " +firstname+lastname+"and I am " + age + "years old");

scanner.close();

    }
    
}
