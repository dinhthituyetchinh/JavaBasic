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
public class NhanVienVinReal extends NhanVien implements I_DanhGia
{
    private double tongTienMotThang;

    public double getTongTienMotThang() {
        return tongTienMotThang;
    }

    public void setTongTienMotThang(double tongTienMotThang) {
        this.tongTienMotThang = tongTienMotThang;
    }

    public NhanVienVinReal() {
        super();
    }

    public NhanVienVinReal(double tongTienMotThang, String _MaSo, String _HoTen, String _GioiTinh, String _DiaChi, String _SoDienThoai, LocalDateTime _NgaySinh, LocalDateTime _ThoiGianVaoLam, LocalDateTime _ThoiGianTroThanhNVCT) {
        super(_MaSo, _HoTen, _GioiTinh, _DiaChi, _SoDienThoai, _NgaySinh, _ThoiGianVaoLam, _ThoiGianTroThanhNVCT);
        this.tongTienMotThang = tongTienMotThang;
    }
    
    
    private double luong() {
        return 0.15 * getTongTienMotThang();
    }
    @Override
    public String danhGia() {
        if (luong() > 20000) {
            return "Năng lực tốt";
        } else if (luong() > 10000) {
            return "Có năng lực";
        } else {
            return " ";
        }
    }
    @Override
    public void Xuat() {
        super.Xuat();
        if (tongTienMotThang > 0) {
            System.out.println("Tổng tiền một tháng: " + tongTienMotThang);
        }
    }
}
