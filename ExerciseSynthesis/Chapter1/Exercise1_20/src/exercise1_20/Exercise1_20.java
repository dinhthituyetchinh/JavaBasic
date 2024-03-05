/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1_20;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise1_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int h;

        // Nhập chiều cao tam giác
        do {
            System.out.print("Nhập chiều cao tam giác: h = ");
            h = scanner.nextInt();
        } while (h < 0);

        // Vòng lặp để điều khiển số hàng
        for (int i = 1; i <= h; i++) {
            // Vòng lặp để tạo khoảng trống
            for (int j = 1; j <= h - i; j++) {
                System.out.print(" ");
            }
            // Vòng lặp để in dấu sao
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
