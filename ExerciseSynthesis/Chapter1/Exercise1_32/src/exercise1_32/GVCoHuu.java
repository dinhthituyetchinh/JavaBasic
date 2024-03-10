/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_32;

/**
 *
 * @author Tuyet Chinh
 */
public class GVCoHuu extends LDBienChe 
{
    private double hsThamNien;

    public double getHsThamNien() {
        return hsThamNien;
    }

    public void setHsThamNien(double hsThamNien) {
        this.hsThamNien = hsThamNien;
    }
    
    
    @Override
    public double tinhLuong()
    {
        return getHSL() * LDBienChe.LCS *(1 + getHsThamNien());
    }
    
    @Override
    public void nhap()
    {
        super.nhap();
        System.out.print("Nhập hệ số thâm niên: ");
        hsThamNien = Scan.scanner.nextDouble();
    }
    
    @Override
    public void xuat()
    {
        super.xuat();
        System.out.println("Hệ số thâm niên: "+getHsThamNien());
        
    }
    
    
}
