/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_34;

/**
 *
 * @author Tuyet Chinh
 */
public class QuanLyDanhBa {
    private String ten, phone;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public QuanLyDanhBa() {
    }

    public QuanLyDanhBa(String ten, String phone) {
        this.ten = ten;
        this.phone = phone;
    }
    
    public void nhapDanhBa()
    {
        System.out.println("Nhập tên: ");
        ten = Scan.scanner.next();
        System.out.println("Nhập số phone: ");
        phone = Scan.scanner.next();
    }
    
    public void xuatDanhBa()
    {
        System.out.println("Tên: "+ten);
        System.out.println("Số phone: "+phone);
    }
}
