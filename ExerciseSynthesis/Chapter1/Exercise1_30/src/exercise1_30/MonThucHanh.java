/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_30;

/**
 *
 * @author Tuyet Chinh
 */
public class MonThucHanh extends MonHoc
{
    private double kt1, kt2, kt3, kt4;

    public double getKt1() {
        return kt1;
    }

    public void setKt1(double kt1) {
        this.kt1 = kt1;
    }

    public double getKt2() {
        return kt2;
    }

    public void setKt2(double kt2) {
        this.kt2 = kt2;
    }

    public double getKt3() {
        return kt3;
    }

    public void setKt3(double kt3) {
        this.kt3 = kt3;
    }

    public double getKt4() {
        return kt4;
    }

    public void setKt4(double kt4) {
        this.kt4 = kt4;
    }
    public static int tienCSVC = 100000;
    public MonThucHanh(String maMH, String tenMH, int soTC, double lan1, double lan2, double lan3, double lan4) 
        {
            super(maMH, tenMH, soTC);
            setKt1(lan1);
            setKt2(lan2);
            setKt3(lan3);
            setKt4(lan4);
        }
        @Override
        public double diemTB()
        {
            return (getKt1() + getKt2() + getKt3() + getKt4()) / 4;
        }
        @Override
        public double hocPhi()
        {
            return 350000 * getSoTC() + MonThucHanh.tienCSVC;
        }
        @Override
        public void xuat()
        {
            super.xuat();
            System.out.println("Điểm kiểm tra lần 1: "+getKt1());
            System.out.println("Điểm kiểm tra lần 2: " + getKt2());
            System.out.println("Điểm kiểm tra lần 3: " + getKt3());
            System.out.println("Điểm kiểm tra lần 4: " + getKt4());

        }
}
