/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise07;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try(Scanner scanner = new Scanner(System.in))
        {
            System.out.print("Nhập vào một số nguyên: ");
            int N = scanner.nextInt();
            System.out.println("Phân tích "+ N + " ra thừa số nguyên tố:");
            int n = N;
            for(int i=2; i<=n;i++)
            {
                while(n%i==0)
                {
                   n=n/i;
                   if(n==1)
                       System.out.print(i);
                   else
                       System.out.print(i+" x ");
                }
                if (n==1)
                   break;

            }
            
            System.out.println("\n");
            int dem = 0;
            while(N>=10)
            {
                N/= 10;
                dem++;
            }
            System.out.println("Số chữ số của "+ N + " là: "+(dem + 1)); 
        }
    }
    
}
