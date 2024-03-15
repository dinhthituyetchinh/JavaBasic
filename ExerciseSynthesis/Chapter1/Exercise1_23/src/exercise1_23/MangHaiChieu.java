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
                            System.out.format("Tao mang thanh cong.\n");
                        }
                        case 2 -> {
                            System.out.format("Tao mang thanh cong.\n");
                        }
                        default -> System.out.format("Ban nhap sai, hay chon 1 hoac 2 de thuc hien chuong trinh.\nVui long nha Enter de tiep tuc.\n");
                    }
                } while (x != 1 && x != 2);

            }
            case 2 -> {
                if (dong != 0 || cot != 0)
                {
                }
                else
                {
                    System.out.format("Ban chua tao ma tran. Vui long tao ma tran truoc khi thuc hien yeu cau.\n");
                    System.out.format("Hay nhan Enter de tiep tuc.\n");
                }
            }
            case 3 -> {
//                    if (dong != 0 || cot != 0)
//                    {
//                        System.out.format(" 3. Xuat cac phan tu o vi tri chan trong mang\n");
//                        xuatMang(a, n);
//                        System.out.format("\nCac phan tu o vi tri chan la:\n");
//                        xuatCacPhanTuOViTriChan(a, n);
//                        System.out.format("\n");
//                    }
//                    else
//                    {
//                        System.out.format("Ban chua tao ma tran. Vui long tao ma tran truoc khi thuc hien yeu cau.\n");
//                        System.out.format("Hay nhan Enter de tiep tuc.\n");
//                    }
            }
            case 4 -> {
//                    if (dong != 0 || cot != 0)
//                    {
//                        System.out.format(" 4. Dem phan tu duong trong mang.\n");
//                        xuatMang(a, n);
//                        System.out.format("\nSo phan tu duong trong mang: %d\n", demPTDuong(a, n));
//                    }
//                    else
//                    {
//                        System.out.format("Ban chua tao ma tran. Vui long tao ma tran truoc khi thuc hien yeu cau.\n");
//                        System.out.format("Hay nhan Enter de tiep tuc.\n");
//                    }
            }
            case 5 -> {
//                    if (dong != 0 || cot != 0)
//                    {
//                        System.out.format(" 5. Tong cac phan tu am trong mang\n");
//                        xuatMang(a, n);
//                        System.out.format("\nTong cac phan tu am trong mang: %d\n", tongCacPTAm(a, n));
//                    }
//                    else
//                    {
//                        System.out.format("Ban chua tao ma tran. Vui long tao ma tran truoc khi thuc hien yeu cau.\n");
//                        System.out.format("Hay nhan Enter de tiep tuc.\n");
//                    }
            }
            case 6 -> {
//                    if (dong != 0 || cot != 0)
//                    {
//                        System.out.format(" 6. Tim vi tri cua gia tri x trong mang.\n");
//                        xuatMang(a, n);
//                        int x;
//                        System.out.format("\nNhap gia tri ma ban muon tim: ");
//                        scanf_s("%d", &x);
//                        if (viTriCuaGiaTriX(a, n, x) == -1)
//                        {
//                            System.out.format("Phan tu khong ton tai trong mang.\n");
//                        }
//                        else
//                        {
//                            System.out.format("\nVi tri cua gia tri x trong mang: %d\n", viTriCuaGiaTriX(a, n, x));
//                        }

//                    }
//                    else
//                    {
//                        System.out.format("Ban chua tao ma tran. Vui long tao ma tran truoc khi thuc hien yeu cau.\n");
//                        System.out.format("Hay nhan Enter de tiep tuc.\n");
//                    }
            }
            case 7 -> {
//                    if (dong != 0 || cot != 0)
//                    {
//                        System.out.format(" 7. Tim phan tu lon nhat/ nho nhat trong mang.\n");
//                        xuatMang(a, n);
//                        System.out.format("\nPhan tu nho nhat trong mang: %d", elementMin(a, n));
//                        System.out.format("\nPhan tu lon nhat trong mang: %d\n", elementMax(a, n));
//                        
//                    }
//                    else
//                    {
//                        System.out.format("Ban chua tao ma tran. Vui long tao ma tran truoc khi thuc hien yeu cau.\n");
//                        System.out.format("Hay nhan Enter de tiep tuc.\n");
//                    }
            }
            case 8 -> {
                if (dong != 0 || cot != 0)
                {

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

    private void MENU()
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
  
}
