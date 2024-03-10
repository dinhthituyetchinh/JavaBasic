/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_32;

/**
 *
 * @author Tuyet Chinh
 */
public abstract class LDNgoaiBienChe extends NguoiLaoDong
{
    
    protected double mucLuong;

    public double getMucLuong() {
        return mucLuong;
    }

    public void setMucLuong(double mucLuong) {
        this.mucLuong = mucLuong;
    }

    @Override
    public abstract double tinhLuong();
    
    @Override
    public void nhap()
    {
        super.nhap();
        System.out.print("Nhập mức lương: ");
        mucLuong = Scan.scanner.nextDouble();
    }
    
    @Override
    public void xuat()
    {
        super.xuat();
        System.out.println("Mức lương: "+getMucLuong());
    }
}
