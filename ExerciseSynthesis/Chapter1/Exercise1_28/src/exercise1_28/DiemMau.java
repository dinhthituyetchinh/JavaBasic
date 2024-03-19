/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_28;

/**
 *
 * @author Tuyet Chinh
 */
public class DiemMau extends Diem{
    private String mau;

    public DiemMau(int x, int y, String mau) {
        super(x, y);
        this.mau = mau;
    }

    public void ganMau(String mau) {
        this.mau = mau;
    }

    @Override
    public void hienThi() {
        System.out.println("Tọa độ: (" + x + ", " + y + "), Màu: " + mau);
    }
    
}
