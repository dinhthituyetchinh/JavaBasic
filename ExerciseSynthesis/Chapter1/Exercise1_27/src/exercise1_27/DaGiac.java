/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_27;

import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author Tuyet Chinh
 */
public class DaGiac {
    private Diem[] dinh;
    private ArrayList<Diem> danhSachDinh;

    // Constructor mặc định
    public DaGiac() {
        dinh = new Diem[0];
        danhSachDinh = new ArrayList<>();
    }

    // Constructor có tham số
    public DaGiac(Diem[] dinh) {
        this.dinh = dinh;
        danhSachDinh = new ArrayList<>(Arrays.asList(dinh));
    }

    // Constructor sao chép
    public DaGiac(DaGiac other) {
        this.dinh = other.dinh.clone();
        this.danhSachDinh = new ArrayList<>(other.danhSachDinh);
    }

    // Getter và setter
    public Diem[] getDinh() {
        return dinh;
    }

    public void setDinh(Diem[] dinh) {
        this.dinh = dinh;
        danhSachDinh = new ArrayList<>(Arrays.asList(dinh));
    }

    public ArrayList<Diem> getDanhSachDinh() {
        return danhSachDinh;
    }

    public void setDanhSachDinh(ArrayList<Diem> danhSachDinh) {
        this.danhSachDinh = danhSachDinh;
        dinh = danhSachDinh.toArray(new Diem[0]);
    }

    // Phương thức nhập đỉnh
    public void nhapDinh(Diem[] dinh) {
        setDinh(dinh);
    }

    // Phương thức xuất đỉnh
    public void xuatDinh() {
        System.out.println(Arrays.toString(dinh));
    }

    // Phương thức tính chu vi
    public double tinhChuVi() {
        double chuVi = 0;
        int soDinh = dinh.length;
        for (int i = 0; i < soDinh; i++) {
            Diem dinhHienTai = dinh[i];
            Diem dinhKeTiep = dinh[(i + 1) % soDinh];
            chuVi += Math.sqrt(Math.pow(dinhKeTiep.getX() - dinhHienTai.getX(), 2) +
                    Math.pow(dinhKeTiep.getY() - dinhHienTai.getY(), 2));
        }
        return chuVi;
    }

    // Phương thức tìm đỉnh xa gốc tọa độ nhất
    public Diem timDinhXaNhat() {
        Diem dinhXaNhat = null;
        double maxKhoangCach = 0;
        for (Diem dinh : dinh) {
            double khoangCach = Math.sqrt(Math.pow(dinh.getX(), 2) + Math.pow(dinh.getY(), 2));
            if (khoangCach > maxKhoangCach) {
                maxKhoangCach = khoangCach;
                dinhXaNhat = dinh;
            }
        }
        return dinhXaNhat;
    }
}
