/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1_30;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise1_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DanhSachMonHoc dt = new DanhSachMonHoc();
        dt.docFile("dsmh.xml");
        dt.xuatDS();
        System.out.println("Trung bình tích luỹ: "+dt.diemTichLuy());
    }
    
}
