/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1_29;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise1_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NhanVienSanXuat nvsx = new NhanVienSanXuat("Trần Thị A", 2018, 25);
        NhanVienSanXuat nvsx2 = new NhanVienSanXuat("Nguyễn Văn Anh", 2018, 20);
        NhanVienSanXuat nvsx3 = new NhanVienSanXuat("Lê Ngọc Ánh", 2018, 25);

        NhanVienVanPhong nvvp = new NhanVienVanPhong("Nguyễn Văn B", 2017, 29, 234.567);
        NhanVienQuanLy nvql = new NhanVienQuanLy("Lê Thị C", 2014, 4.5, 500.000);
        
        EmployeeList dt = new EmployeeList();
        
        dt.addEmpList(nvsx);
        dt.addEmpList(nvsx2);
        dt.addEmpList(nvsx3);

        dt.addEmpList(nvvp);
        dt.addEmpList(nvql);
        
        System.out.println("Tổng lương toàn bộ nhân viên công ty là: " + String.format("%,.2f", dt.totalsalaryOfEmployeeList()));
        System.out.println("Tổng lương toàn bộ nhân viên sản xuất là: " + String.format("%,.2f", dt.totalsalaryOfNVSX()));
        System.out.println("Tổng lương toàn bộ nhân viên văn phòng là: " + String.format("%,.2f", dt.totalsalaryOfNVVP()));
        System.out.println("Tổng lương toàn bộ nhân viên quản lý là: " + String.format("%,.2f", dt.totalsalaryOfNVQL()));


    }
    
}
