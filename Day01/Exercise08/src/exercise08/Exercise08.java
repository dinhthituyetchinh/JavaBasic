/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise08;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double n;      
        do
        {
            System.out.println("Nhập vào một số chính phương: ");
            n = scanner.nextDouble();
            
            if(checkSCP(n) == false)
            {
                System.out.println("Vui lòng nhập lại số vừa nhập không phải số chính phương");
            }
            else
            {
                System.out.println("Số vừa nhập là: "+ n);
                break;
            }
        }while(checkSCP(n) == false);
        
        
    }
    
    public static boolean checkSCP(double x)
    {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }
}

