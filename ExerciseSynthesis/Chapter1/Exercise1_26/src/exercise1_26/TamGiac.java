/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_26;

/**
 *
 * @author Tuyet Chinh
 */
public class TamGiac {
   private int A, B, C;

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public int getC() {
        return C;
    }

    public void setC(int C) {
        this.C = C;
    }

    public TamGiac() {
    }

    
    public TamGiac(int A, int B, int C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    
    public TamGiac(TamGiac tg)
    {
        this.A = tg.A;
        this.B = tg.B ;
        this.C = tg.C;
    }
    
    public void nhap()
    {
        System.out.println("Nhập đỉnh thứ nhất: ");
        A = Scan.scanner.nextInt();
        System.out.println("Nhập đỉnh thứ hai: ");
        B = Scan.scanner.nextInt();
        System.out.println("Nhập đỉnh thứ ba: ");
        C = Scan.scanner.nextInt();
    }
    public void xuat()
    {
        System.out.println("Ba đỉnh A,");
    }
}
