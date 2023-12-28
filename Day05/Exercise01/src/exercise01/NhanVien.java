/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise01;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class NhanVien 
{
    private String maNV, tenNV;
    private int namVaoLam;
    private double hsl;
    private int soNN;
    public static int luongCB = 1150;
    public Scanner s = new Scanner(System.in).useDelimiter("\n");
    public NhanVien()
    {
        
    }
    
    public NhanVien(String ma, String ten, double hs)
    {
        this.maNV = ma;
        this.tenNV = ten;
        this.hsl = hs;
        this.namVaoLam = Year.now().getValue();
        this.soNN = 0;
    }
    
    public NhanVien(NhanVien a)
    {
        this.maNV = a.maNV;
        this.tenNV = a.tenNV;
        this.hsl = a.hsl;
        this.namVaoLam = a.namVaoLam;
        this.soNN = a.soNN;
    }
    
    public int soNamLamViec()
    {
        return Year.now().getValue() - namVaoLam;
    }
    public double phuCapTN()
    {
        if(soNamLamViec() >= 5)
        return soNamLamViec() * NhanVien.luongCB / 100;
        else return 0;
    }
    public char xetThiDua()
    {
        if(soNN <= 1)
        {
            return 'A';
        }
        else if(soNN <= 3)
        {
            return 'B';
        }
        else 
        {
            return 'C';
        }
    }
    
    public double heSoThiDua()
    {
        if(xetThiDua() == 'A')
        {
            return 1.0;
        } else if (xetThiDua() == 'B')
        {
            return 0.75;
        }
        else
        {
            return 0.5;
        }
    }
    public double luongNV()
    {
        return NhanVien.luongCB * hsl * heSoThiDua() + phuCapTN();
    }
    
    public void nhap()
        {
            System.out.print("Mời bạn nhập mã nhân viên: ");
            maNV = s.next();
            System.out.print("Mời bạn nhập họ tên nhân viên: ");
            tenNV = s.next();
            System.out.print("Mời bạn năm vào làm: ");
            namVaoLam = s.nextInt();
            System.out.print("Mời bạn nhập số ngày nghỉ: ");
            soNN = s.nextInt();
            System.out.print("Mời bạn nhập hệ số lương: ");
            hsl = s.nextDouble();
        }
        public void xuat()
        {
            System.out.println("Mã nhân viên: "+ maNV);
            System.out.println("Họ tên nhân viên: "+ tenNV);
            System.out.println("Năm vào làm: "+ namVaoLam);
            System.out.println("Số ngày nghỉ: "+ soNN);
            System.out.format("Hệ số lương: %.4f", hsl);
        }
}
