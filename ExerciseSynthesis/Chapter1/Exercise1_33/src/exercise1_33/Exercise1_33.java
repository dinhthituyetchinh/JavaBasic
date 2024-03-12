/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1_33;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise1_33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws URISyntaxException, IOException {
        // TODO code application logic here
        DanhSachKhachHang dt = new DanhSachKhachHang();
        dt.docFileTXT("DanhSachKH.txt");
        dt.xuatDS();
        dt.nhapDS(1);
        dt.xuatDS();
        dt.writeCustomerListToFile("src/DSDuocGhi.txt");
    }
    
}
