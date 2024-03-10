/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_29;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tuyet Chinh
 */
public class EmployeeList {
    List<Employee> empList = new ArrayList<Employee>();

    public EmployeeList() {
    }
    
    public void addEmpList(Employee emp)
    {
        empList.add(emp);
    }  
    
    public void outputEmpList()
    {
        for(Employee empl: empList)
        {
            empl.ouput();
        }
    }
    
    public double totalsalaryOfEmployeeList()
    {
        double tong = 0;
        for(Employee empl: empList)
        {
            tong += empl.salary();
        }
        return tong;
    }
    
    public double totalsalaryOfNVVP()
    {
        double tong = 0;
        for(Employee empl: empList)
        {
            if(empl instanceof NhanVienVanPhong)
            {
            tong += empl.salary();
            }
        }
        return tong;
    }
    
    public double totalsalaryOfNVSX()
    {
        double tong = 0;
        for(Employee empl: empList)
        {
            if(empl instanceof NhanVienSanXuat)
            {
            tong += empl.salary();
            }
        }
        return tong;
    }
    
    public double totalsalaryOfNVQL()
    {
        double tong = 0;
        for(Employee empl: empList)
        {
            if(empl instanceof NhanVienQuanLy)
            {
            tong += empl.salary();
            }
        }
        return tong;
    }
}
