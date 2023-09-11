package controllStatements;

public class WhileLoop {
    public static void main(String[] args){
    int i=1;
    while(i<=15){
    System.out.println(i+ " . \n");
    i+=2; 
    }
  //this is to use do while loop 
  int j=1;
  do{
    System.out.println( " "+ j+ "*2 = "+j*2 + "\n");
    j++;

  }while(j<=20);

  //this is dealing with forloop
  System.out.println("This is multiplication table with forloop! \n");
  for(int x=1;x<=10;x++){

    if(x==6)
    continue;
    else if(x==9)
    break;
    else
    System.out.println(" " + x + " *2 = " + x*2 + "\n");
  }
    }
    
}
