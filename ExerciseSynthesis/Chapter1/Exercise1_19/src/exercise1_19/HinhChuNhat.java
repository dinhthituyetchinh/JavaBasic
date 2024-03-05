/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_19;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class HinhChuNhat {
    private int dai, rong;
    Scanner scanner = new Scanner(System.in);
    
    public void input()
    {
        System.out.println("Nhập chiều dài HCN:");
        dai = scanner.nextInt();
        System.out.println("Nhập chiều rong HCN:");
        rong = scanner.nextInt();
    }
    
    public void output()
    {
        for(int i = 1; i <= dai; i++)
        {
            for(int j = 1; j <= rong; j++)
            {
                if(i == 1 || j == 1 || i == dai || j == rong )
                {
                    System.out.print("* \t");
                }
                else
                    System.out.print(" \t");
            }
                System.out.format("\n");

        }
    }
}
