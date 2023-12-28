/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise01;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Tuyet Chinh
 */
public class DSNhanVien
{
    List<NhanVien> dsnv = new ArrayList<NhanVien>();
    public DSNhanVien()
    {

    }
    public void themNV(NhanVien nv)
    {
        dsnv.add(nv);
    }
    public double tinhTong()
    {
         return dsnv.stream().mapToDouble(nv -> nv.tinhLuong()).sum();
    }
    // cách 2
    public double tinhTongLuong()
    {
        double tong = 0;
        for(NhanVien nv: dsnv)
        {
            tong += nv.tinhLuong();
        }
        return tong;
    }
}
