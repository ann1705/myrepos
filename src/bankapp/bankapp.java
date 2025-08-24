package bankapp;

import banking.bankingClass;
import java.util.Scanner;


public class bankapp {
    
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        
        int choice;
        do {
            System.out.println("What do feel doing today? ");
            System.out.println("1. Banking");
            System.out.println("2. Shopping");
            System.out.println("3. Grocery");
            
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            int resp = 0;  
            switch(choice){
                case 1:
                  banking.bankingClass bApp[] = new bankingClass[10];
                  bApp[0] = new bankingClass();
                  do{
                    System.out.println("1.Register Account");
                    System.out.println("2. Login Account");
                    System.out.println("3. View All Accounts");
                    
                    System.out.print("4. Enter Selection: ");
                    int action = sc.nextInt();
                    
                    
                    switch(action){
                        case 1: 
                            System.out.print("Enter Account No.: ");
                            bApp[0].setAccount(sc.nextInt());
                            System.out.print("Enter Account PIN: ");
                            bApp[0].setPin(sc.nextInt());
                            
                            System.out.println("Account registered successfully!");
                            break;
                            
                        case 2:
                            if(bApp[0].getAccountNo() == 0){
                                System.out.println("No account registered yet! Please register first.");
                                break;
                            }
                            
                            int attempts = 3;
                            
                            System.out.print("Enter Account No.: ");
                            int accNo = sc.nextInt();
                            
                            System.out.print("Enter Your PIN: ");
                            int pin = sc.nextInt();
                            
                            while(!(bApp[0].verifyAccount(accNo, pin))){
                                if(attempts == 1){
                                    System.out.println("ATTEMPT LIMIT REACHED!");
                                    System.exit(0);
                                }
                                
                                attempts--;
                                System.out.println("Attempts Left:"+attempts);
                                
                                System.out.println("INVALID ACCOUNT!");
                                System.out.print("Enter Your Account No.:");
                                accNo = sc.nextInt();
                                System.out.print("Enter Your PIN: ");
                                pin = sc.nextInt();
                            }
                            
                            System.out.println("LOGIN SUCCESSFUL!");
                            int bankChoice;
                            do{
                                System.out.println("1. Deposit");
                                System.out.println("2. Withdraw");
                                System.out.println("3. Check Balance");
                                System.out.println("4. Exit");
                                System.out.print("Enter your choice: ");
                                bankChoice = sc.nextInt();
                                
                                switch(bankChoice){
                                    case 1:
                                       
                                        break;
                                        
                                    case 2:
                                       
                                        break;
                                        
                                    case 3:
                                        
                                        break;
                                        
                                    case 4:
                                       
                                        break;
                                        
                                    default:
                                        System.out.println("Invalid choice!");
                                        break;
                                }
                            }while(bankChoice != 4);
                            break;
                        case 3:
                            break;
                    }
                    
                    System.out.println("Do you want to continue? (1/0):");
                    resp = sc.nextInt();
                }while(resp == 1);
                
                break;
                
            case 2:
                
                break;
                
            case 3:
                
                break;
                
            default:
                System.out.println("Invalid Selection!");
                break;
            }
        }while(choice != 0);
    }
}