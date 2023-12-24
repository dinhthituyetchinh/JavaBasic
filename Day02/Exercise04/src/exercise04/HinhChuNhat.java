/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise04;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class HinhChuNhat {
    private int d, r;
    public int getChieuDai()
    {
        return d;
    }
     public int getChieuRong()
    {
        return r;
    }
    public void setChieuDai(int value)
    {
        if(value < 0)
            System.out.println("Dữ liệu bị lỗi");
        else
            d = value;
    }
    
    public void setChieuRong(int value)
    {
        if(value < 0)
            System.out.println("Dữ liệu bị lỗi");
        else
            r = value;
    }
    
    public HinhChuNhat()
    {
        this.d = 0;
        this.r = 0;
    }
    public HinhChuNhat(int dai, int rong)
    {
        this.d = dai;
        this.r = rong;
    }
    public int chuVi()
    {
        return (this.d + this.r) * 2;
    }
    public int dienTich()
    {
        return this.d * this.r;
    }
    //đường chéo bình phương = dài bình phương + rộng bình phương
    public double duongCheo()
    {
        return Math.sqrt(Math.pow(this.d, 2) + Math.pow(this.r, 2));
    }    
      
   public void Nhap()
   {
        try (Scanner scanner = new Scanner(System.in).useDelimiter("\n"))
        {
            System.out.print("Nhập chiều dài: ");
            this.d = scanner.nextInt();
            System.out.print("Nhập chiều rộng: ");
            this.r = scanner.nextInt();
        }
   }
    //   Đinh Thị Tuyết Chinh
   public void Xuat()
   {
       System.out.println("Chiều dài: " + this. d);
       System.out.println("Chiều rộng: " + this.r);
       System.out.println("Chu vi HCN: "+ this.chuVi());
       System.out.println("Diện tích HCN: "+ this.dienTich());
       System.out.format("Đường chéo HCN: %.2f\n", this.duongCheo());
   }
   
           //Phương thức thay đổi kích thước HCN
        //Kiểu 1: Kích thước HCN Tăng thêm chiều dài tx và chiều rộng ty do người dùng nhập
        public void changeSize(int tx, int ty, int kieu)
        {
            if (kieu == 1)
            {
                this.d = this.d + tx;
                this.r = this.r + ty;
            }
            else if (kieu == 0)
            {
                this.d = this.d - tx;
                this.r = this.r - ty;
            }
        }
        //Kiểu 2: Kích thước HCN cộng thêm kích thước HCN a (tức là từ kích thước ban đầu tăng thêm gấp đôi)
         public void changeSize1(HinhChuNhat a, int kieu)
         {
            if(kieu == 1)
            {
                a.d = this.d + a.d;
                a.r = this.r + a.r;
            }   
            else
            if(kieu==0)
            {
                a.d = this.d - a.d;
                a.r = this.r - a.r;
            }    
         }

}
