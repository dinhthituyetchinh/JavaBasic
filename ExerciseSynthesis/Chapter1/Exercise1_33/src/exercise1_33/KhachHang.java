/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_33;

/**
 *
 * @author Tuyet Chinh
 */
public class KhachHang {
    private String maSo, hoTen;
    private int namSinh;

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public KhachHang() {
    }

    public KhachHang(String maSo, String hoTen, int namSinh) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }
    
    public void nhapKH()
    {
        System.out.println("Nhập mã số: ");
        maSo = Scan.scanner.next();
        System.out.println("Nhập họ tên: ");
        hoTen = Scan.scanner.next();
        System.out.println("Nhập năm sinh: ");
        namSinh = Scan.scanner.nextInt();
    }
    
    public void xuatKH()
    {
        System.out.println("Mã số: "+ getMaSo());
        System.out.println("Họ tên: "+ getHoTen());
        System.out.println("Năm sinh: "+getNamSinh());
    }
}
