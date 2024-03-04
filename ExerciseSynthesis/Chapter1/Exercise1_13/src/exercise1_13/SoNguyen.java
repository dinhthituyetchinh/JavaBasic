/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_13;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class SoNguyen {
    private int number;
    Scanner scanner = new Scanner(System.in);
    public void inputNum()
    {
        System.out.print("Input interger: ");
        number = scanner.nextInt();
    } 
    
    public void lietKeUocSoLe()
    {
        for(int i = 1; i <= number; i++)
        {
           if((i % 2 != 0) && (number % i == 0))
           {
               System.out.print(i+"\t");
           }
        }
    }
    
}
