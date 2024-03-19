/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise2_1;

/**
 *
 * @author Tuyet Chinh
 */
public class Exercise2_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Cách chạy file giao diện
        // Cách 1
//        java.awt.EventQueue.invokeLater(new Runnable()
//        {
//              public void run()
//              {
//                   GiaiPhuongTrinhBac1 frame = new GiaiPhuongTrinhBac1();
//                   frame.setVisible(true);
//              } 
//        });
//        //Cách 2 
//        GiaiPhuongTrinhBac1 dt = new GiaiPhuongTrinhBac1();
//        dt.show();//=> Tuy nhiên cách này sắp bị khai tử
        //Cách 3
        GiaiPhuongTrinhBac1 dt2 = new GiaiPhuongTrinhBac1();
        dt2.setVisible(true);
    }
}
