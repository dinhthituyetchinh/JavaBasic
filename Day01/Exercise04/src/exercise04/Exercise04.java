/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise04;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        try(Scanner scanner = new Scanner(System.in))
        {
            System.out.print("Nhập số thứ nhất: ");
                int a = scanner.nextInt();
            System.out.print("Nhập số thứ hai: ");
                int b = scanner.nextInt();  
            if(a == 0 && b == 0)
            {
                System.out.println("Phuongw trình có vô số nghiệm");
            }else if(b == 0)
            {
                System.out.println("Phương trình vô nghiệm");
            }else
            {
                double x = (double)-b / a;
                System.out.println("Phương trình có nghiệm x= "+ x);
                // Làm tròn hai số sau phần thập phân
                System.out.format("Phương trình có nghiệm x= %.2f\n", x);
            }
            
           
        }
    }
    
}
