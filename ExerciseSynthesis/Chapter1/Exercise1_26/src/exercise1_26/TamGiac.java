/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_26;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class TamGiac {
   private Point A, B, C;

   public TamGiac() {
        A = new Point();
        B = new Point();
        C = new Point();
    }

   public TamGiac(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public TamGiac(TamGiac tg) {
        this.A = tg.A;
        this.B = tg.B;
        this.C = tg.C;
    }

    // Các phương thức get/set
    public Point getA() {
        return A;
    }

    public void setA(Point A) {
        this.A = A;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point B) {
        this.B = B;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point C) {
        this.C = C;
    }

    // Phương thức nhập
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tọa độ điểm A:");
        double xA = scanner.nextDouble();
        double yA = scanner.nextDouble();
        A = new Point(xA, yA);

        System.out.println("Nhập tọa độ điểm B:");
        double xB = scanner.nextDouble();
        double yB = scanner.nextDouble();
        B = new Point(xB, yB);

        System.out.println("Nhập tọa độ điểm C:");
        double xC = scanner.nextDouble();
        double yC = scanner.nextDouble();
        C = new Point(xC, yC);
    }

    // Phương thức xuất
    public void xuat() {
        System.out.println("Điểm A: (" + A.x + ", " + A.y + ")");
        System.out.println("Điểm B: (" + B.x + ", " + B.y + ")");
        System.out.println("Điểm C: (" + C.x + ", " + C.y + ")");
    }

    // Phương thức tính diện tích
    public double tinhDienTich() {
        return Math.abs((A.x * (B.y - C.y) + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2);
    }

    // Phương thức tính chu vi
    public double tinhChuVi() {
        double AB = Math.sqrt(Math.pow(B.x - A.x, 2) + Math.pow(B.y - A.y, 2));
        double BC = Math.sqrt(Math.pow(C.x - B.x, 2) + Math.pow(C.y - B.y, 2));
        double AC = Math.sqrt(Math.pow(C.x - A.x, 2) + Math.pow(C.y - A.y, 2));
        return AB + BC + AC;
    }
}
