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
   private int x, y, z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public TamGiac()
    {
    }
    
    public TamGiac(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public TamGiac(TamGiac tg)
    {
        this.x = tg.x;
        this.y = tg.y;
        this.z = tg.z;
    }
   
    public void nhap()
    {
        System.out.println("Nhập toạ độ điểm x: ");
        x = Scan.scanner.nextInt();
        System.out.println("Nhập toạ độ điểm y: ");
        y = Scan.scanner.nextInt();
        System.out.println("Nhập toạ độ điểm z: ");
        z = Scan.scanner.nextInt();
    }
    
    public void xuat()
    {
        System.out.println("Toạ độ điểm x: "+x);
        System.out.println("Toạ độ điểm y: "+y);
        System.out.println("Toạ độ điểm z: "+z);

    }
    
//    public double tinhDienTich()
//    {
//        return 
//    }
}
