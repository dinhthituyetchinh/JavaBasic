/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_23;

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
    int n = 0;
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
                    System.out.format(" 1. Khoi tao mang mot chieu.\n");
                    
                    do
                    {
                       menuCau1(); 
                        System.out.format("Moi ban lua chon cach tao mang mot chieu: ");
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
//                    if (n != 0)
//                    {
                        System.out.format(" 2. Xuat mot mang mot chieu chua n so nguyen.\n");
//                    }
//                    else
//                    {
//                        System.out.format("Ban chua tao ma tran. Vui long tao ma tran truoc khi thuc hien yeu cau.\n");
//                        System.out.format("Hay nhan Enter de tiep tuc.\n");
//                    }
                }
                case 3 -> {
//                    if (n != 0)
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
//                    if (n != 0)
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
//                    if (n != 0)
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
//                    if (n != 0)
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
//                    if (n != 0)
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
                    if (n != 0)
                    {
                        
                    }
                    else
                    {
                        System.out.format("Ban chua tao ma tran. Vui long tao ma tran truoc khi thuc hien yeu cau.\n");
                        System.out.format("Hay nhan Enter de tiep tuc.\n");
                    }
                }
                case 9 -> {
                    if (n != 0)
                    {
                        
                    }
                    else
                    {
                        System.out.format("Ban chua tao ma tran. Vui long tao ma tran truoc khi thuc hien yeu cau.\n");
                        System.out.format("Hay nhan Enter de tiep tuc.\n");
                    }
                }
                case 10 -> {
                    if (n != 0)
                    {
                        
                    }
                    else
                    {
                        System.out.format("Ban chua tao ma tran. Vui long tao ma tran truoc khi thuc hien yeu cau.\n");
                        System.out.format("Hay nhan Enter de tiep tuc.\n");
                    }
                }
                case 11 -> {
                    if (n != 0)
                    {
                        
                    }
                    else
                    {
                        System.out.format("Ban chua tao ma tran. Vui long tao ma tran truoc khi thuc hien yeu cau.\n");
                        System.out.format("Hay nhan Enter de tiep tuc.\n");
                    }
                }
                case 12 -> {
                    if (n != 0)
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
        System.out.format(" 1. Tao mot mang mot chieu chua n so nguyen.\n");
        System.out.format(" 2. Xuat mot mang mot chieu chua n so nguyen.\n");
        System.out.format(" 3. .\n");
        System.out.format(" 4. .\n");
        System.out.format(" 5. \n");
        System.out.format(" 6. .\n");
        System.out.format(" 7. .\n");
        System.out.format(" 8. .\n");
        System.out.format("11. .\n");
        System.out.format("12. .\n");
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
  
}
