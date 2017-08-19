/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication1.GameWindow.textFields;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/**
 *
 * @author BalaH-RiG
 */
public class MyProgram {
    public static void main(String[] args )
    {
        
        (new Program()).setVisible(true);
        
        
    }
    public static void systemTheme(){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyProgram.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MyProgram.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MyProgram.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MyProgram.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void defaultTheme(){
        try {
            
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyProgram.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MyProgram.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MyProgram.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MyProgram.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void restoreTheme(){
        try {
            
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MyProgram.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(MyProgram.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(MyProgram.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(MyProgram.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < NewGameInput.N; i++)	for (int j = 0; j < NewGameInput.N; j++){
                
              textFields[i][j].setForeground(Color.BLACK);
              textFields[i][j].setBackground(Color.WHITE);
              textFields[i][j].repaint();
            }
    }
    
}
