package activity;

import java.util.Scanner;

public class Act3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int num;
        
        System.out.println("Enter a number");
        num = sc.nextInt();
        
        if (num ==0) {
            System.out.println("Inputted number is zero");
        } else if (num <0){
            System.out.println("The number is negative");
        } else  {
            System.out.println("The number is positive");
            
    }
        
        
    }
    
}