package banking;



public class bankingClass {
    
    
    int accNo = 11111;
    String name;
    float availBalance;
    int pin = 1234;
    
    
    public boolean verifyAccount(int acc, int pn) {
        
        if(acc == accNo && pn == pin){
            return true;
        }else{
            return false;
        }
    }
    
 public int setAccount(){
     return accNo;
 }   
    public void viewBalance(){
        
    }
}