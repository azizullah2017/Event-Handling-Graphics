package assignment3;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Grabbing_Mouse_Cursor_Location_adpter extends MouseAdapter {
	public void mouseMoved(MouseEvent e)
	{
		int x=e.getX();
	    int y=e.getY();
	    System.out.println(x+","+y);
	}
	public static void main(String[] args) {
		
  JFrame fr = new JFrame();
  fr.addMouseMotionListener(new Grabbing_Mouse_Cursor_Location_adpter());
  fr.setSize(400,400);
  fr.setVisible(true);
	}
}
