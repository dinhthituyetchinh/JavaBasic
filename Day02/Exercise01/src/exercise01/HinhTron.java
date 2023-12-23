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
public class HinhTron {
    private double r;
    public double getR()
    {
       return r;
    }
    public void setR(double value)
    {
        this.r = value;
    }
    public HinhTron()
    {
        this.r = 0;
    }
    public HinhTron(double r)
    {
//        this.r = r;
        setR(r);
    }
    public void nhap()
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            System.out.println("Nhập bán kính hình tròn: ");
            this.r = scanner.nextDouble();
        }
    }
    public double tinhChuVi()
    {
        return this.r * 2 * Math.PI;
    }
    public double tinhDienTich()
    {
        return Math.pow(this.r, 2) * Math.PI;
    }
    public void xuat()
    {
        System.out.format("Hình tròn có chu vi: %.2f\n", tinhChuVi());
        System.out.format("Hình tròn có diện tích: %.2f\n", tinhDienTich());
    }
}
