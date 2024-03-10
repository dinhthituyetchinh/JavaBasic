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
    
    public void output()
    {
        System.out.println("Toạ độ điểm x: "+x);       
        System.out.println("Toạ độ điểm y: "+y);
    }
}
