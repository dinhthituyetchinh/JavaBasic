/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise01;

/**
 *
 * @author Tuyet Chinh
 */
public class NhanVienSX extends NhanVien
{
    public static float heSoPhuCapNangNhoc = 0.1f;
        private int soNgayNghi;
        public void setSoNgayNghi(int value)
        {
            soNgayNghi = value;
        }
        @Override
        public char xepLoai()
        {
            if (soNgayNghi <= 1)
                return 'A';
            else if (soNgayNghi <= 3)
                return 'B';
            else if (soNgayNghi <= 5)
                return 'C';
            else return 'D';
        }
        @Override
        public double tinhLuong()
        {
            return super.tinhLuong() * (1 + NhanVienSX.heSoPhuCapNangNhoc);
        }
}
