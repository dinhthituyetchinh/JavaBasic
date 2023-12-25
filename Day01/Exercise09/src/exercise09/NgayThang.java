/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise09;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class NgayThang {
    private int ngay, thang, nam;

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int value) {
        if (value <= 0 || value > 31) {
            System.out.println("Dữ liệu bị lỗi");
        } else {
            ngay = value;
        }
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int value) {
        if (value <= 0 || value > 12) {
            System.out.println("Dữ liệu bị lỗi");
        } else {
            thang = value;
        }
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int value) {
        if (value <= 0) {
            System.out.println("Dữ liệu bị lỗi");
        } else {
            nam = value;
        }
    }

    // Constructor
    public NgayThang() {
        this.ngay = 1;
        this.thang = 1;
        this.nam = 1;
    }

    public NgayThang(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public NgayThang(NgayThang a) {
        this.ngay = a.ngay;
        this.thang = a.thang;
        this.nam = a.nam;
    }

    public boolean namNhuan() {
        return (this.nam % 4 == 0 && this.nam % 100 != 0) || (this.nam % 400 == 0);
    }

    public void input() {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Nhập ngày: ");
            this.ngay = s.nextInt();
            System.out.print("Nhập tháng: ");
            this.thang = s.nextInt();
            System.out.print("Nhập năm: ");
            this.nam = s.nextInt();
        }
    }

    public int soNgayTrongThang() {
        switch (this.thang) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return 31;
            }
            case 2 -> {
                if (namNhuan()) {
                    return 29;
                }
                return 28;
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }
        }
        return 0;
    }

    public boolean hopLe() {
        return this.ngay > 0 && this.thang > 0 && this.thang <= 12 && this.nam > 0 && this.thang <= soNgayTrongThang();
    }

    public void ngayTruocDo() {
        int ny = this.nam;
        int nm = this.thang;
        int nd = this.ngay;

        if (hopLe()) {
            nd = this.ngay - 1;

            if (this.thang != 1 && this.ngay == 1) {
                switch (this.thang) {
                    case 2:
                    case 4:
                    case 6:
                    case 8:
                    case 9:
                    case 11:
                        nd = 31;
                        nm = this.thang - 1;
                        break;
                    case 3:
                        if (namNhuan()) {
                            nd = 29;
                            nm = this.thang - 1;
                        } else {
                            nd = 28;
                            nm = this.thang - 1;
                        }
                        break;
                    case 5:
                    case 7:
                    case 10:
                    case 12:
                        nd = 30;
                        nm = this.thang - 1;
                        break;
                    default:
                        break;
                }
            } else if (this.thang == 1 && this.ngay == 1) {
                nd = 31;
                ny = this.nam - 1;
                nm = 12;
            }
        }

        System.out.format("Ngày trước đó : %d-%d-%d\n", nd, nm, ny);
    }

    public void ngaySauDo() {
        if (hopLe()) {
            if (this.ngay < soNgayTrongThang()) {
                this.ngay++;
            } else {
                this.ngay = 1;
                if (this.thang < 12) {
                    this.thang++;
                } else {
                    this.thang = 1;
                    this.nam++;
                }
            }
        }
        System.out.format("Ngày tiếp theo: %d-%d-%d\n", this.ngay, this.thang, this.nam);
    }
}