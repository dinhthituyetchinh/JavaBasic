/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1_14;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise1_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SoNguyen dt = new SoNguyen();
        dt.inputNum();
        if(dt.checkNum() == true)
        {
            System.out.println("Số bạn vừa nhập là số nguyên tố");
        }
        else
        {
            System.out.println("Số bạn vừa nhập không là số nguyên tố");

        }
    }
    
}
