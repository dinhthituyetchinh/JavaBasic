/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import BLL.Common;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class NhanVien
{
    private String _MaSo, _HoTen, _GioiTinh, _DiaChi, _SoDienThoai, _Email;
    private LocalDateTime _NgaySinh, _ThoiGianVaoLam, _ThoiGianTroThanhNVCT;
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    Common common = new Common();
    public String getMaSo() {
        return _MaSo;
    }

    public String getHoTen() {
        return _HoTen;
    }

    public String getGioiTinh() {
        return _GioiTinh;
    }

    public String getDiaChi() {
        return _DiaChi;
    }

    public String getSoDienThoai() {
        return _SoDienThoai;
    }

    public String getEmail() {
        return _Email;
    }

    public LocalDateTime getNgaySinh() {
        return _NgaySinh;
    }

    public LocalDateTime getThoiGianVaoLam() {
        return _ThoiGianVaoLam;
    }

    public LocalDateTime getThoiGianTroThanhNVCT() {
        return _ThoiGianTroThanhNVCT;
    }

    public void setMaSo(String _MaSo) {
        if(!_MaSo.startsWith("VG") && _MaSo.substring(2).chars().allMatch(Character::isDigit))
        {
            System.out.println("Bắt buộc hai kí tự đầu là 'VG'");
        }
        else
        this._MaSo = _MaSo;
    }

    public void setHoTen(String _HoTen) {
        this._HoTen = _HoTen;
    }

    public void setGioiTinh(String _GioiTinh) {
        this._GioiTinh = _GioiTinh;
    }

    public void setDiaChi(String _DiaChi) {
        this._DiaChi = _DiaChi;
    }

    public void setSoDienThoai(String _SoDienThoai) {
        this._SoDienThoai = _SoDienThoai;
    }

    public void setEmail()
    {
       
        this._Email = common.formatEmail(this._HoTen);
    }

    public void setNgaySinh(LocalDateTime _NgaySinh) {      
        this._NgaySinh = _NgaySinh;      
    }

    public void setThoiGianVaoLam(LocalDateTime _ThoiGianVaoLam)
    {
        if( Year.now().getValue() - _NgaySinh.getYear() > 18)
        this._ThoiGianVaoLam = _ThoiGianVaoLam;
        else
            System.out.println("Không nhận");
    }

    public void setThoiGianTroThanhNVCT(LocalDateTime _ThoiGianTroThanhNVCT) {
        this._ThoiGianTroThanhNVCT = _ThoiGianTroThanhNVCT;
    }
    
    public NhanVien()
    {
        
    }
    public NhanVien(String _MaSo, String _HoTen, String _GioiTinh, String _DiaChi, String _SoDienThoai, LocalDateTime _NgaySinh, LocalDateTime _ThoiGianVaoLam, LocalDateTime _ThoiGianTroThanhNVCT) 
    {
        setMaSo(_MaSo);
        this._HoTen = _HoTen;
        this._GioiTinh = _GioiTinh;
        this._DiaChi = _DiaChi;
        this._SoDienThoai = _SoDienThoai;
        setEmail();
        this._NgaySinh = _NgaySinh;
        setThoiGianVaoLam(_ThoiGianVaoLam);
        this._ThoiGianTroThanhNVCT = _ThoiGianTroThanhNVCT;
    }

    public void Nhap()
    {
        System.out.print("Nhập mã số: ");
        _MaSo = scanner.next();
        System.out.print("Nhập họ tên: ");
        _HoTen = scanner.next();
        System.out.print("Nhập ngày sinh: ");
        _NgaySinh = LocalDateTime.parse(scanner.next());
        System.out.print("Nhập giới tính: ");
        _GioiTinh = scanner.next();
        System.out.print("Nhập địa chỉ: ");
        _DiaChi = scanner.next();
        System.out.print("Nhập số điện thoại: ");
        _SoDienThoai = scanner.next();
        System.out.print("Nhập thời gian vào làm: ");
        _ThoiGianVaoLam = LocalDateTime.parse(scanner.next());
        System.out.print("Nhập thời gian được làm nhân viên chính thức: ");
        _ThoiGianTroThanhNVCT = LocalDateTime.parse(scanner.next());
        System.out.print("Nhập email: ");
        _Email = scanner.next();
    }
    
    public void Xuat()
    {
        System.out.println("Mã số: " + _MaSo);
        System.out.println("Họ tên: " + _HoTen);
        System.out.println("Ngày sinh: " + _NgaySinh);
        System.out.println("Giới tính: " + _GioiTinh);
        System.out.println("Địa chỉ: " + _DiaChi);
        System.out.println("Số điện thoại: " + _SoDienThoai);
        System.out.println("Thời gian vào làm: " + _ThoiGianVaoLam);
        System.out.println("Thời gian trở thành nhân viên chính thức: " + _ThoiGianTroThanhNVCT);
        System.out.println("Email: " + _Email); 
    }
    
    public double thamNien()
    {

        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime oldDate = ZonedDateTime.of(_ThoiGianVaoLam, ZoneId.systemDefault());
        
        Duration duration = Duration.between(oldDate, now);
        
        return duration.toDays();
        //return (LocalDateTime.now().getMonth().getValue() - _ThoiGianVaoLam.getMonth().getValue())/ 12;
    }
    
    public double phuCapTN()
    {
        if(thamNien() <= 3)
        {
            return 1000000;
        }
        else if(thamNien() <= 6)
        {
            return 2000000;
        }
        else if(thamNien() <= 10)
        {
            return 2000000;
        }
        else
        {
            return 5000000;
        }
    }
    
    private double tienTangThamNien()
    {
        if (Math.ceil(thamNien())  > 11)
        {
            return (Math.ceil(thamNien()) - 11) * 500000;
        }
        
        return 0;
    }

}
