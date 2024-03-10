/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_29;

/**
 *
 * @author Tuyet Chinh
 */
public class NhanVienQuanLy extends Employee
{
   private double hsCV, thuong;

    public double getHsCV() {
        return hsCV;
    }

    public void setHsCV(double hsCV) {
        this.hsCV = hsCV;
    }

    public double getThuong() {
        return thuong;
    }

    public void setThuong(double thuong) {
        this.thuong = thuong;
    }

    public NhanVienQuanLy(String fullName, int yearOfEmployment, double hsCV, double thuong) {
        super(fullName, yearOfEmployment);
        this.hsCV = hsCV;
        this.thuong = thuong;
    }
   @Override
    public double salary()
    {
        return Employee.basicSalary * getHsCV() + getThuong();
    }
    
    @Override
    public void ouput()
    {
        super.ouput();
        System.out.println("Hệ số chức vụ: "+getHsCV());
        System.out.println("Thưởng: "+getThuong());
    }
}
