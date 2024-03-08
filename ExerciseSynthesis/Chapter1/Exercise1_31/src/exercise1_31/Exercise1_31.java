/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1_31;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise1_31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DSBatDongSan dt = new DSBatDongSan();
        
        dt.docFile("DSBDS.xml");
        dt.xuatDSBDS();
        System.out.printf("Tổng giá trị các bất động sản: %.2f\n", dt.tinhTongGiaTri());
        System.out.printf("Phí kinh doanh của các bds: %.2f\n", dt.tongPhiKD());
    }
    
}
