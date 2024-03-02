/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_7;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class NgayThang {
  private int num, year;
  Scanner s = new Scanner(System.in);
    public int getYear() {
        return year;
    }

    public void setYear(int value) {
        this.year = value;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int value)
    {
        this.num = value;
    }
    
    public void inputNum()
    {
            System.out.print("Nhập vào một số: ");
            num = s.nextInt();
    }
    
    public void soNgayTrongThang()
    {
        switch(num)
        {
            case 1, 3, 5, 7, 8, 10, 12 :
                System.out.println("Tháng "+num+" có 31 ngày");
                break;
            case 4, 6, 9, 11:
                System.out.println("Tháng "+num+" có 30 ngày");
                break; 
            case 2:
                    System.out.println("Nhập vào năm: ");
                    year = s.nextInt();
                if(testYear() == true)
                {
                    System.out.println("Tháng "+num+" có 29 ngày do năm nhuận");
                }
                else
                {
                    System.out.println("Tháng "+num+" có 28 ngày do năm không nhuận");

                }
                break;
            default:
                System.out.println("Tháng bạn nhập không hợp lệ");
                break;
        }
    }   
    
     public boolean testYear()
    {
        if((year % 400 == 0 || year % 4 == 0) && year % 100 != 0)
        {
            return true;
        }
        return false;
    }
}
