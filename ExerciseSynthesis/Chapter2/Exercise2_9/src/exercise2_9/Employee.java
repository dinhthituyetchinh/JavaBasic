/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise2_9;

/**
 *
 * @author Tuyet Chinh
 */
public class Employee {
  String empCode, empName;
    int Salary;

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

    public Employee(String empCode, String empName, int Salary) {
        this.empCode = empCode;
        this.empName = empName;
        this.Salary = Salary;
    }
    
    public String toString()
    {
        return empCode +"-"+empName;
    }
}
