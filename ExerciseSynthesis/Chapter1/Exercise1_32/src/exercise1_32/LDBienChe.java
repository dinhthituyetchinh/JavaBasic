/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_32;

/**
 *
 * @author Tuyet Chinh
 */
public abstract class LDBienChe extends NguoiLaoDong
{
    protected double HSL;
    public static double LCS = 1490000;
    public double getHSL() {
        return HSL;
    }

    public void setHSL(double HSL) {
        this.HSL = HSL;
    }    
  
    @Override
    public abstract double tinhLuong();
    
    @Override
    public void nhap()
    {
        super.nhap();
        System.out.print("Nhập hệ số lương: ");
        HSL = Scan.scanner.nextDouble();
    }
    
    @Override 
    public void xuat()
    {
        super.xuat();
        System.out.println("Hệ số lương: "+ getHSL());
    }
}
