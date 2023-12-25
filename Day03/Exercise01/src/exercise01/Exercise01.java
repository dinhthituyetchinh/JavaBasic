/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise01;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Số phức thứ nhất");
        SoPhuc x = new SoPhuc(2.3f, 4.0f);
        x.Xuat();
         System.out.println("Số phức thứ hai");
        SoPhuc y = new SoPhuc(3.5f, 8.8f);
     
        y.Xuat();
        SoPhuc t = x.cong2SP(y);
        System.out.println("\nTổng hai số phức: ");
        t.Xuat();
    }
    
}
