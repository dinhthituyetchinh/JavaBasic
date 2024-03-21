/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise2_3;

/**
 *
 * @author Tuyet Chinh
 */
public class TinhToan
{
    private double a, b;

    public TinhToan(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public double cong()
    {
        return a + b;
    }
    public double tru()
    {
        return a - b;
    }
    public double nhan()
    {
        return a * b;
    }
    public double chia()
    {
        return a / b;
    }
}
