/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise1_22;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class MangMotChieu
{
    private int c;
    private static final int MAX_SIZE = 500;
    private static final Scanner scanner = new Scanner(System.in);
    int n = 0;
    int[] a = new int[MAX_SIZE];
    
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
                                nhapMang();
                                System.out.format("Tao mang thanh cong.\n");
                            }
                            case 2 -> {
                                taoMangNgauNhien();
                                System.out.format("Tao mang thanh cong.\n");
                            }
                            default -> System.out.format("Ban nhap sai, hay chon 1 hoac 2 de thuc hien chuong trinh.\nVui long nha Enter de tiep tuc.\n");
                        }
                    } while (x != 1 && x != 2);
                    
                }
                case 2 -> {
                    if (n != 0)
                    {
                        System.out.format(" 2. Xuat mot mang mot chieu chua n so nguyen.\n");
                        xuatMang();
                    }
                    else
                    {
                        System.out.format("Ban chua tao mang. Vui long tao mang truoc khi thuc hien yeu cau.\n");
                        System.out.format("Hay nhan Enter de tiep tuc.\n");
                    }
                }
                case 3 -> {
                    if (n != 0)
                    {
                        System.out.format(" 3. Liệt kê các giá trị âm có trong mảng.\n");
                        xuatMang();
                        System.out.format("\nCác phần tử có giá trị âm trong mảng:\n");
                        lietKeCacGiaTriAm();
                        System.out.format("\n");
                    }
                    else
                    {
                        System.out.format("Ban chua tao mang. Vui long tao mang truoc khi thuc hien yeu cau.\n");
                        System.out.format("Hay nhan Enter de tiep tuc.\n");
                    }
                }
                case 4 -> {
                    if (n != 0)
                    {
                        System.out.format(" 4. Liệt kê các số nguyên tố có trong mảng.\n");
                        xuatMang();
                        System.out.format("\nCác số nguyên tố trong mảng:\n");
                        lietKeCacSNT();
                    }
                    else
                    {
                        System.out.format("Ban chua tao mang. Vui long tao mang truoc khi thuc hien yeu cau.\n");
                        System.out.format("Hay nhan Enter de tiep tuc.\n");
                    }
                }
                case 5 -> {
                    if (n != 0)
                    {
                        System.out.format(" 5. Liệt kê các phần tử có giá trị nằm trong đoạn [a, b] cho trước.\n");
                        xuatMang();
                    }
                    else
                    {
                        System.out.format("Ban chua tao mang. Vui long tao mang truoc khi thuc hien yeu cau.\n");
                        System.out.format("Hay nhan Enter de tiep tuc.\n");
                    }
                }
                case 6 -> {
                    if (n != 0)
                    {
                    
                        
                    }
                    else
                    {
                        System.out.format("Ban chua tao mang. Vui long tao mang truoc khi thuc hien yeu cau.\n");
                        System.out.format("Hay nhan Enter de tiep tuc.\n");
                    }
                }
                case 7 -> {
                if (n != 0)
                {


                }
                else
                {
                    System.out.format("Ban chua tao mang. Vui long tao mang truoc khi thuc hien yeu cau.\n");
                    System.out.format("Hay nhan Enter de tiep tuc.\n");
                }
                }
                case 8 -> {
                    if (n != 0)
                    {
                        
                    }
                    else
                    {
                        System.out.format("Ban chua tao mang. Vui long tao mang truoc khi thuc hien yeu cau.\n");
                        System.out.format("Hay nhan Enter de tiep tuc.\n");
                    }
                }
                case 9 -> {
                    if (n != 0)
                    {
                        
                    }
                    else
                    {
                        System.out.format("Ban chua tao mang. Vui long tao mang truoc khi thuc hien yeu cau.\n");
                        System.out.format("Hay nhan Enter de tiep tuc.\n");
                    }
                }
                case 10 -> {
                    if (n != 0)
                    {
                        
                    }
                    else
                    {
                        System.out.format("Ban chua tao mang. Vui long tao mang truoc khi thuc hien yeu cau.\n");
                        System.out.format("Hay nhan Enter de tiep tuc.\n");
                    }
                }
                case 11 -> {
                    if (n != 0)
                    {
                        
                    }
                    else
                    {
                        System.out.format("Ban chua tao mang. Vui long tao mang truoc khi thuc hien yeu cau.\n");
                        System.out.format("Hay nhan Enter de tiep tuc.\n");
                    }
                }
                case 12 -> {
                    if (n != 0)
                    {
                        
                    }
                    else
                    {
                        System.out.format("Ban chua tao mang. Vui long tao mang truoc khi thuc hien yeu cau.\n");
                        System.out.format("Hay nhan Enter de tiep tuc.\n");
                    }
                }
                case 15 -> {
                    if (n != 0)
                    {
                        System.out.format("15. Đảo ngược mảng.\n");
                        xuatMang();
                        System.out.println("Mảng sau khi đảo ngược:");
                        daoNguocMang();
                        xuatMang();
                    }
                    else
                    {
                        System.out.format("Ban chua tao mang. Vui long tao mang truoc khi thuc hien yeu cau.\n");
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
        System.out.format(" 3. Liệt kê các giá trị âm có trong mảng.\n");
        System.out.format(" 4. Liệt kê các số nguyên tố có trong mảng.\n");
        System.out.format(" 5. Liệt kê các phần tử có giá trị nằm trong đoạn [a, b] cho trước.\n");
        System.out.format(" 6. Tính tổng giá trị các phần tử là số nguyên tố.\n");
        System.out.format(" 7. Tính trung bình cộng của các phần tử dương có trong mảng.\n");
        System.out.format(" 8. Đếm số phần tử có giá trị lớn hơn x cho trước.\n");
        System.out.format(" 9. Đếm số phần tử có giá trị là số nguyên tố trong mảng.\n");
        System.out.format("10. Kiểm tra mảng có phải là mảng chứa toàn số nguyên tố.\n");
        System.out.format("11. Kiểm tra mảng có phải là mảng tăng dần.\n");
        System.out.format("12. Tìm giá trị lớn nhất trong mảng.\n");
        System.out.format("13. Tìm giá trị nhỏ nhất trong mảng.\n");
        System.out.format("14. Tìm số âm lớn nhất trong mảng.\n");
        System.out.format("15. Đảo ngược mảng.\n");
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
    
    //Bai 1
    public void nhapMang()
    {
        do {
            System.out.format("Moi ban nhap vao so phan tu cua mang: ");
            n = scanner.nextInt();
            if (n <= 0 || n > MAX_SIZE) {
                System.out.format("So ban nhap khong hop le\nVui long nhap lai!\n");
                System.out.format("So phan tu cua mang ma ban nhap vao phai lon hon 0 (n > 0)\n");
            }
        } while (n <= 0 || n > MAX_SIZE);
        for (int i = 0; i < n; i++) {
            System.out.format("Phan tu cua mang [%d]: ", i);
            a[i] = scanner.nextInt();
        }
    }
    //Bai 2
    public void taoMangNgauNhien() {
        do {
            System.out.format("Moi ban nhap vao so phan tu cua mang: ");
            n = scanner.nextInt();
            if (n <= 0 || n > MAX_SIZE) {
                System.out.format("So ban nhap khong hop le\nVui long nhap lai!\n");
                System.out.format("So phan tu cua mang ma ban nhap vao phai lon hon 0 (n > 0)\n");
            }
        } while (n <= 0 || n > MAX_SIZE);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(101) - 51;
        }
    }
    //Bai 3
    public void xuatMang()
    {
        System.out.println("Noi dung cua mang la: ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i] + "\t");
        }
        System.out.print("\n");
    }
    //Bai 4
   public void lietKeCacGiaTriAm()
    {
            for (int i = 0; i < n; i++)
            {
                    if (a[i] < 0)
                    {
                        System.out.print(a[i] + "\t");
                    }
            }
    }
    //Bai 5
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
    
    public void lietKeCacSNT()
    {
        for (int i = 0; i < n; i++)
        {
                if (checkSNT(a[i]) == true)
                {
                    System.out.print(a[i] + "\t");
                }
        }
    }
    //Bai 6
    public void lietKeCacPTTrongDoanAB(int _a, int _b)
    {
        for (int i = 0; i < n; i++)
        {
            if (i >= _a && i <= _b)
            {
                System.out.print(a[i] + "\t");
            }
        }
    }
    //Bai 7
    public int tinhTongCacSNT()
    {
        int tong = 0;
        for (int i = 0; i < n; i++)
        {
                if (checkSNT(a[i]) == true)
                {
                    tong += a[i];
                }
        }
        return tong;
    }
    //Bai 8
    public double tinhTBCCacPTDuong()
    {
       int tbCacSoDuong =  demPTCoGiaTriLonHonX(0);
       int total = 0;
        for (int i = 0; i < n; i++)
        {
            if(a[i] > 0)
            {
                total += a[i];
            }
        }
        return total / tbCacSoDuong;
    }
    //Bai 9
    public int demPTCoGiaTriLonHonX(int x)
    {
        int count = 0;
        for (int i = 0; i < n; i++)
        {
                if (a[i] > x)
                {
                    count++;
                }
        }
        return count;
    }
    //Bai 10
    public int demPTLaSNT()
    {
        int count = 0;
        for (int i = 0; i < n; i++)
        {
                if (checkSNT(a[i]) == true)
                {
                    count++;
                }
        }
        return count;
    }
    //Bai 11
    public boolean checkMangToanSNT()
    {
        for (int i = 0; i < n; i++)
        {
            if(checkSNT(a[i]) == false)
            {
                return false;
            }
        }
        return true;
    }
    //Bai 12
    public boolean checkMangTangDan()
    {
         for (int i = 0; i < n; i++)
        {
            if(a[i] > a[i + 1])
            {
                return false;
            }
        }
         return true;
    }
    //Bai 13
    public int elementMin()
    {
            int min = a[0];
            for (int i = 0; i < n; i++)
            {
                    if (a[i] < min)
                    {
                            min = a[i];
                    }
            }
            return min;
    }
    //Bai 14
    public int elementMax()
    {
            int max = a[0];
            for (int i = 0; i < n; i++)
            {
                    if (a[i] > max)
                    {
                            max = a[i];
                    }
            }
            return max;
    }
    //Bai 15
    public int soAmLonNhat()
    {
        int max = a[0];
            for (int i = 0; i < n; i++)
            {
                    if ((a[i] > max) && (a[i] < 0))
                    {
                            max = a[i];
                    }
            }
            return max;
    }
    
    //Bai 16
    
    public void daoNguocMang()
    {
        int[] kq = new int[MAX_SIZE];
        int j = 1;
        for(int i = n - 1; i >= 0; i--)
        {
            // -10 -15 22 34 25
            // 25 34 22 -15 -10
            // 4 - (5 - 1) = 0 => kq[0] = a[4]
            // 3 - (5 - 3) = 1 => kq[1] = a[3]
            // 2 - (5 - 5) = 2
            // 1 - (5 - 7) = 3
            // 0 - (5 - 9) = 4
            kq[i - (n - j)] = a[i];
            
            j+= 2;
        }
        
        a = kq;

    }
}
