//this javax.swing.JOptionPane is used to put interfaces
import javax.swing.JOptionPane;
public class Gui {
    public static void main(String[] args){
        String name=JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null," Hello " + name);

        String greetings=JOptionPane.showInputDialog("How are you ? ");
        JOptionPane.showMessageDialog(null, greetings);

        String query=JOptionPane.showInputDialog("How old are you ? ");
        
        //this is to convert the input received to int
        // try{
        int age=Integer.parseInt(query);
      JOptionPane.showMessageDialog(null, "I am " + age + " years old ");
        // }catch()
        String askNum=JOptionPane.showInputDialog("How much are you in class A ? ");
        double ourNum=Double.parseDouble(askNum);
        JOptionPane.showMessageDialog(null," We are " + ourNum + " in the class! ");
    }
    
}
