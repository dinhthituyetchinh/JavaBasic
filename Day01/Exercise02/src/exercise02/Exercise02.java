/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise02;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        try (Scanner scanner = new Scanner(System.in))
        {
            String mssv, fullName;
            float dtb;
            System.out.print("Nhập mã số sinh viên: ");
            mssv = scanner.next();
            System.out.print("Nhập họ tên sinh viên: ");
            fullName = scanner.next();
            System.out.print("Nhập điểm trung bình: ");
            try (Scanner scanner2 = new Scanner(System.in))
            {
                dtb = scanner2.nextFloat();
            }
            System.out.println("Mã số sinh viên: "+ mssv);
            System.out.println("Họ tên sinh viên: "+fullName);
            System.out.println("Điểm trung bình: "+ dtb);
            String xepLoai;
            if(dtb >= 8)
            {
                xepLoai = "Giỏi";
            }else if (dtb >= 6.5)
            {
                xepLoai ="Khá";
            }else if(dtb >= 5)
            {
                xepLoai = "Trung bình";
            }
            else
            {
                xepLoai = "Yếu";
            }   System.out.println("Xếp loại: " + xepLoai);
        }
    }
    
}
