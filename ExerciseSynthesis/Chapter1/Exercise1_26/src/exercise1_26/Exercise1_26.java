/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1_26;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise1_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TamGiac tg = new TamGiac();
        tg.nhap();
        System.out.println("Thông tin tam giác vừa nhập:");
        tg.xuat();
        System.out.println("Diện tích tam giác: " + tg.tinhDienTich());
        System.out.println("Chu vi tam giác: " + tg.tinhChuVi());
    }
    
}
