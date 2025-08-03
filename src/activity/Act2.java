package activity;


import java.util.Scanner;


public class Act2 {
    
    public static void main(String[] args) {
        Scanner  sc = new Scanner (System.in);

        int num;
        
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        
        if (num == 0) {
            System.out.println(" Inputted number is zero");
        } else if (num %2 == 0) {
            System.out.println("Inputted number is even");
        } else  {
            System.out.println(" Inputted number is odd");    
        }
        
    }
    
    
}