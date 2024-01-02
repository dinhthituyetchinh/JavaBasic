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
public class NhanVienSX extends NhanVienVinCom
{
   private static double _HeSoPhuCapNangNhoc = 0.1;
   private int _SoNgayNghi;
    public int getSoNgayNghi() {
        return _SoNgayNghi;
    }

    public void setSoNgayNghi(int _SoNgayNghi) {
        this._SoNgayNghi = _SoNgayNghi;
    }

    public NhanVienSX() {
        super();
    }   

    public NhanVienSX(int _SoNgayNghi, String _MaSo, String _HoTen, String _GioiTinh, String _DiaChi, String _SoDienThoai, LocalDateTime _NgaySinh, LocalDateTime _ThoiGianVaoLam, LocalDateTime _ThoiGianTroThanhNVCT, double _HeSoLuong) {
        super(_MaSo, _HoTen, _GioiTinh, _DiaChi, _SoDienThoai, _NgaySinh, _ThoiGianVaoLam, _ThoiGianTroThanhNVCT, _HeSoLuong);
        this._SoNgayNghi = _SoNgayNghi;
    }
    
   @Override
   public char XepLoai()
   {
       if(_SoNgayNghi <= 1)
       {
           return 'A';
       }
       else
           if(_SoNgayNghi <= 3)
           {
               return 'B';
           }
       else
           if(_SoNgayNghi <= 5)
           {
               return 'C';
           }
       else
           {
               return 'D';
           }
   }
   @Override
   public double luong()
   {
       return getHeSoLuong() * NhanVienVinCom._LuongCoBan * (1 + NhanVienSX._HeSoPhuCapNangNhoc);
   }
   
   @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Số ngày nghỉ: " + getSoNgayNghi());
    }

}
