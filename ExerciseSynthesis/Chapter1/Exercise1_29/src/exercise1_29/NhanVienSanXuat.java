/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_29;

/**
 *
 * @author Tuyet Chinh
 */
public class NhanVienSanXuat extends Employee
{
    private int soSP;

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) {
        this.soSP = soSP;
    }
    
    public NhanVienSanXuat(String fullName, int yearOfEmployment, int soSP) {
        super(fullName, yearOfEmployment);
        this.soSP = soSP;
    }
    
    @Override
    public double salary()
    {
        return Employee.basicSalary + getSoSP() * 2000;
    }
    
    @Override
    public void ouput()
    {
        super.ouput();
        System.out.println("Số sản phẩm: "+getSoSP());
    }
}
