/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise03;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhập số phần tử của dãy: ");
        try(Scanner scanner = new Scanner(System.in))
        {
           int n= scanner.nextInt();
            System.out.println("Số phần tử của dãy: "+ n);
            for(int i = 0; i < n; i++)
            {
                int rand = (int)(Math.random() * n);
                System.out.println(rand + " ");
            }
            
        }
        
        
    }
    
}
