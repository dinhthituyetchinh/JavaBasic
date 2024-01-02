/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

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
