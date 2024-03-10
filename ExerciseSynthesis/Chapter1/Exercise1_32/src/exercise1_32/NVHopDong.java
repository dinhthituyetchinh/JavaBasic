/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_32;

/**
 *
 * @author Tuyet Chinh
 */
public class NVHopDong extends LDNgoaiBienChe implements XetKhenThuong
{
    
    private int ngayCong;

    public int getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong(int ngayCong) {
        this.ngayCong = ngayCong;
    }
    
    @Override
    public double tinhLuong()
    {
        return getMucLuong() * getNgayCong();
    }
    @Override
    public void nhap()
    {
        super.nhap();
        System.out.print("Nhập ngày công: ");
        ngayCong = Scan.scanner.nextInt();
    }
    
    @Override
    public void xuat()
    {
        super.xuat();
        System.out.println("Ngày công: "+getNgayCong());
    }
    
   @Override
    public double tinhKhenThuong() {
        if(getNgayCong() >= 25)
        {
            return tinhLuong() + 1500000;
        }
        else
            return tinhLuong();
    }
}
