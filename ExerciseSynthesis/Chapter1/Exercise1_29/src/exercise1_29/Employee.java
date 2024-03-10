/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_29;

/**
 *
 * @author Tuyet Chinh
 */
public abstract class Employee
{
   protected String fullName;
   protected int yearOfEmployment;
   public static int basicSalary = 1490000;
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }

    public void setYearOfEmployment(int yearOfEmployment) {
        this.yearOfEmployment = yearOfEmployment;
    }

    public Employee() {
    }

    public Employee(String fullName, int yearOfEmployment) {
        this.fullName = fullName;
        this.yearOfEmployment = yearOfEmployment;
    }
   
   public abstract double salary();
   
   public void ouput()
   {
       System.out.println("Full name: "+ getFullName());
       System.out.println("Year of employment: "+getYearOfEmployment());
   }
}
