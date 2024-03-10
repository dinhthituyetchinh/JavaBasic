/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1_32;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise1_32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GVCoHuu gvCoHuu = new GVCoHuu();
        gvCoHuu.nhap();
        gvCoHuu.xuat();
        System.out.println("Lương là: " +String.format("%, .2f",gvCoHuu.tinhLuong()));
        
        NVCoHuu nvCoHuu = new NVCoHuu();
        nvCoHuu.nhap();
        nvCoHuu.xuat();
        System.out.println("Lương là: " +String.format("%, .2f",nvCoHuu.tinhLuong()));
        System.out.println("Lương sau khi xét khen thưởng là: " +String.format("%, .2f",nvCoHuu.tinhKhenThuong()));
        

        GVThinhGiang gvTG = new GVThinhGiang();
        gvTG.nhap();
        gvTG.xuat();
        System.out.println("Lương là: " +String.format("%, .2f",gvTG.tinhLuong()));

        
        NVHopDong nvHD = new NVHopDong();
        nvHD.nhap();
        nvHD.xuat();
        System.out.println("Lương là: " +String.format("%, .2f",nvHD.tinhLuong()));
        System.out.println("Lương sau khi xét khen thưởng là: " +String.format("%, .2f",nvHD.tinhKhenThuong()));
        
    }
    
}
