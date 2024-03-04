/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_11;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class NgayThang {
    Scanner s = new Scanner(System.in);
    private int ngay, thang, nam;
    
    //Constructor
    public NgayThang()
    {
        this.ngay = 1;
        this.thang = 1;
        this.nam = 1;
    }
    public NgayThang(int ngay, int thang, int nam)
    {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    public NgayThang(NgayThang a)
    {
        this.ngay = a.ngay;
        this.thang = a.thang;
        this.nam = a.nam;
    }
    public boolean namNhuan()
    {
        if ((this.nam % 4 == 0 && this.nam % 100 != 0) || (this.nam % 400 == 0))
            return true; // return true là năm nhuận, return false không là năm nhuận
        else
            return false;
    }
    public void input()
    {
            do
      {
           System.out.print("Hay nhap vao mot ngay: ");
          ngay = s.nextInt();
          if (ngay <= 0 || ngay > 31)
          {
              System.out.println("Ngay ma ban nhap khong hop le, vui long kiem tra lai");
              System.out.println("So ngay ma ban nhap phai trong khoang tu 1 den 31");
          }
      }
      while(ngay <= 0 || ngay > 31);
      do
      {
           System.out.print("Hay nhap vao mot thang: ");
          thang = s.nextInt();
          if (thang <= 0 || thang > 12)
          {
              System.out.println("Thang ma ban nhap khong hop le, vui long kiem tra lai");
              System.out.println("So thang ma ban nhap phai trong khoang tu 1 den 12");
          }
      }
      while (thang <= 0 || thang > 12);
      do
      {
           System.out.print("Hay nhap vao mot nam: ");
          nam = s.nextInt();;
          if (nam <= 0)
          {
              System.out.println("Nam ma ban nhap khong hop le, vui long kiem tra lai");
              System.out.println("So nam ma ban nhap phai lon hon 0");
          }
      }
      while (nam <= 0);   
    }
    public int soNgayTrongThang()
    {
        switch (this.thang)
        {
            case 1: case 3:case 5:case 7:case 8:case 10:case 12:
                {
                    return 31;
                }
            case 2:
                {
                    if (namNhuan() == true)
                    {
                        return 29;
                    }
                    return 28;
                }
            case 4: case 6: case 9:case 11:
                {
                    return 30;
                }
        }
        return 0;//
    }
    public boolean hopLe()
    {
        if (this.ngay > 0 && this.thang > 0 && this.thang <= 12 && this.nam > 0 && this.thang <= soNgayTrongThang ())
            return true;
        else return false;
    }
    public void ngayTruocDo()
    {
        // ta cần khai báo các biến ny, nm, nd là các ngày tháng năm trước đó, tránh xung đột với các biến đã nhập vào
        int ny = this.nam; int nm = this.thang; int nd = this.ngay;
        if (hopLe() == true)
        {
           // nếu không rơi vào các trước hợp đặc biệt thì ngày trước đó bằng ngày nhập -1
                     nd = this.ngay - 1;
            //nếu tháng nhập vào != 1 và ngày nhập vào = 1 thì có các trường hợp xảy ra như sau:
            if (this.thang != 1 && this.ngay == 1)
            {
                //trường hơp 1: tháng nhập vào là 2,4,6,8,9,11 thì ngày trước đó sẽ là ngày 31 tháng trước đó
                if (this.thang == 2 || this.thang == 4 || this.thang == 6 || this.thang == 8 || this.thang == 9 || this.thang == 11)
                {
                    nd = 31;
                    nm = this.thang - 1;
                }
                else
                //trường hơp 2: tháng nhập vào là tháng 3 thì ngày trước đó là ngày 29 nếu năm nhuận và 28 nếu không nhuận
                if (this.thang == 3)
                {
                    if (namNhuan() == true)
                    {
                        nd = 29;
                        nm = this.thang - 1;
                    }
                    else
                    {
                        nd = 28;
                        nm = this.thang - 1;
                    }
                }
                else
                //trường hơp 3: tháng nhập vào là tháng 5,7,10,12 thì ngày trước đó sẽ là 30
                if (this.thang == 5 || this.thang == 7 || this.thang == 10 || this.thang == 12)
                {
                    nd = 30;
                    nm = this.thang - 1;
                }
            }
            //nếu tháng nhập vào là tháng 1 và ngày 1 thì ngày tháng năm trước đó sẽ là ngày 31 tháng 12 năm trước đó
            else if (this.thang == 1 && this.ngay == 1)
            {
                nd = 31;
                ny = this.nam - 1;
                nm = 12;
            }
        }
        System.out.println("Ngày trước đó : "+ nd+"-"+ nm+"-"+ ny);
    }
   public void ngaySauDo()
    {
        if(hopLe()== true)
        {
            if (this.ngay < soNgayTrongThang())
            {
                this.ngay++;
            }
            else
            {
                this.ngay = 1;
                if (this.thang < 12)
                {
                    this.thang++;
                }
                else
                {
                    this.thang = 1;
                    this.nam++;
                }
            }    
        }
        System.out.println("Ngày tiếp theo: "+ this.ngay+"-"+ this.thang+"-"+ this.nam);
    }
}
