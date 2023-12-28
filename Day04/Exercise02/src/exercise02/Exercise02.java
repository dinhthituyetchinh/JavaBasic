/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise02;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DSThiSinh dt = new DSThiSinh();
//        dt.NhapDS(2);
        dt.docFile("TS.xml");
        System.out.println("Danh sách thí sinh vừa nhập");
        dt.XuatDS();
    }
    
}
