/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise2_9;

/**
 *
 * @author Tuyet Chinh
 */
public class Department {
    String depCode, depName;

    public String getDepCode() {
        return depCode;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    
    public Department(String depCode, String depName) {
        this.depCode = depCode;
        this.depName = depName;
    }
    
    public String toString()
    {
        return depCode+"-"+depName;
    }
}
