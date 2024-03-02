/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_30;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public abstract class MonHoc 
{
    private String maMH,tenMH; 
    private int soTC;

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getSoTC() {
        return soTC;
    }

    public void setSoTC(int soTC) {
        this.soTC = soTC;
    }
    Scanner scanner = new Scanner(System.in);
    
    public MonHoc(String maMH, String tenMH, int soTC)
    {
        setMaMH(maMH);
        setTenMH(tenMH);
        setSoTC(soTC);
    }
    public abstract double diemTB();
    public abstract double hocPhi();
     public void xuat()
     {
        System.out.println("Mã MH: "+getMaMH());
        System.out.println("Tên MH: "+getTenMH());
        System.out.println("Số tín chỉ: "+getSoTC());
     }
}
