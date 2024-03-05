/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1_21;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise1_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int height;

        System.out.print("Nhập chiều cao của tam giác: ");
        height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= (2 * height - 1); j++) {
                if (j == height - i + 1 || j == height + i - 1 || i == height) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
