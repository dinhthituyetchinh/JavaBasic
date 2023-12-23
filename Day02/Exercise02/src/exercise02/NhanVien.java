/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise02;

/**
 *
 * @author Tuyet Chinh
 */
public class NhanVien {
    private String ms, ht;
    public String getMs()
    {
        return ms;
    }
    public void setMs(String value)
    {
        this.ms = value;
    }
    public String getHt()
    {
        return ht;
    }
    public void setHt(String value)
    {
        this.ht = value;
    }
    private int nc;
    public int getNc()
    {
        return nc;
    }
    public void setNc(int value)
    {
        if(value < 0)
        {
            System.out.println("Dữ liệu sai");
            nc = 0;
        }
        else
        {
          this.nc = value;  
        }
    }
    public char getXL()
    {
        if(nc > 26)
        {
            return 'A';
        }
        else if(nc >= 22)
        {
            return 'B';
        }
        else
        {
            return 'C';
        }
    }
    public static int luong = 200000;
    
    public NhanVien()
    {
//        SetMs("1001");
//        SetHt(" ");
//        SetNc(0);
    }
    public NhanVien(String ma, String ten, int nc)
    {
        this.setMs(ma);
        this.setHt(ten);
        this.setNc(nc);
    }
    public NhanVien(NhanVien a)
    {
        
        
    }
}
