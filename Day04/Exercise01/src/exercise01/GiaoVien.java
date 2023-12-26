/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise01;

/**
 *
 * @author Tuyet Chinh
 */
public class GiaoVien
{
    private String tenGV;
    public String getTenGV()
    {
        return tenGV;
    }
    public void setTenGV(String value)
    {
        tenGV = value;
    }
    private int soNhom;
    public int getSNhom()
    {
        return soNhom;
    }
    public void setSNhom(int value)
    {
        soNhom = value;
    }
    public void Xuat()
    {
        System.out.format("%s \t %d\n", tenGV, soNhom);
    }
}
