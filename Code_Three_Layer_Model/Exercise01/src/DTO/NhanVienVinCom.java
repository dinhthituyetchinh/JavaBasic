/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author Tuyet Chinh
 */
public abstract class NhanVienVinCom extends NhanVien
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
    
    public NhanVienVinCom(double _HeSoLuong) 
    {
        super();
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
}
