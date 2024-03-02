/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_5;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class QuadraticEquations {
   private double a, b, c;
   public void inputData()
   {
       try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Input a: ");
            a = scanner.nextDouble();
            System.out.print("Input b: ");
            b = scanner.nextDouble();
            System.out.print("Input c: ");
            c = scanner.nextDouble();
        }
   }
   public void output()
   {
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
