/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1_17;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise1_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SoNguyen dt = new SoNguyen();
        dt.inputNum();
        System.out.println("Tổng các chữ số chẵn trong số vừa nhập: "+dt.totalTheNumberOfEvenDigits());
        
    }
    
}
