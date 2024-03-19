/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise2_1;

/**
 *
 * @author Tuyet Chinh
 */
public class PhuongTrinhBacNhat 
{
    private int a, b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public PhuongTrinhBacNhat() {
        this.a = 1;
        this.b = 0;
    }

    public PhuongTrinhBacNhat(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public double giaiPT()
    {
        return (double)- b/ a;
    }
}
