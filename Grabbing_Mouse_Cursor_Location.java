package assignment3;



import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class Grabbing_Mouse_Cursor_Location implements MouseMotionListener  {

	public void mouseMoved(MouseEvent e)
	{
		int x=e.getX();
	    int y=e.getY();
	    System.out.println(x+","+y);
	}
	public static void main(String[] args) {
		
  JFrame fr = new JFrame();
  fr.addMouseMotionListener(new Grabbing_Mouse_Cursor_Location());
  fr.setSize(400,400);
  fr.setVisible(true);
	}
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
