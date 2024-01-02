/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import DTO.CanBoQuanLy;
import DTO.NhanVien;
import DTO.NhanVienKD;
import DTO.NhanVienSX;
import DTO.NhanVienVinReal;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Tuyet Chinh
 */
public class DanhSachNhanVien
{
    // Tạo ArrayList nhân viên
        ArrayList<NhanVien> nhanViensList = new ArrayList<>();

        public void fakeData()
        {
        NhanVienSX nhanVienSX = new NhanVienSX(3, "VG001", "An", "Nam", "DiaChi", "0123456789",
                LocalDateTime.of(1986, 1, 1, 0, 0), LocalDateTime.of(2015, 1, 1, 0, 0),
                LocalDateTime.of(2018, 1, 1, 0, 0), 2.0);
        nhanViensList.add(nhanVienSX);

        NhanVienKD nhanVienKD = new NhanVienKD(1000000, 1500000, "VG002", "Kinh Doanh", "Nu", "DiaChiKD",
                "0987654321", LocalDateTime.of(1990, 1, 1, 0, 0), LocalDateTime.of(2018, 1, 1, 0, 0),
                LocalDateTime.of(2019, 1, 1, 0, 0), 1.8);
        nhanViensList.add(nhanVienKD);

        CanBoQuanLy canBoQuanLy = new CanBoQuanLy("Giam Doc", 1.5, "VG003", "Quan Ly", "Nam", "DiaChiQL",
                "0123456789", LocalDateTime.of(1970, 1, 1, 0, 0), LocalDateTime.of(2010, 1, 1, 0, 0),
                LocalDateTime.of(2012, 1, 1, 0, 0), 2.5);
        nhanViensList.add(canBoQuanLy);

        NhanVienVinReal nhanVienVinReal = new NhanVienVinReal(30000, "VG004", "VinReal", "Nu",
                "DiaChiVR", "0123456789", LocalDateTime.of(1985, 1, 1, 0, 0),
                LocalDateTime.of(2017, 1, 1, 0, 0), LocalDateTime.of(2019, 1, 1, 0, 0));
        nhanViensList.add(nhanVienVinReal);
        }

    public void xuatDS()
    {
      for (NhanVien nv : nhanViensList)
        {
            nv.Xuat();
        }  
    }
        
}
