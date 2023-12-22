/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise01;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập vào số thứ nhất: ");
        int a = scanner.nextInt();        
        System.out.print("Nhập vào số thứ hai: ");
        int b = scanner.nextInt();
        System.out.println("Tổng: "+ (a + b));
        System.out.println("Hiệu: "+ (a - b));
        System.out.println("Tích: "+ (a * b));
        float c = a;
        float d = b;
        System.out.println("Thương: "+  (c/ d));
        scanner.close();
        
    }
    
}
