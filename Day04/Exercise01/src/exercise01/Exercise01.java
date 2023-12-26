/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise01;

import java.util.List;
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
        DSGiaoVien dsGiaoVien = new DSGiaoVien();
//        dsGiaoVien.docFile("D:\\Nam3_Ki2\\CN_JAVA\\JavaBasic\\Day04\\Exercise01\\src\\GV.xml");
        dsGiaoVien.docFile("GV.xml");
        dsGiaoVien.xuatDS(); 
        System.out.println("Sắp xếp theo tên");         
        dsGiaoVien.sapXepTheoTen();
        dsGiaoVien.xuatDS(); 
        System.out.println("Sắp xếp theo nhóm");
        dsGiaoVien.sapXepTheoNhom();
        dsGiaoVien.xuatDS(); 
        System.out.println("Lọc danh sách nhóm lớn hơn 1");
        List<GiaoVien> dsGiaoVienLoc = dsGiaoVien.locSoNhom();
        for(GiaoVien gv: dsGiaoVienLoc)
        {
            gv.Xuat();
        }
    }
    
}
