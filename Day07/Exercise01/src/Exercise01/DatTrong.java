/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise01;

/**
 *
 * @author Tuyet Chinh
 */
public class DatTrong extends BatDongSan
{
    public DatTrong()
        {
            super();
        }
        public DatTrong(String ma, float d, float r)
        {
            super(ma, d, r);
        }
        @Override
        public double giaTri()
        {
            return dienTich() * 10000;
        }
}
