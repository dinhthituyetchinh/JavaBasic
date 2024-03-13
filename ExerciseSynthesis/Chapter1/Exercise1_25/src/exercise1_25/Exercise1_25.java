/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1_25;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise1_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PhanSo a = new PhanSo(3, 7);
        a.hienThiPS();
        PhanSo b = new PhanSo(4, 9);
        b.hienThiPS();
        PhanSo x = new PhanSo();
        x.nhapPS();
        x.hienThiPS();
        PhanSo y = new PhanSo();
        y.nhapPS();
        y.hienThiPS();
//        System.out.println("Nghịch đảo của x (làm thay đổi giá trị của x):");
//        x.nghichDao();
//        x.hienThiPS();       
        System.out.println("Tổng của x và y: ");
        PhanSo ps = new PhanSo();
        //Cách 1
//        ps =  ps.congPS(x, y);
//        ps.hienThiPS();
        //Cách 2
        ps = x.congPS(y);
        ps.hienThiPS();
        
        DanhSachPS lst = new DanhSachPS();
        lst.nhapDSPS();
        lst.xuatDSPS();
        System.out.println("Tổng các phân số là: "+ lst.tongDSPS().hienThi());
    }
    
}
