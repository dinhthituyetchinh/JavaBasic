/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_32;

/**
 *
 * @author Tuyet Chinh
 */
public class GVThinhGiang extends LDNgoaiBienChe
{
    private int soTietGD;
    private String trinhDo;

    public int getSoTietGD() {
        return soTietGD;
    }

    public void setSoTietGD(int soTietGD) {
        this.soTietGD = soTietGD;
    }

    public String getTrinhDo()
    {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }
    
    private double trinhDoGV()
    {
        if("ĐH".equals(getTrinhDo()))
        {
            return 1.0;
        }
        else if("thS".equals(getTrinhDo()))
        {
            return 1.2;
        }
        else if("TS".equals(getTrinhDo()))
        {
            return 1.5;
        }
        else if("PGS".equals(getTrinhDo()))
        {
            return 1.8;
        }
        else return 2.0;
    }
    @Override
    public double tinhLuong()
    {
        return getMucLuong() * getSoTietGD() *trinhDoGV();
    }
    @Override
    public void nhap()
    {
        super.nhap();
        System.out.print("Nhập số tiết giảng dạy: ");
        soTietGD = Scan.scanner.nextInt();
        System.out.print("Nhập trình độ: ");
        trinhDo = Scan.scanner.next();
    }
    @Override
    public void xuat()
    {
        super.xuat();
        System.out.println("Số tiết giảng dạy: "+getSoTietGD());
        System.out.println("Trình độ: "+getTrinhDo());
    }
}
