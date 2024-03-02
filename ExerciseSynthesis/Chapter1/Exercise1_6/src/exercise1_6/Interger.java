/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_6;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class Interger
{
   private int number;
   public int Num()
   {
       return number;
   }
    public void inputNum()
    {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập số nguyên: ");
            number = scanner.nextInt();
        }
    } 
    public boolean testYear()
    {
        if((number % 400 == 0 || number % 4 == 0) && number % 100 != 0)
        {
            return true;
        }
        return false;
    }
}
