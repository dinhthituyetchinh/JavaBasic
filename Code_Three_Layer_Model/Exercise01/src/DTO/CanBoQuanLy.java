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
public class CanBoQuanLy extends NhanVienVinCom
{
    private String chucVu;
    private double hsCV;

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public double getHsCV() {
        return hsCV;
    }

    public void setHsCV(double hsCV) {
        this.hsCV = hsCV;
    }

    public CanBoQuanLy() {
        super();
    }

    public CanBoQuanLy(String chucVu, double hsCV, String _MaSo, String _HoTen, String _GioiTinh, String _DiaChi, String _SoDienThoai, LocalDateTime _NgaySinh, LocalDateTime _ThoiGianVaoLam, LocalDateTime _ThoiGianTroThanhNVCT, double _HeSoLuong) {
        super(_MaSo, _HoTen, _GioiTinh, _DiaChi, _SoDienThoai, _NgaySinh, _ThoiGianVaoLam, _ThoiGianTroThanhNVCT, _HeSoLuong);
        this.chucVu = chucVu;
        this.hsCV = hsCV;
    }
    
    
    @Override
    public char XepLoai() {
        return 'A';
    }

    @Override
    public double luong() {
        return getHeSoLuong()* NhanVienVinCom._LuongCoBan + phuCapCV();
    }

    private double phuCapCV() {
        return getHsCV() * 1100;
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println("Chức vụ: " + chucVu);
        System.out.println("Hệ số chức vụ: " + hsCV);
    }
}
