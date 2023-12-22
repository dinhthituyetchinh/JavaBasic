/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise06;

import java.util.Scanner;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        try(Scanner scanner = new Scanner(System.in))
        {
            int day, month, year;
            do
            {
                System.out.print("Input day: ");
                day = scanner.nextInt();
                if(day < 1 || day > 31)
                {
                    System.out.println("Error day");
                }
            }
            while(day < 1 || day > 31);
            
            do
            {
                System.out.print("Input month: ");
                month = scanner.nextInt();
                if(month < 1 || month > 12)
                {
                    System.out.println("Eror month");
                }
            }
            while(month < 1 || month > 12);

            do
            {
                System.out.print("Input year: ");
                year = scanner.nextInt();
                if(year < 0)
                {
                    System.out.println("Eror year");
                }
            }
            while(year < 0);

            System.out.println("Output day/ month/ year: "+day+"/"+month+"/"+year);
            System.out.print(day + "/" + month + "/" + year + " is: ");
            int n;
            if(month < 3)
            {
                month += 12;
                year -= 1;
                n = (day + 2 * month + (3 * (month + 1))/ 5 + year + (year/ 4)) % 7;
            }
            else
            {
                
                n = (day + 2 * month + (3 * (month + 1))/ 5 + year + (year/ 4)) % 7;               
            }
            switch(n)
                    {
                        case 0:
                            System.out.println("Sunday");
                            break;
                        case 1: 
                            System.out.println("Monday");
                            break;
                        case 2:
                            System.out.println("Tuesday");
                            break;
                        case 3:
                            System.out.println("Wednesday");
                            break;
                        case 4: 
                            System.out.println("Thursday");
                            break;
                        case 5:
                            System.out.println("Friday");
                            break;
                        case 6:
                            System.out.println("Satuday");
                            break;
                        default:
                        System.out.println("Invalid day of week");

                    }
        }
    }
    
}
