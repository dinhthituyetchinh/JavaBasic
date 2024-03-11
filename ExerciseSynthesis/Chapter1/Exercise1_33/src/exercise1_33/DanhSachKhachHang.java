/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_33;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tuyet Chinh
 */
public class DanhSachKhachHang {
    List<KhachHang> CustomerList = new ArrayList<KhachHang>();

    public DanhSachKhachHang() {
    }
    
    public void xuatDS()
    {
        for(KhachHang kh : CustomerList)
        {
            kh.xuatKH();
        }
    }
    public void nhapDS(int n)
    {
        for(int i = 0; i < n; i++)
        {
            KhachHang kh = new KhachHang();
            kh.nhapKH();
            CustomerList.add(kh);
        }
    }
    
    public void docFileTXT(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Tách dữ liệu trong mỗi dòng bằng dấu phẩy
                String[] parts = line.split(", ");
                if (parts.length >= 3) { // Kiểm tra xem có đủ thông tin cần thiết không
                    try {
                        // Lấy thông tin từ các phần được tách ra
                        String id = parts[0];
                        String name = parts[1];
                        int yearOfBirth = Integer.parseInt(parts[2]);

                        // Tạo đối tượng KhachHang và thêm vào danh sách
                        KhachHang kh = new KhachHang(id, name, yearOfBirth);
                        CustomerList.add(kh);
                    } catch (NumberFormatException e) {
                        // Xử lý khi không thể chuyển đổi năm sinh thành số nguyên
                        System.err.println("Lỗi đọc dòng: " + line);
                    }
                } else {
                    // Xử lý khi dữ liệu không đủ thông tin
                    System.err.println("Dữ liệu không đủ thông tin: " + line);
                }
            }
        } catch (IOException e) {
            // Xử lý lỗi khi đọc tệp
            System.err.println("Lỗi khi đọc tệp: " + e.getMessage());
        }

    }
}

