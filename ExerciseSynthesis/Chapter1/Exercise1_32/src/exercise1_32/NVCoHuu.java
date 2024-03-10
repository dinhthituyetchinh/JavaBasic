/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_32;

/**
 *
 * @author Tuyet Chinh
 */
public class NVCoHuu extends LDBienChe implements XetKhenThuong
{
    private int soGioLamThem;

    public int getSoGioLamThem() {
        return soGioLamThem;
    }

    public void setSoGioLamThem(int soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }
    @Override
    public double tinhLuong()
    {
        return getHSL() * LDBienChe.LCS + soGioLamThem * 5000;
    }
    
    @Override
    public void nhap()
    {
        super.nhap();
        System.out.print("Nhập số giờ làm thêm: ");
        soGioLamThem = Scan.scanner.nextInt();
    }
    @Override
    public void xuat()
    {
        super.xuat();
        System.out.println("Số giờ làm thêm: "+ getSoGioLamThem());
    }
    
    @Override
    public double tinhKhenThuong() {
        if(getSoGioLamThem() >= 40)
        {
            return tinhLuong() + 1000000;
        }
        else
            return tinhLuong();
    }
}
