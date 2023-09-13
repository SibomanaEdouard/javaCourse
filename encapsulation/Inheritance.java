package encapsulation;

class Teacher{
    String designation="Teacher";
    String collegeName="RCA"; 
    // String does(){
    //     // System.out.println("Teaching");
    //     String word="Teaching";
    //     return word;
    // }   

    void does(){
        System.out.println("Teaching");
    }
}

public class Inheritance  extends Teacher{
    String mainSubject="spark";
    public static void main(String[] args){
        Inheritance obj=new Inheritance();
        //let me print the values of variable inherited from the Teach class
          System.out.println(obj.collegeName);
                    System.out.println(obj.designation);
                              System.out.println(obj.mainSubject);
                                        // System.out.println(obj.does());
                                        obj.does();



    }

    
}
