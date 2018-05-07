package assignment3;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Moving_drawString extends JPanel implements KeyListener {
	int x=100; 
    int y=100; 

	public Moving_drawString() {
	setFocusable(true);
	}
	

	// paint myname on panel using draw string
	
	public void paintComponent(Graphics g) {
		  

		super.paintComponent(g);
		addKeyListener(this);
		g.drawString("Aziz ullah ", x, y);
	}
	
	
	// listener when key up/down/left/right moved change the location
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_DOWN) {	
			y = y + 1;
		}	
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			y = y - 1;
		}	
		if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			x = x - 1;
		}	
		if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			x = x + 1;
		}	
		repaint();
	}
	
	
	public static void main(String[] args) {
		JFrame myframe = new JFrame();
		JPanel pane= new Moving_drawString();
		myframe.add(pane);
		myframe.setLocation(200, 200);
		myframe.setSize(300,300);
		
		myframe.setVisible(true);
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
