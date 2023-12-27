/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise01;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class ThiSinh
{
    private String sbd, tenTS;
    private int namSinh;
    private double dToan, dVan, dNN;
    public Scanner s = new Scanner(System.in).useDelimiter("\n");
    public void setSbd(String value)
    {
        sbd = value;
    }
    
    public void setTen(String value)
    {
        tenTS = value;
    }
    
     public void setNamSinh(int value)
    {
        namSinh = value;
    }
    public void setDiemToan(double value)
    {
        dToan = value;
    }
     public void setDiemVan(double value)
    {
        dVan = value;
    }
      public void setDiemNgoaiNgu(double value)
    {
        dNN = value;
    }
    public ThiSinh()
    {
         this.sbd = "200121";
        this.tenTS = "";
        this.namSinh = 2003;
        this.dToan = 10;
        this.dVan = 10;
        this.dNN = 10;
    }
    public ThiSinh(String soBD, String ten, int ns, double toan, double van, double nn)
    {
        this.sbd = soBD;
        this.tenTS = ten;
        this.namSinh = ns;
        this.dToan = toan;
        this.dVan = van;
        this.dNN = nn;
    }
    public ThiSinh(ThiSinh a)
    {
        this.sbd = a.sbd;
        this.tenTS = a.tenTS;
        this.namSinh = a.namSinh;
        this.dToan = a.dToan;
        this.dVan = a.dVan;
        this.dNN = a.dNN;
    }
    
    public double tongDiem()
    {
        return dToan + dVan + (dNN * 2);
    }
    public static int diemChuan = 25;
    public String ketQua()
    {
        if (tongDiem() > ThiSinh.diemChuan)
            return "Đậu";
        else
            return "Rớt";
    }
    public void Nhap()
    {
           System.out.print("Nhập sbd: ");
           sbd = s.next();
           System.out.print("Nhập họ tên: ");
           tenTS = s.next();
           System.out.print("Nhập năm sinh: ");
           namSinh = s.nextInt();
           System.out.print("Nhập điểm toán: ");
           dToan = s.nextDouble();
           System.out.print("Nhập điểm văn: ");
           dVan = s.nextDouble();
           System.out.print("Nhập điểm ngoại ngữ: ");
           dNN = s.nextDouble();
       
    }
    public void Xuat()
    {
        System.out.println("Số báo danh: "+sbd);
        System.out.println("Họ tên: " +tenTS);
        System.out.println("Năm sinh: "+namSinh);
        System.out.format("Điểm toán: %.2f\n", dToan);
        System.out.format("Điểm văn: %.2f\n",dVan);
        System.out.format("Điểm ngoại ngữ: %.2f\n",dNN);
        System.out.format("Tổng điểm: %.2f\n", tongDiem());
        System.out.println("Kết quả: "+ketQua());
    }
}
