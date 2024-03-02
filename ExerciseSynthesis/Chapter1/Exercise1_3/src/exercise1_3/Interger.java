/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_3;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class Interger
{
    private int number1, number2;
    public void inputNum()
    {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập số thứ nhất: ");
            number1 = scanner.nextInt();
            System.out.print("Nhập số thứ hai: ");
            number2 = scanner.nextInt();
        }
    }
    public void compareNumbers()
    {
        if (number1 == number2) {
            System.out.println("Hai số bằng nhau.");
        } else {
            int min = Math.min(number1, number2);
            int max = Math.max(number1, number2);

            System.out.println("Số nhỏ hơn: " + min);
            System.out.println("Số lớn hơn: " + max);
        }
    }
}
