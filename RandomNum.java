import java.util.Random;
public class RandomNum {
    public static void main(String[] args){
     Random random=new Random();
     //this is to generate random number 
     int x=random.nextInt(6)+1; 
     System.out.println(x);  
    }
}
 