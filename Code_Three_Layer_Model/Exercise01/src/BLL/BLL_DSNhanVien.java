/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.DanhSachNhanVien;

/**
 *
 * @author Tuyet Chinh
 */
public class BLL_DSNhanVien
{
    DanhSachNhanVien ds = new DanhSachNhanVien();

    public BLL_DSNhanVien()
    {
    }
    
    public void loadDS()
    {
        ds.fakeData();
        ds.xuatDS();
    }
}
