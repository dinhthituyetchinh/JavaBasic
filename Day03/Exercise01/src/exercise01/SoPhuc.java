/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise01;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class SoPhuc
{
    private float a, b;
    
    public SoPhuc()
    {
        a = b = 1;
    }
    
    public SoPhuc(float a, float b)
    {
        this.a = a;
        this.b = b;
    }
    
    public SoPhuc(SoPhuc z)
    {
        this.a = z.a;
        this.b = z.b;
    }
    
    public void Nhap()
    {
        try(Scanner f = new Scanner(System.in))
        {
            System.out.print("Nhập phần thực: ");
            a = f.nextFloat();
            System.out.print("Nhập phần ảo: ");
            b = f.nextFloat();
            
        }  
    }
    
    public void Xuat()
    {
        System.out.format("z = %.2f + %.2f\n", a, b);
    }
    
    public SoPhuc cong2SP(SoPhuc x)
    {
       SoPhuc tong = new SoPhuc();
       tong.a = a + x.a;
       tong.b = b + x.b;
       return tong;
    }
    public boolean soSanhBang(SoPhuc x)
    {
        return a == x.a && b == x.b;
    }
    
   
}
