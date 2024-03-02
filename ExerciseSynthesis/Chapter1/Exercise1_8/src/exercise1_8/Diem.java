/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_8;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class Diem {
    private double diemSo;
    Scanner s = new Scanner(System.in);
    public double getDiemSo() {
        return diemSo;
    }

    public void setDiemSo(double value) {
        this.diemSo = value;
    }
    
    public void inputNum()
    {
      do
      {
          System.out.print("Nhập vào điểm số: ");
            diemSo = s.nextDouble();
          if(diemSo < 0)
          {
              System.out.println("Điểm bạn vừa nhập không hợp lệ!");
          }
      }
      while(diemSo < 0);
    }
    
    public char diemChu()
    {
        if(diemSo>= 8.5)
        {
            return 'A';
        }
        else
        if(diemSo >= 7)
        {
            return 'B';
        }
        else if(diemSo > 5.5)
        {
            return 'C';
        }
        else if(diemSo > 4)
        {
            return 'D';
        }
        else
        {
            return 'F';
        }
    }
}
