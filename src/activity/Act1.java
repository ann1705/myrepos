package activity;

import java.util.Scanner;

public class Act1 {
 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        String name;
        int science,history,math,soc,arts;
        int sum;
        
        System.out.print("Enter student Name:");
        name = sc.nextLine();
        System.out.print("Enter marks in Science:");
        science = sc.nextInt();
        System.out.print("Enter marks in History:");
        history = sc.nextInt();
        System.out.print("Enter marks in Math:");
        math = sc.nextInt();
        System.out.print("Enter marks in Soc:");
        soc = sc.nextInt();
        System.out.print("Enter marks in Arts:");
        arts = sc.nextInt();
        
        sum = science + history + math + soc + arts;
        double percentage = (double)sum / 5;
        
        
        String remarks;
        if (percentage < 70) {
            remarks = "FAIL";
        } else if (percentage >= 71 && percentage <= 75) {
            remarks = "POOR";
        } else if (percentage >= 76 && percentage <= 80) {
            remarks = "FAIR";
        } else if (percentage >= 81 && percentage <= 85) {
            remarks = "GOOD";
        } else if (percentage >= 86 && percentage <= 90) {
            remarks = "VERY GOOD";
        } else {
            remarks = "EXCELLENT";
        }
        
      
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("----------------------");
        System.out.println("SCIENCE: " + science);
        System.out.println("HISTORY: " + history);
        System.out.println("MATH: " + math);
        System.out.println("SOC: " + soc);
        System.out.println("ARTS: " + arts);
        System.out.println("---------------------");
        System.out.println();
        System.out.println("Total Marks: " + sum);
        System.out.printf("Total percentage: %.2f\n", percentage);
        System.out.println("Remarks: " + remarks);
        System.out.println();
        
        
        if (percentage >= 70) {
            System.out.println("Congrats " + name + " you Passed.");
        } else {
            System.out.println("Try Again " + name + ".");
        }
        
        
    }
    
}
