package banking;



public class bankingClass {
    
    
    private int accountNo;
    private double initialBalance;
    private int pin;
    
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }
    public int getAccountNo() {
        return accountNo;
    }
    public void setPin(int pin) {
        this.pin = pin;
    }
    public int getPin() {
        return pin;
    }
    
    public boolean verifyAccount(int acc, int pn){
        
            if(acc == accountNo && pn == pin){
                return true;
            }else{
                return false;
            }
    }
    
    public void setAccount(int accountNo){
        this.accountNo = accountNo;
        this.initialBalance = 0.0; 
    }
    
    public void viewBalance(){
        System.out.println("Current Balance: " + initialBalance);
    }
    
    public double getBalance() {
        return initialBalance;
    }
    
    public void withdraw(double withdrawAmount) {
        if(withdrawAmount > 0 && withdrawAmount <= initialBalance){
            initialBalance -= withdrawAmount;
            System.out.println("Withdrawal successful! New balance: " + initialBalance);
        } else if(withdrawAmount > initialBalance){
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid amount!");
        }
    }
    
    public void deposit(double depositAmount) {
        if(depositAmount > 0){
            initialBalance += depositAmount;
            System.out.println("Deposit successful! New balance: " + initialBalance);
        } else {
            System.out.println("Invalid amount!");
        }
    }
}