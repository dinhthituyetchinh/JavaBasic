/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise02;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public final class NhanVien {
    private String ms, ht;
    public String getMs()
    {
        return ms;
    }
    public void setMs(String value)
    {
        this.ms = value;
    }
    public String getHt()
    {
        return ht;
    }
    public void setHt(String value)
    {
        this.ht = value;
    }
    private int nc;
    public int getNc()
    {
        return nc;
    }
    public void setNc(int value)
    {
        if(value < 0)
        {
            System.out.println("Dữ liệu sai");
            nc = 0;
        }
        else
        {
          this.nc = value;  
        }
    }
    public char getXL()
    {
        if(nc > 26)
        {
            return 'A';
        }
        else if(nc >= 22)
        {
            return 'B';
        }
        else
        {
            return 'C';
        }
    }
    public static int luong = 200000;
    
    public NhanVien()
    {
        this.ms = "";
        this.ht = " ";
        this.nc = 0;
    }
    public NhanVien(String ma, String ten, int nc)
    {
        this.setMs(ma);
        this.setHt(ten);
        this.setNc(nc);
    }

    public void Nhap()
    {
        try (Scanner scanner = new Scanner(System.in).useDelimiter("\n")) {
            System.out.print("Nhập mã số:");
            ms = scanner.next();
            System.out.print("Nhập họ tên: ");
            ht = scanner.next();
            System.out.print("Nhập số ngày công: ");
            nc = scanner.nextInt();
        }
        
    }
    
    public void Xuat()
    {
        System.out.println("Mã số: "+ ms);
        System.out.println("Họ tên: "+ht);
        System.out.println("Ngày công: "+ nc);
        System.out.println("Xếp loại: "+getXL());
        System.out.println("Lương: "+tinhLuong());
        System.out.println("Thưởng: "+tinhThuong());
    }
    
    public double tinhLuong()
    {
        return nc * NhanVien.luong;
    }
    
    public double tinhThuong()
    {
        if(getXL() == 'A')
        {
            return tinhLuong() * 5/ 100;
        }
        else if(getXL() == 'B')
            {
                return tinhLuong() * 2/ 100;
            }
        else
            return 0;
    }
}
