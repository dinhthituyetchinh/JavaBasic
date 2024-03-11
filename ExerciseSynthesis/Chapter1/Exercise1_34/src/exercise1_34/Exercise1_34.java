/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1_34;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise1_34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DanhSachDanhBa dt = new DanhSachDanhBa();
        dt.docFile("DanhBa.xml");
        dt.xuatDS();
        dt.nhapDS(2);
        dt.xuatDS();
        dt.ghiFile("src/GhiDanhBa.xml");
    }
    
}
