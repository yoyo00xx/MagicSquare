/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.NumberFormat;
import javax.swing.JFormattedTextField;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author BalaH-RiG
 */

class FormattedInputBox extends JFormattedTextField implements KeyListener{
   
    public FormattedInputBox(int i){
        super(getFormat(i));
        this.setHorizontalAlignment(FormattedInputBox.CENTER);
        this.setFont(new Font("Comic Sans MS",Font.BOLD,50-i-i));
        
    }
    public FormattedInputBox(){
        super(getFormat());
        this.setHorizontalAlignment(FormattedInputBox.CENTER);
        this.addKeyListener(this);
    }

    public static NumberFormatter getFormat(int i)
    {
        NumberFormat format = NumberFormat.getInstance();
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(1);
        formatter.setMaximum(i*i);
        formatter.setAllowsInvalid(false);

        return formatter;
    }
    public static NumberFormatter getFormat()
    {
        NumberFormat format = NumberFormat.getInstance();
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(1);
        formatter.setMaximum(Integer.MAX_VALUE);
        formatter.setAllowsInvalid(false);

        return formatter;
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent ke) {
    
                        if(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE||ke.getKeyCode() ==KeyEvent.VK_DELETE)
                        {
                            FormattedInputBox inputBox = (FormattedInputBox) ke.getComponent();
                            try{
                                // Clear the text field if the number is 1 digit or less
                                if(Integer.parseInt(inputBox.getText()) <= 9)
                                    inputBox.setValue(null);
                            }catch(Exception e){}
                        }
                    }

    @Override
    public void keyReleased(KeyEvent e) {}
}

