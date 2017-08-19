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

//Youniss did this so IDK
public class FormattedInputBox extends JFormattedTextField implements KeyListener{
	/**@param int i is used to specify the size of the magicSquare game,
	 * if i = -1, then max allowed value is Integer.MAX_VALUE*/
	public int row=-1, col=-1;

	public FormattedInputBox(int i, int r, int c){
		this(i);
		this.row = r;
		this.col = c;
	}
	public FormattedInputBox(int i){
		super(getFormat(i));
		this.addKeyListener(this);
		this.setFont(new Font("Comic Sans MS", Font.BOLD, 50-i*2));

		this.setHorizontalAlignment(FormattedInputBox.CENTER);
	}

	public static NumberFormatter getFormat(int i) {
		NumberFormat format = NumberFormat.getInstance();
		NumberFormatter formatter = new NumberFormatter(format);
		formatter.setValueClass(Integer.class);
		formatter.setAllowsInvalid(false);

		formatter.setMinimum(1);
		if(i==-1) formatter.setMaximum(Integer.MAX_VALUE);
		else	  formatter.setMaximum(i*i);

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
