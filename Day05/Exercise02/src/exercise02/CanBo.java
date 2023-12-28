/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise02;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public final class CanBo extends NhanVien
{
    private String chucVu, phongBan;
    private double phuCapLD;
    Scanner s = new Scanner(System.in).useDelimiter("\n");
    public String getChucVu()
    {
        return chucVu;
    }
    public void setChucVu(String value)
    {
        chucVu = value;
    }
    public String getPhongBan()
    {
        return phongBan;
    }
    public void setPhongBan(String value)
    {
        phongBan = value;
    }
    public double getPhuCap()
    {
        return phuCapLD;
    }
    public void setPhuCap( double value)
    {
        phuCapLD = value;
    }
    
    public CanBo()
    {
        super();
        setChucVu("Trưởng phòng");
        setPhongBan("Phòng Hành Chính");
        setPhuCap(5.0);
    }
    
    public CanBo(String ma, String ten, double hsl, String cv, String pb, double pc)
    {
        super(ma, ten, hsl);
        setNamVaoLam(Year.now().getValue());
        setNgayNghi(1);
        this.setChucVu(cv);
        this.setPhongBan(pb);
        this. setPhuCap(pc);
    }
    
    public CanBo(NhanVien a, CanBo b)
    {
        super(a);
        chucVu = b.chucVu;
        phongBan = b.phongBan;
        phuCapLD = b.phuCapLD;
    }
    
    @Override
    public void nhap()
        {       
            super.nhap();
            System.out.println("Nhập chức vụ: ");
            chucVu = s.next();
            System.out.println("Nhập phòng ban: ");
            phongBan = s.next();
            System.out.println("Nhập hệ số phụ cấp lãnh đạo: ");
            phuCapLD = s.nextDouble();
        }
    
    @Override
        public void xuat()
        {
            super.xuat();
            System.out.println("\nChức vụ: "+ chucVu);
            System.out.println("Phòng ban: "+ phongBan);
            System.out.println("Hệ số phụ cấp lãnh đạo: "+  phuCapLD);
        }
        
    @Override
        public char xetThiDua()
        {
            return 'A';
        }
    public double PhuCapChucVu()
    {
        return phuCapLD * NhanVien.luongCB;
    }
    @Override
    public double luongNV()
    {
        return super.luongNV() + PhuCapChucVu();
    }
}
