/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_30;

/**
 *
 * @author Tuyet Chinh
 */
public class MonDoAn extends MonHoc
{
    private double diemGVHD, diemGVPB;

    public double getDiemGVHD() {
        return diemGVHD;
    }

    public void setDiemGVHD(double diemGVHD) {
        this.diemGVHD = diemGVHD;
    }

    public double getDiemGVPB() {
        return diemGVPB;
    }

    public void setDiemGVPB(double diemGVPB) {
        this.diemGVPB = diemGVPB;
    }
    
    public MonDoAn(String maMH, String tenMH, int soTC, double dGVHD, double dGVPB) 
    {
        super(maMH, tenMH, soTC);
        setDiemGVHD(dGVHD);
        setDiemGVPB(dGVPB);

    }
    @Override
    public double diemTB()
    {
        return (getDiemGVHD() * 2 + getDiemGVPB()) / 3;
    }
    @Override
    public double hocPhi()
    {
        return 2000000;
    }
     @Override
    public void xuat()
    {
        super.xuat();
        System.out.println("Điểm GVHD: "+getDiemGVHD());
        System.out.println("Điểm GVPB: "+getDiemGVPB());
    }
}
