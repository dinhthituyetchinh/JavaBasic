/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise01;

/**
 *
 * @author Tuyet Chinh
 */
public class KhachSan  extends BatDongSan implements PhiKinhDoanh
{
     private int soSao;

     public int getSoSao()
     {
         return soSao;
     }
     public void setSoSao(int value)
     {
         soSao = value;
     }
        public KhachSan()
        {
            super();
        }
        public KhachSan(String ma, float d, float r, int sao) 
        {
            super(ma, d, r);
            setSoSao(sao);
        }
        @Override
        public double giaTri()
        {
            return 100000 + soSao * 50000 + phiKinhDoanh();
        }
        @Override
        public double phiKinhDoanh()
        {
            return getChieuRong() * 5000;
        }
        @Override
        public void xuat()
        {
            super.xuat();
            System.out.println("Số sao: "+ soSao);
        }
}
