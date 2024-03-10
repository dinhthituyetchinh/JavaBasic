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
    protected String maMH,tenMH; 
    protected int soTC;

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
    public Scanner scanner = new Scanner(System.in);

    public MonHoc() {
    }
    
    public MonHoc(String maMH, String tenMH, int soTC)
    {
        setMaMH(maMH);
        setTenMH(tenMH);
        setSoTC(soTC);
    }
    public abstract double diemTB();
    public abstract double hocPhi();
    public void nhap()
    {
        System.out.print("Nhập mã môn học: ");
        maMH = scanner.next();
        System.out.print("Nhập tên môn học: ");
        tenMH = scanner.next();
        System.out.print("Nhập số tín chỉ: ");
        soTC = scanner.nextInt();
    }
    public void xuat()
     {
        System.out.println("Mã MH: "+getMaMH());
        System.out.println("Tên MH: "+getTenMH());
        System.out.println("Số tín chỉ: "+getSoTC());
     }
}
