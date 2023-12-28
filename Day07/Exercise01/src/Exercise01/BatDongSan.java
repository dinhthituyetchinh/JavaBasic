/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise01;

/**
 *
 * @author Tuyet Chinh
 */
public abstract class BatDongSan 
{
    protected String maSo;
    protected float chieuDai;
    protected float chieuRong;

    public BatDongSan()
    {

    }

    public BatDongSan(String maSo, float chieuDai, float chieuRong)
    {
        this.maSo = maSo;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    protected String getMaSo()
    {
        return maSo;
    }

    protected void setMaSo(String maSo)
    {
        this.maSo = maSo;
    }

    protected float getChieuRong()
    {
        return chieuRong;
    }

    protected void setChieuRong(float chieuRong)
    {
        this.chieuRong = chieuRong;
    }

    protected float getChieuDai()
    {
        return chieuDai;
    }

    protected void setChieuDai(float chieuDai)
    {
        this.chieuDai = chieuDai;
    }

    public abstract double giaTri();

    public double dienTich()
    {
        return chieuDai * chieuRong;
    }

    public void xuat()
    {
        System.out.println("Mã bất động sản: " + maSo);
        System.out.println("Chiều dài bds: " + chieuDai);
        System.out.println("Chiều rộng bds: " + chieuRong);
        System.out.println("Diện tích bds: " + String.format("%.2f", dienTich()));
        System.out.println("Giá trị: " + String.format("%.2f", giaTri()));
    }
}
