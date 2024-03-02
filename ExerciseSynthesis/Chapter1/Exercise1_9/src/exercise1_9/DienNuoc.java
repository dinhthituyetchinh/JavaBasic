/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_9;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class DienNuoc {
   private double chiSoCu, chiSoMoi;
    Scanner scanner = new Scanner(System.in);
    
    public void input()
    {
        System.out.print("Nhập vào chỉ số mới: ");
            chiSoMoi = scanner.nextDouble();
        do
        {
            System.out.print("Nhập vào chỉ số cũ: ");
            chiSoCu = scanner.nextDouble();
            if(chiSoCu > chiSoMoi)
            {
                System.out.println("Chỉ số cũ phải nhỏ hơn hoặc bằng chỉ số mới");
            }
        }
        while (chiSoCu > chiSoMoi);

        
    }
    public double tinhTienDien()
    {
        try
        {
            double soDien = chiSoMoi - chiSoCu;
            if( soDien <= 50)
            {
                return 1480 * soDien;
            }else if(soDien <= 100)
            {
                return 1480 * 50 + ((soDien - 50) * 1533);
            }
            else if(soDien <= 200)
            {
                return 1480 * 50 + 50 * 1533 + ((soDien - 100) * 1786);
            }
            else if(soDien <= 300)
            {
                return 1480 * 50 + 50 * 1533 + 100 * 1786+ ((soDien - 200) * 2242);
            }
            else
            {
                return 1480 * 50 +  50 * 1533 + 100 * 1786 +  100 * 2242+ ((soDien - 300) * 2503);
            }
        }
        catch (Exception e)
        {
            return 0;
        }
    }
}
