/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_33;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
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
    
    public void docFileTXT(String fileName) throws URISyntaxException, IOException 
    {

        Files.lines(Paths.get(ClassLoader.getSystemResource(fileName).toURI())).forEach(s -> { 
            String[] parts = s.split(", ");
            if (parts.length >= 3)// Kiểm tra xem có đủ thông tin cần thiết không
            { 
                // Lấy thông tin từ các phần được tách ra
                String id = parts[0];
                String name = parts[1];
                int yearOfBirth = Integer.parseInt(parts[2]);

                // Tạo đối tượng KhachHang và thêm vào danh sách
                KhachHang kh = new KhachHang(id, name, yearOfBirth);
                CustomerList.add(kh);
            }

        });
    }
    
    public void writeCustomerListToFile(String fileName) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (KhachHang kh : CustomerList) {
                String line = kh.getMaSo()+ ", " + kh.getHoTen()+ ", " + kh.getNamSinh();
                writer.write(line);
                writer.newLine(); // Thêm dòng mới sau mỗi dòng ghi
            }
            System.out.println("File được ghi thành công!");
        }
    }
}

