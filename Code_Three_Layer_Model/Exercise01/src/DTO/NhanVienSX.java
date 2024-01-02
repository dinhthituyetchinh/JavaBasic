/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

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
    public NhanVienSX(double _HeSoLuong) {
        super(_HeSoLuong);
    }

    public NhanVienSX(int _SoNgayNghi) {
        super();
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
}
