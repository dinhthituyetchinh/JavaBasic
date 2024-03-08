/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_31;

/**
 *
 * @author Tuyet Chinh
 */
public class NhaO extends BatDongSan {

    private int soLau;

    public int getSoLau() {
        return soLau;
    }

    public void setSoLau(int soLau) {
        this.soLau = soLau;
    }

    public NhaO() {
        super();
    }

    public NhaO(String ma, float d, float r, int soLau) {
        super(ma, d, r);
        this.soLau = soLau;
    }

    @Override
    public double giaTri() {
        return dienTich() * 10000 + soLau * 100000;
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Số lầu: " + soLau);
    }
}