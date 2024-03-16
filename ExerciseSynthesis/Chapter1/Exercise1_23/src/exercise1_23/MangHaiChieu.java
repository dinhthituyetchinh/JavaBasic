/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_23;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class MangHaiChieu
{
    private int c;
    private static final int MAX_ROW = 50;
    private static final int MAX_COL = 100;
    private static final Scanner scanner = new Scanner(System.in);
    int dong = 0, cot = 0;
    int[][] a = new int[MAX_ROW][MAX_COL];
   // Scanner scanner = new Scanner(System.in);
    public void mainArr() 
    {
        do
        {           
             MENU();
            System.out.format("\nMoi ban nhap lua chon: ");
            c = scanner.nextInt();
            switch (c)
            {
            case 1 -> {
                int x;
                System.out.format(" 1. Khoi tao ma tran.\n");

                do
                {
                   menuCau1(); 
                    System.out.format("Moi ban lua chon cach tao ma tran: ");
                     x = scanner.nextInt();
                    switch (x)
                    {
                        case 1 -> {
                           nhapMaTran();
                            System.out.format("Tao mang thanh cong.\n");
                        }
                        case 2 -> {
                            sinhMaTran();
                            System.out.format("Tao mang thanh cong.\n");
                        }
                        default -> System.out.format("Ban nhap sai, hay chon 1 hoac 2 de thuc hien chuong trinh.\nVui long nha Enter de tiep tuc.\n");
                    }
                } while (x != 1 && x != 2);

            }
            case 2 -> {
                if (dong != 0 || cot != 0)
                {
                     System.out.format(" 2. Xuat mot ma tran chua n so nguyen.\n");
                    xuatMaTran();
                }
                else
                {
                    System.out.format("Ban chua tao ma tran. Vui long tao ma tran truoc khi thuc hien yeu cau.\n");
                    System.out.format("Hay nhan Enter de tiep tuc.\n");
                }
            }
            case 3 -> {
                    if (dong != 0 || cot != 0)
                    {
                        System.out.format(" 3. Tính tổng giá trị các số lẻ.\n");
                        xuatMaTran();
                        System.out.println("Tổng giá trị các số lẻ: "+tinhTongCacGiaTriLe());
                    } 
                    else
                    {
                        System.out.format("Ban chua tao ma tran. Vui long tao ma tran truoc khi thuc hien yeu cau.\n");
                        System.out.format("Hay nhan Enter de tiep tuc.\n");
                    }
            }
            case 4 -> {
                    if (dong != 0 || cot != 0)
                    {
                        System.out.format(" 4. Tính tổng các giá trị dương trên dòng k cho trước.\n");
                        xuatMaTran();
                        int k;
                        System.out.println("Nhập dòng k: ");
                        k = scanner.nextInt();
                        System.out.println("Tổng các giá trị dương trên "+k+" la: "+tinhTongCacGiaTriDuongTrenK(k));
                    }
                    else
                    {
                        System.out.format("Ban chua tao ma tran. Vui long tao ma tran truoc khi thuc hien yeu cau.\n");
                        System.out.format("Hay nhan Enter de tiep tuc.\n");
                    }
            }
            case 5 -> {
                    if (dong != 0 || cot != 0)
                    {
                        System.out.format(" 5. Đếm số lượng số dương.\n");
                        xuatMaTran();
                        System.out.println("Số lượng các số dương trong ma trận: "+ demSoDuong());
                    }
                    else
                    {
                        System.out.format("Ban chua tao ma tran. Vui long tao ma tran truoc khi thuc hien yeu cau.\n");
                        System.out.format("Hay nhan Enter de tiep tuc.\n");
                    }
            }
            case 6 -> {
                    if (dong != 0 || cot != 0)
                    {
                        System.out.format(" 6. Đếm số lượng số nguyên tố trên một dòng của ma trận.\n");
                        xuatMaTran();
                        demSoLuongSNTTungDong();

                    }
                    else
                    {
                        System.out.format("Ban chua tao ma tran. Vui long tao ma tran truoc khi thuc hien yeu cau.\n");
                        System.out.format("Hay nhan Enter de tiep tuc.\n");
                    }
            }
            case 7 -> {
                    if (dong != 0 || cot != 0)
                    {
                        System.out.format(" 7. Kiểm tra ma trận có tồn tại số âm hay không.\n");
                        xuatMaTran();
                        if(checkTonTaiSoAm() == true)
                        {
                            System.out.println("Ma trận có số âm.");
                        }
                        else
                        {
                            System.out.println("Ma trận không chứa số âm");
                        }
                        
                    }
                    else
                    {
                        System.out.format("Ban chua tao ma tran. Vui long tao ma tran truoc khi thuc hien yeu cau.\n");
                        System.out.format("Hay nhan Enter de tiep tuc.\n");
                    }
            }
            case 8 -> {
                if (dong != 0 || cot != 0)
                {
                    System.out.format(" 8. Kiểm tra các phần tử trên dòng k cho trước có tăng dần từ trái qua phải hay không.\n");
                    xuatMaTran();
                    int k;
                    System.out.println("Nhập dòng k: ");
                    k = scanner.nextInt();
                    if(checkTangDanTrenK(k) == true)
                    {
                        System.out.println("Các phần tử trên "+ k + " tăng dần từ trái qua phải");
                    }
                    else
                    {
                        System.out.println("Các phần tử trên "+ k + " không tăng dần từ trái qua phải");

                    }
                }
                else
                {
                    System.out.format("Ban chua tao ma tran. Vui long tao ma tran truoc khi thuc hien yeu cau.\n");
                    System.out.format("Hay nhan Enter de tiep tuc.\n");
                }
            }
            case 9 -> {
                if (dong != 0 || cot != 0)
                {
                    System.out.format(" 9. Liệt kê dòng có chứa số nguyên tố.\n");
                    xuatMaTran();
                    System.out.println("Các dòng chứa số nguyên tố:");
                    lietKeDongChuaSNT();

                }
                else
                {
                    System.out.format("Ban chua tao ma tran. Vui long tao ma tran truoc khi thuc hien yeu cau.\n");
                    System.out.format("Hay nhan Enter de tiep tuc.\n");
                }
            }
            case 10 -> {
                if (dong != 0 || cot != 0)
                {
                    System.out.format("10. Liệt kê dòng chứa toàn giá trị chẵn.\n");
                    xuatMaTran();
                    System.out.println("Các dòng chứa toàn giá trị chẵn:");
                    lietKeDongChuaToanGiaTriChan();
                }
                else
                {
                    System.out.format("Ban chua tao ma tran. Vui long tao ma tran truoc khi thuc hien yeu cau.\n");
                    System.out.format("Hay nhan Enter de tiep tuc.\n");
                }
            }
            case 0 -> System.out.format("Ban da chon thoat chuong trinh.\n");
            default -> {
                System.out.format("So ban nhap khong co trong chuong trinh!\nVui long nhap lai!!!\n(So ban nhap phai trong khoang tu 1 den 9)\n");
                System.out.format("Vui long nhan Enter de tiep tuc.\n");
            }
                }
        } while (c != 0);
    }

    public void MENU()
    {
        System.out.format("\n================================ = MENU = =================================\n");
        System.out.format("\t\tHay chon chuong trinh ma ban can thuc hien:\n");
        System.out.format(" 1. Tao mot ma tran chua n so nguyen.\n");
        System.out.format(" 2. Xuat mot ma tran chua n so nguyen.\n");
        System.out.format(" 3. Tính tổng giá trị các số lẻ.\n");
        System.out.format(" 4. Tính tổng các giá trị dương trên dòng k cho trước.\n");
        System.out.format(" 5. Đếm số lượng số dương.\n");
        System.out.format(" 6. Đếm số lượng số nguyên tố trên một dòng của ma trận.\n");
        System.out.format(" 7. Kiểm tra ma trận có tồn tại số âm hay không.\n");
        System.out.format(" 8. Kiểm tra các phần tử trên dòng k cho trước có tăng dần từ trái qua phải hay không.\n");
        System.out.format(" 9. Liệt kê dòng có chứa số nguyên tố.\n");
        System.out.format("10. Liệt kê dòng chứa toàn giá trị chẵn.\n");
        System.out.format("Neu ban muon thoat chuong trinh hay nhap so 0.\n");
        System.out.format("==========================================================================\n");
    }
    //Menu cau 1
    private void menuCau1()
    {
        System.out.format("========================= = MENU cau 1 = =========================\n");
        System.out.format("Nhap 1 neu ban muon nhap gia tri cho cac phan tu mang.\n");
        System.out.format("Nhap 2 neu ban muon sinh so ngau nhien cho cac phan tu mang.\n");
        System.out.format("==================================================================\n");
    }
    
    public void nhapMaTran()
{
	do
	{
		System.out.format("Moi ban nhap so dong: ");
		dong = scanner.nextInt();
		if (dong <= 0 || dong > MAX_ROW)
		{
			System.out.format("Ban da nhap sai so dong. Vui long nhap lai!!!\n");
		}
	} while (dong <= 0 || dong > MAX_ROW);
	do
	{
		System.out.format("Moi ban nhap so cot: ");
		cot = scanner.nextInt();
		if (cot <= 0 || cot > MAX_COL)
		{
			System.out.format("Ban da nhap sai so cot. Vui long nhap lai!!!\n");
			System.out.format("So cot ban nhap phai lon hon 0 va nho hon 100.\n");
		}
	} while (cot <= 0 || cot > MAX_COL);
	for (int i = 0; i < dong; i++)
		for (int j = 0; j < cot; j++)
		{
			System.out.format("Phan tu o dong va cot [%d][%d]: ", i, j);
			a[i][j] = scanner.nextInt();
		}
}
//Nhap ma tran bang cach sinh ngau nhien.
    public void sinhMaTran()
    {
            int i, j;
            do
            {
                System.out.format("Moi ban nhap so dong: ");
                dong = scanner.nextInt();
                if (dong <= 0 || dong > MAX_ROW)
                {
                        System.out.format("Ban da nhap sai so dong. Vui long nhap lai!!!\n");
                        System.out.format("So dong ban nhap phai lon hon 0 va nho hon 100.\n");
                }
            } while (dong <= 0 || dong > MAX_ROW);
            do
            {
                    System.out.format("Moi ban nhap so cot: ");
                    cot = scanner.nextInt();
                    if (cot <= 0 || cot >MAX_COL)
                    {
                            System.out.format("Ban da nhap sai so cot. Vui long nhap lai!!!\n");
                            System.out.format("So cot ban nhap phai lon hon 0 va nho hon 100.\n");
                    }
            } while (cot <= 0 || cot > MAX_COL);
            Random rand = new Random();
            for (i = 0; i < dong; i++)
                    for (j = 0; j < cot; j++)
                    {
                        a[i][j] = rand.nextInt(101) - 51;
                    }
    }
//Xuat ma tran
    public void xuatMaTran()
    {          
            System.out.format("Noi dung cua ma tran la:\n");
            for (int i = 0; i < dong; i++)
            {
                    for (int j = 0; j < cot; j++)
                    {
                            System.out.format("%d\t", a[i][j]);
                    }
                    System.out.format("\n");
            }
    }
//   Tinh tong cac gia tri le
    public int tinhTongCacGiaTriLe()
    {
        int total = 0;
        for (int i = 0; i < dong; i++)
        {
            for (int j = 0; j < cot; j++)
            {
                if(a[i][j] % 2 != 0)
                {
                    total += a[i][j];
                }
            }
        }
        return total;
    }
//    Tính tổng các giá trị dương trên dòng k cho trước
    // 2 3 -4 -5
    // 9 6 -3 8
    // 6 8 1 0
    // k = 1 => total = 23
    public int tinhTongCacGiaTriDuongTrenK(int k)
    {
        int total = 0;
        for (int i = 0; i < dong; i++)
        {
            for (int j = 0; j < cot; j++)
            {
                if(i == k)
                {
                    if(a[k][j] > 0)
                    {
                        total += a[k][j];
                    } 
                }
               
            }
        }
        return total;
    }
 //Đếm số lượng số dương
    public int demSoDuong()
    {
        int count = 0;
        for (int i = 0; i < dong; i++)
        {
            for (int j = 0; j < cot; j++)
            {
                if(a[i][j] > 0)
                {
                    count ++;
                }
            }
        }
        return count;
    }
    //Đếm số lượng số nguyên tố trên một dòng của ma trận.
    public boolean checkSNT(int x)
    {
        if(x < 2)
        {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
        if (x % i == 0) {
            return false;
        }
    }
        return true;
    }
    
    public void demSoLuongSNTTungDong()
    {
        int count = 0;
        for (int i = 0; i < dong; i++)
        {
            for (int j = 0; j < cot; j++)
            {
                if(checkSNT(a[i][j]) == true)
                {
                    count ++;
                }
            }
            System.out.print("\nDòng "+i+ " có "+ count+" số nguyên tố\n");

        }       
    }

    // Kiểm tra ma trận có tồn tại số âm hay không
    public boolean checkTonTaiSoAm()
    {
        for (int i = 0; i < dong; i++)
        {
            for (int j = 0; j < cot; j++)
            {
                if(a[i][j] < 0)
                {
                   return true; 
                }
            }
        }
        return false;
    }
    
   //  Kiểm tra các phần tử trên dòng k cho trước có tăng dần từ trái qua phải hay không
    
     public boolean  checkTangDanTrenK(int k)
    {
        for (int i = 0; i < dong; i++)
        {
            for (int j = 0; j < cot; j++)
            {
                if(i == k)
                {
                    if(a[k][j] > a[k][j + 1])
                    {
                       return false;
                    }
                }
               
            }
        }
        return true;
    }
    // Liệt kê dòng có chứa số nguyên tố
    public void lietKeDongChuaSNT()
    {
        int flag = 0;
        for (int i = 0; i < dong; i++)
        {
            for (int j = 0; j < cot; j++)
            {
                if(checkSNT(a[i][j]) == true)
                {
                    flag = 1;
                    break;
                }
            }
            if(flag == 1)
            {
                System.out.print("\nDòng "+i+ " chứa số nguyên tố\n");
            }
        }

    }
    // Liệt kê dòng chứa toàn giá trị chẵn
    private boolean checkSoChan(int num)
    {
        if(num % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void lietKeDongChuaToanGiaTriChan()
    {
        int flag = 1;
        for (int i = 0; i < dong; i++)
        {
            for (int j = 0; j < cot; j++)
            {
                if(checkSoChan(a[i][j]) == false)
                {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
            {
                System.out.print("\nDòng "+i+ " chứa toan gia tri chan\n");
            } 
        }       
    }
}