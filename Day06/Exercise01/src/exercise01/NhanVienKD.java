/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise01;

/**
 *
 * @author Tuyet Chinh
 */
public class NhanVienKD extends NhanVien
{
    private double doanhSoBanHangToiThieu, doanhThu;     
   
    public double getDoanhSoBanHangToiThieu() {
        return doanhSoBanHangToiThieu;
    }
   
    public void setDoanhSoBanHangToiThieu(double doanhSoBanHangToiThieu) {
        this.doanhSoBanHangToiThieu = doanhSoBanHangToiThieu;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
    
    public NhanVienKD()
    {

    }

    @Override
    public char xepLoai()
    {
        if (doanhThu > 2* doanhSoBanHangToiThieu )
            return 'A';
        else if (doanhThu < doanhSoBanHangToiThieu)
            return 'C';
        else if (doanhThu < 0.5 * doanhSoBanHangToiThieu)
            return 'D';
        else return 'B';
    }
    public double vuotMuc()
    {
        return doanhThu - doanhSoBanHangToiThieu;
    }
    public double hoaHong()
    {
        if(vuotMuc() > 0)
        return 0.15 * vuotMuc ();
        else
        return 0;
    }
    @Override
    public double tinhLuong()
    {
        return super.tinhLuong() + hoaHong();
    }
}
