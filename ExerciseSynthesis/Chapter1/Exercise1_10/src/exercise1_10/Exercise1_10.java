/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1_10;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise1_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int ng, t, n;
        System.out.print("Nhap ngay thang nam: ");
        ng = scanner.nextInt();
        t = scanner.nextInt();
        n = scanner.nextInt();

        switch (t) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if (ng > 0 && ng <= 31)
                    System.out.printf("Ngay %d Thang %d Nam %d HOP LE", ng, t, n);
                else
                    System.out.printf("Ngay %d Thang %d Nam %d KHONG HOP LE", ng, t, n);
                break;
            }
            case 4, 6, 9, 11 -> {
                if (ng > 0 && ng <= 30)
                    System.out.printf("Ngay %d Thang %d Nam %d HOP LE", ng, t, n);
                else
                    System.out.printf("Ngay %d Thang %d Nam %d KHONG HOP LE", ng, t, n);
                break;
            }
            case 2 -> {
                if ((ng > 0 && ng <= 28) || (ng == 29 && (n % 4 == 0 && n % 100 != 0 || n % 400 == 0)))
                    System.out.printf("Ngay %d Thang %d Nam %d HOP LE", ng, t, n);
                else
                    System.out.printf("Ngay %d Thang %d Nam %d KHONG HOP LE", ng, t, n);
                break;
            }
            default -> System.out.printf("Ngay %d Thang %d Nam %d KHONG HOP LE", ng, t, n);
        }
    
    }
    
}
