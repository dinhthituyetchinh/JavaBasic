/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise01;

/**
 *
 * @author Tuyet Chinh
 */
public class CanBoQuanLy extends NhanVien
{
    private String chucVu;
    private float heSoChucVu;
    public void setChucVu(String value)
    {
        chucVu = value;
    }
    public void setHeSoChucVu(float value)
    {
        heSoChucVu = value;
    }
    @Override
    public char xepLoai()
    {
        return 'A';
    }
    public double phuCapCV()
    {
        return heSoChucVu * 1100;
    }
    @Override
    public double tinhLuong()
    {
        return super.tinhLuong() + phuCapCV();
    }
}
