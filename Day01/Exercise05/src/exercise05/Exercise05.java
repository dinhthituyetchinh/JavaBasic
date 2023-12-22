/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise05;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
       try(Scanner scanner = new Scanner(System.in))
       {
           double a, b, c;
           System.out.print("Nhập số thứ nhất: ");
           a = scanner.nextDouble();
           System.out.print("Nhập số thứ hai: ");
           b = scanner.nextDouble();
           System.out.print("Nhập số thứ ba: ");
           c = scanner.nextDouble();
           
           if(a != 0)
           {
               double delta = Math.pow(b, 2) - 4 * a * c;
               if(delta < 0)
               {
                   System.out.println("Phương trình vô nghiệm");
               }                 
               else if (delta == 0)
               {
                   System.out.format("Phương trình có nghiệm kép x1 = x2 = %.2f\n", - b/ (2 * a));
               }               
               else
               {
                   System.out.format("Phương trình có hai nghiệm x1 = %.2f, x2 = %.2f\n", (-b + Math.sqrt(delta))/ (2 * a), (-b - Math.sqrt(delta))/ (2 * a));
               }
                   
           }
       }
        
    }
    
}
