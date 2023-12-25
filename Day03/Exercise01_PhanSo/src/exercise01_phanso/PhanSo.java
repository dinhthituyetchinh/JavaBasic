/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise01_phanso;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class PhanSo 
{
    private int tuSo;
    private int mauSo;

    public int getTuSo()
    {
        return tuSo;
    }

    public void setTuSo(int value)
    {
        tuSo = value;
    }

    public int getMauSo()
    {
        return mauSo;
    }

    public void setMauSo(int value)
    {
        if (value == 0)
        {
            System.out.println("Dữ liệu bị lỗi");
        } 
        else
        {
            mauSo = value;
        }
    }
    
    public PhanSo()
    {
        this.tuSo = 0;
        this.mauSo = 1;
    }
    
    public PhanSo(int tu, int mau)
    {
        this.tuSo = tu;
        this.mauSo = mau;
    }
    
    public PhanSo(PhanSo ps)
    {
        this.tuSo = ps.tuSo;
        this.mauSo = ps.mauSo;
    }
        public int gcd(int a, int b)
        {
            int tmp;
            while (b != 0)
            {
                tmp = a % b;
                a = b;
                b = tmp;
            }
            return a;
        }
        public void rutGon()
        {
            int uc = gcd(tuSo, mauSo);
            this.tuSo  = this.tuSo / uc;
            this.mauSo = this.mauSo / uc;
            System.out.format(" %d / %d\n", this.tuSo , this.mauSo);
        }
        public PhanSo rutGon(PhanSo x)
        {
            int uc = gcd(tuSo, mauSo);
            x.tuSo = this.tuSo / uc;
            x.mauSo = this.mauSo / uc;
            return x;
        }
        public void input()
        {
            try (Scanner s = new Scanner (System.in))
            {
                System.out.print("Nhập tử số: ");
                tuSo = s.nextInt();
                System.out.print("Nhập mẫu số: ");
                mauSo = s.nextInt();
            }
        }
        public void output()
        {         
            System.out.format("Phân số là: %d / %d\n", tuSo, mauSo);
        }
}
