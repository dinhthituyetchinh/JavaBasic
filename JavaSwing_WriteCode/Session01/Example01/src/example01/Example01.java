/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example01;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Tuyet Chinh
 */
public class Example01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable()
            {
            @Override
            public void run()
            {
                JFrame frame = new JFrame("Hello World");
        
                frame.setSize(600, 500);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }

            });
        
        
    }
    
}
