package encapsulation;

class Account {
    
 private long acc_no;
 private String name,email;
 private float amount;
 
 //this is the method to return the account number
public long getAcc_no(){
    return  acc_no;
}

//this is another method

public void setAcc_no(long acc_no){
    this.acc_no=acc_no;
}

//this is the following method
public String getName(){
    return name;
}
public void setName(String name){
    this.name=name;
}
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email=email;
}

public float getAmount(){
    return amount;
}

public void setAmount(float amount){
    this.amount=amount;
}

}



//this the class for testing encapsulation 
public class TestEncapsulation{
    
 public static void main(String[] args){
    
    //this is creating instance of the account class
    Account acc=new Account();

    //this is to set values
    acc.setAcc_no(121234567);
    acc.setAmount(1234567);
    acc.setEmail("chanta@gmail.com");
    acc.setName("chanta");
    System.out.println("The account number is " + 
    acc.getAcc_no() + 
    " amount of money on the account is  " +
     acc.getAmount() + 
     " Then the email is " + 
     acc.getEmail());  
    }
}

