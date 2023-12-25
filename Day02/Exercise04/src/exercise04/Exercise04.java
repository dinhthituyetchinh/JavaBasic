/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise04;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          HinhChuNhat hinhChuNhat = new HinhChuNhat();
            hinhChuNhat.Nhap();
            hinhChuNhat.Xuat();
            
             System.out.println("Thay đổi kích thước HCN");
            System.out.print("Nhập vào kiểu để thay đổi, nhập 1 nếu bạn muốn tăng kích thước, nhập 0 nếu bạn muốn giảm kích thước: ");
            
            Scanner scanner = new Scanner(System.in).useDelimiter("\n");
            int kieu = scanner.nextInt();
            
            
//            try (Scanner scanner = new Scanner(System.in).useDelimiter("\n"))
//        {        
//           
//              int kieu = scanner.nextInt();
//        }
            //Kiểu 1

            System.out.println("Nhập vào kích thước để thay đổi HCN");
            int a, b;
            System.out.print("Nhập chiều dài để thay đổi: ");
            a = scanner.nextInt();
            System.out.print("Nhập chiều rộng để thay đổi: ");
            b = scanner.nextInt();
            System.out.println("Kích thước hình chữ nhật sau khi thay đổi");
            hinhChuNhat.changeSize(a, b, kieu);
            System.out.println("Chiều dài: "+ hinhChuNhat.getChieuDai());
            System.out.println("Chiều rộng: " + hinhChuNhat.getChieuRong());
            //Kiểu 2
            System.out.println("Kích thước hình chữ nhật sau khi thay đổi");
            hinhChuNhat.changeSize1(hinhChuNhat, kieu);
            System.out.println("Chiều dài: " + hinhChuNhat.getChieuDai());
            System.out.println("Chiều rộng: " + hinhChuNhat.getChieuRong());
       scanner.close();
    }
    
}
