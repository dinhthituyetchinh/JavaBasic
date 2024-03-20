/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise2_2;

/**
 *
 * @author Tuyet Chinh
 */
public class PhuongTrinhBacHai {
    private int a, b, c;

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

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public PhuongTrinhBacHai(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double tinhDelta()
    {
        return (Math.pow(b, 2) - 4 * a * c);
    }
    
    public double[] giaiPT()
    {

            if( tinhDelta() == 0)
            {
                double x = (double)-b / (2 * a);
                return new double[]{x, x};
            }
            else 
            {
                 double x1 = (double)(-b + Math.sqrt(tinhDelta())) / (2 * a);
                 double x2 = (double)(-b - Math.sqrt(tinhDelta())) / (2 * a);
                 return new double[] {x1, x2};
            }        
    }
}
