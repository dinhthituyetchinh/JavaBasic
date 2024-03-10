/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_32;

/**
 *
 * @author Tuyet Chinh
 */
public abstract class NguoiLaoDong 
{
    protected String maSo, hoTen;
    protected int namSinh;
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
    
    public abstract double tinhLuong();
    public void nhap()
    {
        System.out.print("Nhập mã số: ");
        maSo = Scan.scanner.next();
        System.out.print("Nhập họ tên: ");
        hoTen = Scan.scanner.next();
        System.out.print("Nhập năm sinh: ");
        namSinh = Scan.scanner.nextInt();
        
    }
    
    public void xuat()
    {
        System.out.println("Mã số: "+ getMaSo());
        System.out.println("Họ tên: "+getHoTen());
        System.out.println("Năm sinh: "+getNamSinh());
    }
}
