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
public abstract class NhanVienVinCom extends NhanVien implements I_DanhGia
{
    private double _HeSoLuong;
    public static double _LuongCoBan = 1400000;
    public double getHeSoLuong() {
        return _HeSoLuong;
    }

    public void setHeSoLuong(double _HeSoLuong) {
        this._HeSoLuong = _HeSoLuong;
    }

    public NhanVienVinCom() 
    {
        super();
    }
    
    public NhanVienVinCom(String _MaSo, String _HoTen, String _GioiTinh, String _DiaChi, String _SoDienThoai, LocalDateTime _NgaySinh, LocalDateTime _ThoiGianVaoLam, LocalDateTime _ThoiGianTroThanhNVCT, double _HeSoLuong) 
    {
        super(_MaSo, _HoTen, _GioiTinh, _DiaChi, _SoDienThoai, _NgaySinh, _ThoiGianVaoLam, _ThoiGianTroThanhNVCT);
        this._HeSoLuong = _HeSoLuong;
    }
    
    public abstract char XepLoai();
    public abstract double luong();
    public double DanhGiaXepLoai()
    {
       if(XepLoai() == 'A')
       {
           return luong() + phuCapTN();
       }
       else if(XepLoai() == 'B')
       {
           return 0.75 * luong() + phuCapTN();
       }
       else if(XepLoai() == 'C')
       {
           return 0.5 * luong() + phuCapTN();
       }
       else
       {
            return 0 * luong() + phuCapTN();
       }
    }
    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("HSL: " + getHeSoLuong());
    }
    
    @Override
    public String danhGia()
        {
            if (XepLoai() == 'A')
                return "Năng lực tốt";
            else if (XepLoai() == 'B')
                return "Có năng lực";
            else
                return " ";
        }
}
