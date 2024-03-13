/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_26;


/**
 *
 * @author Tuyet Chinh
 */
public class Diem {
    private int x, y;
    
    public Diem()
    {
        
    }

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public void nhapDiem()
    {
        System.out.println("Nhập toạ độ điểm x: ");
        x = Scan.scanner.nextInt();
        System.out.println("Nhập toạ độ điểm y: ");
        y = Scan.scanner.nextInt();
    }
    
    public void hienThi()
    {
        System.out.println("("+x+","+ y+")");    
    }
}
