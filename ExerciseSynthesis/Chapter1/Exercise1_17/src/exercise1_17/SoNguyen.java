/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_17;

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
        System.out.print("Enter an integer: ");
        number = scanner.nextInt();
    } 
    public boolean checkEvenNum(int x)
    {
        return x % 2 == 0;
    }
    
    public int totalTheNumberOfEvenDigits()
    {
        int total = 0;
        while(number != 0)
        {
            int temp = number % 10;
            if(checkEvenNum(temp))
            {
                total += temp;
            }
            number /= 10;
        }
        return total;
    }
}
