/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class DanhSachPS {
    List<PhanSo> dsPS = new ArrayList<PhanSo>();
    int n;
    Scanner scanner = new Scanner(System.in);
    public DanhSachPS() {
    }
    
    public void nhapDSPS()
    {
        System.out.println("Nhập số lượng ps: ");
        n = scanner.nextInt();
        for(int i = 0; i < n; i++)
        {
            PhanSo ps = new PhanSo();
            ps.nhapPS();
            dsPS.add(ps);
        }
    }
    
    public void xuatDSPS()
    {
        for(PhanSo ps : dsPS)
        {
            ps.hienThiPS();
        }
    }
    
   public PhanSo tongDSPS()
   {
       PhanSo total = new PhanSo(0, 1);
        for(PhanSo ps : dsPS)
        {
            total = total.congPS(ps);
        }
       return total;
   }
    
    
   
}
