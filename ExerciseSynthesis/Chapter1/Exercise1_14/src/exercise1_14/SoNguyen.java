/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_14;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class SoNguyen
{
    private int number;
    Scanner scanner = new Scanner(System.in);
   public int Num()
   {
       return number;
   }
    public void inputNum()
    {
        System.out.print("Nhập số nguyên: ");
        number = scanner.nextInt();
    } 
    public boolean checkSNT(int x)
    {
        if(x < 2)
        {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(x); i++)
        {
            if(x % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public boolean checkNum()
    {
        if(checkSNT(number) == true)
        {
            return true;
        }
        return false;
    }
}
