/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1_11;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise1_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("CHUONG TRINH NHAP VAO NGAY THANG NAM VA CHO BIET NGAY TRUOC DO VA NGAY SAU DO");
       NgayThang dt = new NgayThang();
       dt.input();
       dt.ngayTruocDo();
       dt.ngaySauDo();
    }
    
}
