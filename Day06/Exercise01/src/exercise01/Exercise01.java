/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise01;

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
        NhanVienSX nhanVienSX = new NhanVienSX();
        nhanVienSX.setMaNhanVien("NV001");
        nhanVienSX.setTenNhanVien ("NPNV");
        nhanVienSX.setNamSinh(2002);
        nhanVienSX.setGioiTinh ("Nam");
        nhanVienSX.setHeSoLuong ( 3.00f);
        nhanVienSX.setNamVaoLam ( 2018);
        nhanVienSX.setSoNgayNghi ( 1);
        System.out.println("Xếp loại nhân viên: "+ nhanVienSX.xepLoai());
        System.out.println("Lương nhân viên: "+ nhanVienSX.tinhLuong());
        NhanVienKD nhanVienKD = new NhanVienKD();
        nhanVienKD.setMaNhanVien("NV008");
        nhanVienKD.setTenNhanVien ("Nguyễn Văn An");
        nhanVienKD.setNamSinh ( 2001);
        nhanVienKD.setGioiTinh ( "Nam");
        nhanVienKD.setHeSoLuong ( 3.5f);
        nhanVienKD.setNamVaoLam ( 2020);
        nhanVienKD.setDoanhSoBanHangToiThieu ( 500000);
        nhanVienKD.setDoanhThu ( 1235000);
        System.out.println("Xếp loại nhân viên: "+ nhanVienKD.xepLoai());
        System.out.println("Lương nhân viên: "+ nhanVienKD.tinhLuong());
        CanBoQuanLy canBoQuanLy = new CanBoQuanLy();
        canBoQuanLy.setMaNhanVien ("NV020");
        canBoQuanLy.setTenNhanVien ("Nguyễn Phạm Ngọc Văn");
        canBoQuanLy.setNamSinh ( 2004);
        canBoQuanLy.setGioiTinh ( "Nam");
        canBoQuanLy.setHeSoLuong ( 5.0f);
        canBoQuanLy.setNamVaoLam ( 2022);
        canBoQuanLy.setChucVu ( "Giám đốc");
        canBoQuanLy.setHeSoChucVu ( 4.5f);
        System.out.println("Xếp loại nhân viên: "+ canBoQuanLy.xepLoai());
        System.out.println("Lương nhân viên: "+ canBoQuanLy.tinhLuong());
        DSNhanVien dt = new DSNhanVien();
        dt.themNV(nhanVienSX);
        dt.themNV(nhanVienKD);
        dt.themNV(canBoQuanLy);
        System.out.println("Tổng lương toàn bộ nhân viên là: "+dt.tinhTong());
        //Cách 2
        System.out.println("Tổng lương toàn bộ nhân viên là: " + dt.tinhTongLuong());
    }
    
}
