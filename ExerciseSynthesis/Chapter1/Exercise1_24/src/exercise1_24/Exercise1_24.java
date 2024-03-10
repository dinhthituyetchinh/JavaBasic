/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1_24;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise1_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Diem2D dA = new Diem2D(3, 4);
        System.out.print("Toạ độ điểm A:");
        dA.hienThi();
        Diem2D dB = new Diem2D();
        dB.nhapDiem();
        System.out.println("Toạ độ điểm B:");
        dB.hienThi();
        System.out.println("Khoảng cách từ điểm B đến tâm O:"+String.format("%.2f", dB.khoangCachDenGocToaDo()));
        System.out.println("Khoảng cách từ điểm A đến điểm B: "+String.format("%.2f",dB.khoangCach(dA)));
        Diem2D dC = new Diem2D();
        System.out.println("Toạ độ điểm C:");
        dC.toaDoDoiXung(dB);
        dC.hienThi();
    }
    
}
