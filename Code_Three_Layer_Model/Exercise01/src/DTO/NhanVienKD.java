/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.time.LocalDateTime;

/**
 *
 * @author Tuyet Chinh
 */
public class NhanVienKD extends NhanVienVinCom
{
    private double doanhSoBHTT, doanhSoBHTheoThang;

    public double getDoanhSoBHTT() {
        return doanhSoBHTT;
    }

    public double getDoanhSoBHTheoThang() {
        return doanhSoBHTheoThang;
    }

    public void setDoanhSoBHTT(double doanhSoBHTT) {
        this.doanhSoBHTT = doanhSoBHTT;
    }

    public void setDoanhSoBHTheoThang(double doanhSoBHTheoThang) {
        this.doanhSoBHTheoThang = doanhSoBHTheoThang;
    }

    
    public NhanVienKD(double doanhSoBHTT, double doanhSoBHTheoThang) 
    {
        super();
        this.doanhSoBHTT = doanhSoBHTT;
        this.doanhSoBHTheoThang = doanhSoBHTheoThang;
    }

    public NhanVienKD(double doanhSoBHTT, double doanhSoBHTheoThang, String _MaSo, String _HoTen, String _GioiTinh, String _DiaChi, String _SoDienThoai, LocalDateTime _NgaySinh, LocalDateTime _ThoiGianVaoLam, LocalDateTime _ThoiGianTroThanhNVCT, double _HeSoLuong) {
        super(_MaSo, _HoTen, _GioiTinh, _DiaChi, _SoDienThoai, _NgaySinh, _ThoiGianVaoLam, _ThoiGianTroThanhNVCT, _HeSoLuong);
        this.doanhSoBHTT = doanhSoBHTT;
        this.doanhSoBHTheoThang = doanhSoBHTheoThang;
    }
   
    @Override
    public char XepLoai() 
        {
            if (getDoanhSoBHTheoThang() < 0.5 * getDoanhSoBHTT())
                return 'D';
            else
                if (doanhSoBHTheoThang > 2 * getDoanhSoBHTT())
                return 'A';
            else if (doanhSoBHTheoThang < getDoanhSoBHTT())
                return 'C';
            else return 'B';
        }

    @Override
       public double luong() 
      {
          return getHeSoLuong() * NhanVienVinCom._LuongCoBan + hoaHong();
      }
      private double hoaHong()
      {
          return 0.15 * (getDoanhSoBHTheoThang() - getDoanhSoBHTT());
      }
        
    @Override
        public void Xuat()
        {
            super.Xuat();
            System.out.println("Doanh số bán hàng tối thiểu: "+ String.format("%.2f", getDoanhSoBHTT()));
            System.out.println("Doanh số bán hàng theo tháng: " + String.format("%.2f",getDoanhSoBHTheoThang()));
        }
    
}
