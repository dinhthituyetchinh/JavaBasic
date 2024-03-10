/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_29;

/**
 *
 * @author Tuyet Chinh
 */
public class NhanVienVanPhong extends Employee
{
    private int soNgayLV;
    private double troCap;

    public int getSoNgayLV() {
        return soNgayLV;
    }

    public void setSoNgayLV(int soNgayLV) {
        this.soNgayLV = soNgayLV;
    }

    public double getTroCap() {
        return troCap;
    }

    public void setTroCap(double troCap) {
        this.troCap = troCap;
    }

    public NhanVienVanPhong(String fullName, int yearOfEmployment, int soNgayLV, double troCap) {
        super(fullName,  yearOfEmployment);
        this.soNgayLV = soNgayLV;
        this.troCap = troCap;
    }

    @Override
    public double salary()
    {
        return Employee.basicSalary + getSoNgayLV() * 100000 + getTroCap();
    }
    
       @Override
    public void ouput()
    {
        super.ouput();
        System.out.println("Số ngày làm việc: "+getSoNgayLV());
        System.out.println("Trợ cấp: "+getTroCap());
    }
}
