/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise03;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class NuocGiaiKhat
{
    private String tenHang, dvt;
    private int sl;
    private float dg;
    public static float VAT = 0.1f;
    
    public void setSl(int value)
    {
        if(sl < 0)
        {
            System.out.println("Số lượng phải lớn hơn 0");
        }
        else
        {
            sl = value;
        }
    }
    
    public void setDg(float value)
    {
        if(dg < 0)
        {
            System.out.println("Đơn giá phải lớn hơn 0");
        }
        else
        {
            dg = value;
        }
    }
    
    public String getDvt()
    {
        if(dvt == "kết")
            return "kết";
        else
            if(dvt == "thùng")
                return "thùng";
            else
                if(dvt == "chai")
                    return "chai";
                else
                    if(dvt == "lon")
                        return "lon";
                    else
                        return "kết";
    }
    public NuocGiaiKhat()
    {
        
    }
    public NuocGiaiKhat(String ten, String dvt, int slg, float donGia)
    {
        this.tenHang =  ten;
        this.dvt = dvt;
        this.setSl(slg);
        this.setDg(donGia);
    }
    
    public void Nhap()
    {
        try (Scanner scanner = new Scanner(System.in).useDelimiter("\n")) {
            System.out.print("Nhập tên hàng: ");
            tenHang = scanner.next();
            System.out.print("Đơn vị tính: ");
            dvt = scanner.next();
            System.out.print("Nhập số lượng: ");
            sl = scanner.nextInt();
            System.out.println("Nhập đơn giá: ");
            dg = scanner.nextFloat();
        }
    }
    public void Xuat()
    {
        System.out.println("Tên hàng: "+ tenHang);
        System.out.println("Đơn vị tính: "+dvt);
        System.out.println("Số lượng: "+sl);
        System.out.println("Đơn giá: "+dg);        
    }
    public double thanhTien()
    {
        if(dvt == "kết" || dvt == "thùng")
        {
            return sl * dg + sl * dg * NuocGiaiKhat.VAT;
        }
        else if(dvt == "chai")
        {
            return sl * (dg/ 20) + sl * (dg/ 20) * NuocGiaiKhat.VAT;
        }
        else
            return sl * (dg/ 24) + sl * (dg/ 24) * NuocGiaiKhat.VAT;
    }
}
