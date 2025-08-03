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
            
            if(choice < 1 || choice > 3) {
                System.out.println("Invalid Selection! Try Again.");
            }
                } while(choice < 1 || choice > 3);
        
        
        switch(choice){
            
            case 1:
                
                bankingClass bc = new bankingClass();
                int attempts = 0;
                
                
            while( attempts < 3) {
                System.out.print("Enter Account No: ");
                int accNo = sc.nextInt();
                System.out.print("Enter your PIN: ");
                int pin = sc.nextInt();
                
                if(bc.verifyAccount(accNo, pin)) {
                    System.out.println("LOGIN SUCCES");
                    break;
                }else {
                    attempts++;
                    System.out.println("INVALID ACCOUNT!");
                    
                    if(attempts == 3){
                        System.out.println("System Closed!");
                        System.exit(0);
                        
                    }
                }
            }
            break;
            
            case 2: 
                break;
                
            case 3:
                break;
                
            default:
               
              
            
                
                
        }
    }
    
}