/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_24;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class Diem2D {
    Scanner scanner = new Scanner(System.in);
    private int x, y;
    public Diem2D()
    {
        
    }

    public Diem2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void nhapDiem()
    {
        System.out.println("Nhập toạ độ điểm x: ");
        x = scanner.nextInt();
        System.out.println("Nhập toạ độ điểm y: ");
        y = scanner.nextInt();
    }
    
    public void hienThi()
    {
        System.out.println("("+x+","+ y+")");    
    }
    
    public void doiDiem(int dx, int dy)
    {
       x += dx;
       y += dy;
       
        System.out.println("Toạ độ sau khi dời x: "+x);
        System.out.println("Toạ độ sau khi dời y: "+y);

    }
    
    public int giaTriX()
    {
        return x;
    }
    
    public int giaTriY()
    {
        return y;
    }
    
    public double khoangCachDenGocToaDo()
    {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    public double khoangCach(Diem2D d)
    {
        return Math.sqrt(Math.pow((d.x - x), 2) + Math.pow((d.y - y), 2));
    }
    
    public void toaDoDoiXung(Diem2D diem)
    {
        diem.x = -x;
        diem.y = -y;     
    }
}
