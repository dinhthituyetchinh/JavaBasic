/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package example02;

import javax.swing.SwingUtilities;
/**
 *
 * @author Tuyet Chinh
 */
public class Example02 {

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
                new MainFrame();
            }
            
        });
    }
    
}
