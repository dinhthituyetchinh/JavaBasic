/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_28;

/**
 *
 * @author Tuyet Chinh
 */
public class Diem {
    protected int x, y;

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void input()
    {
        System.out.print("Nhập toạ độ điểm x: ");
        x = Scan.scanner.nextInt();
        System.out.print("Nhập toạ độ điểm y: ");
        y = Scan.scanner.nextInt();
    }
    
    public void hienThi() {
        System.out.println("Tọa độ: (" + x + ", " + y + ")");
    }
    public void diChuyen(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
