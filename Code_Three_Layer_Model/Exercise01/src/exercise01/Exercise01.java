/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise01;

import BLL.BLL_DSNhanVien;
import BLL.Common;

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
        BLL_DSNhanVien dt = new BLL_DSNhanVien();
        dt.loadDS();
    }
    
}
