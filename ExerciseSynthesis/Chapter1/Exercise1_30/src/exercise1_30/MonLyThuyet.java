/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_30;

/**
 *
 * @author Tuyet Chinh
 */
public class MonLyThuyet extends MonHoc
{
    private double diemTL, diemGK, diemCK;

    public double getDiemTL() {
        return diemTL;
    }

    public void setDiemTL(double diemTL) {
        this.diemTL = diemTL;
    }

    public double getDiemGK() {
        return diemGK;
    }

    public void setDiemGK(double diemGK) {
        this.diemGK = diemGK;
    }

    public double getDiemCK() {
        return diemCK;
    }

    public void setDiemCK(double diemCK) {
        this.diemCK = diemCK;
    }
        
        public MonLyThuyet(String maMH, String tenMH, int soTC, double diemTL, double diemGK, double diemCK) 
        {
            super(maMH, tenMH, soTC);
            setDiemTL(diemTL);
            setDiemGK (diemGK);
            setDiemCK(diemCK);

        }
        @Override
        public double diemTB()
        {
           return getDiemTL() * 0.2 + getDiemGK() * 0.3 + getDiemCK() * 0.5;
        }
        
        @Override
        public double hocPhi()
        {
            return 250000 * getSoTC();
        }
        @Override
        public void xuat()
        {
            super.xuat();
            System.out.println("Điểm tiểu luận: "+getDiemTL());
            System.out.println("Điểm giữa kì: " + getDiemGK());
            System.out.println("Điểm cuối kì: "+getDiemCK());
        }
          
}
    