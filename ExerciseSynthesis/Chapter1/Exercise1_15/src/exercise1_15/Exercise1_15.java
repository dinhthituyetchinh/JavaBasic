/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1_15;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise1_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float n;
    Scanner scanner = new Scanner(System.in);
    float sum = 0.0f;
    do
    {
        System.out.println("Nhập vào số thực khác 0: ");
        n = scanner.nextFloat();
        if(n == 0)
        {
            System.out.println("Tổng các số vừa nhập: "+sum);

            break;
        }
         sum += n;

    }
    while(n != 0);
    }       
}
