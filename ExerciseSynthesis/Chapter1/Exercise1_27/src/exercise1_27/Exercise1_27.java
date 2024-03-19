/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise1_27;

import java.util.ArrayList;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise1_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Tạo mảng điểm
        Diem[] dinhArray = {new Diem(0, 0), new Diem(3, 0), new Diem(3, 4), new Diem(0, 4)};
        
        // Tạo một thể hiện của DaGiac bằng mảng điểm
        DaGiac daGiacTuMang = new DaGiac(dinhArray);
        
        // Xuất các đỉnh của đa giác
        System.out.println("Các đỉnh của đa giác (sử dụng mảng):");
        daGiacTuMang.xuatDinh();
        
        // Tính chu vi của đa giác
        System.out.println("Chu vi của đa giác (sử dụng mảng): " + daGiacTuMang.tinhChuVi());
        
        // Tìm đỉnh xa gốc tọa độ nhất
        System.out.println("Đỉnh xa gốc tọa độ nhất (sử dụng mảng): " + daGiacTuMang.timDinhXaNhat());
        
        // Tạo một ArrayList điểm
        ArrayList<Diem> danhSachDinh = new ArrayList<>();
        danhSachDinh.add(new Diem(0, 0));
        danhSachDinh.add(new Diem(3, 0));
        danhSachDinh.add(new Diem(3, 4));
        danhSachDinh.add(new Diem(0, 4));
        
        // Tạo một thể hiện của DaGiac bằng ArrayList điểm
        DaGiac daGiacTuArrayList = new DaGiac();
        daGiacTuArrayList.setDanhSachDinh(danhSachDinh);
        
        // Xuất các đỉnh của đa giác
        System.out.println("\nCác đỉnh của đa giác (sử dụng ArrayList):");
        daGiacTuArrayList.xuatDinh();
        
        // Tính chu vi của đa giác
        System.out.println("Chu vi của đa giác (sử dụng ArrayList): " + daGiacTuArrayList.tinhChuVi());
        
        // Tìm đỉnh xa gốc tọa độ nhất
        System.out.println("Đỉnh xa gốc tọa độ nhất (sử dụng ArrayList): " + daGiacTuArrayList.timDinhXaNhat());
    }
    
}
