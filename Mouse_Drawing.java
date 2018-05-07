package assignment3;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mouse_Drawing extends JPanel  implements MouseListener,MouseMotionListener {	
	
	public int startx = 0;
	public int starty = 0;
	public int endx = 0;
	public int endy = 0;
	
	
	//get the new point and assign 
	public void mouseDragged(MouseEvent e) {
		
		endx = e.getX();
		endy = e.getY();
		startx = endx;
		starty = endy;
		repaint();
	}

	
	 //Get the point when it is pressed 
	
	public void mousePressed(MouseEvent e) {
		startx = e.getX();
		starty = e.getY();
	}

	
	
	//  listen to the mouse motion to draw
	
	public void paintComponent(Graphics g) {
		
		g.drawString("Move the Mouse to draw line", 150, 100);
		addMouseListener(this);
	    addMouseMotionListener(this);
		g.setColor(Color.RED);
		g.drawLine(startx, starty, endx, endy);	
		
	}

	
	public void mouseMoved(MouseEvent e) {}
	public void mouseClicked(MouseEvent arg0) {}
	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent arg0) {}
	public void mouseReleased(MouseEvent arg0) {}

	public static void main(String[] args) {
		// making Jframe and adding Jpane to JFrame
		JPanel obj = new Mouse_Drawing();
		JFrame frame = new JFrame("Draw using mouse pointer");
		frame.add(obj);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
	}


}
