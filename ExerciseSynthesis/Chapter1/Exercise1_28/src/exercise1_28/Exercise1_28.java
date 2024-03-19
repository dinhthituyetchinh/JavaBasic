/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1_28;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise1_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Tạo điểm màu A
        DiemMau A = new DiemMau(5, 10, "Trắng");
        System.out.println("Thông tin điểm A:");
        A.hienThi();

        // Tạo điểm màu tổng quát B
        DiemMau B = new DiemMau(0, 0, "");
        System.out.println("\nNhập thông tin điểm B:");
        B.input();
        B.diChuyen(10, 8); // Dời điểm B
        System.out.println("\nTọa độ điểm B sau khi dời:");
        B.hienThi();
        
        // Gán màu mới cho điểm B
        B.ganMau("Vàng");
        System.out.println("\nThông tin điểm B sau khi gán màu mới:");
        B.hienThi();
    }
    
}
