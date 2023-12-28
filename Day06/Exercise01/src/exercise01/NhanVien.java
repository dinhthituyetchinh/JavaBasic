/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise01;

import java.time.Year;

/**
 *
 * @author Tuyet Chinh
 */
public abstract class NhanVien 
{
    protected String maNV, tenNV, gioiTinh;
    protected int namSinh, namVL;
    protected float hsl;
    protected static float luongCoBan = 1150;

    public String getMaNhanVien() {
        return maNV;
    }

    public void setMaNhanVien(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNhanVien() {
        return tenNV;
    }

    public void setTenNhanVien(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getHeSoLuong() {
        return hsl;
    }

    public void setHeSoLuong(float hsl) {
        this.hsl = hsl;
    }

    public int getNamVaoLam() {
        return namVL;
    }

    public void setNamVaoLam(int namVL) {
        this.namVL = namVL;
    }
    
    public NhanVien()
    {

    }

     public int thoiGianLamViec()
    {
        return Year.now().getValue() - namVL;
    }
    public double phuCapThamNien()
    {
        if (thoiGianLamViec() >= 5)
            return (double)thoiGianLamViec() * NhanVien.luongCoBan / 100;
        else
            return 0;
    }
    public float heSoThiDua()
    {
        if (xepLoai() == 'A')
            return 1.0f;
        else if (xepLoai() == 'B')
            return 0.75f;
        else if (xepLoai() == 'C')
            return 0.5f;
        else
            return 0f;
    }
    public double thuNhap()
    {
        return (heSoThiDua() * tinhLuong() + phuCapThamNien());
    }
    public abstract char xepLoai();
    public  double tinhLuong()
    {
        return hsl * NhanVien.luongCoBan;
    }
}
