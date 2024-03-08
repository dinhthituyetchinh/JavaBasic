/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_31;

/**
 *
 * @author Tuyet Chinh
 */
public class BietThu extends BatDongSan implements PhiKinhDoanh
{

     public BietThu()
    {

    }
    public BietThu(String ma, float d, float r)
    {
        super(ma,d, r);
    }
    @Override 
    public double giaTri()
    {
        return dienTich() * 400000 + phiKinhDoanh();
    }

    @Override
    public double phiKinhDoanh()
    {
        return dienTich() * 1000;
    }
    
}
