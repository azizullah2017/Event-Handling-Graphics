package assignment3;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.StringJoiner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Multi_Line_drawString extends JPanel implements KeyListener   {

	int width;
	int x = 50;
	int y = 50;
	int windlen;
	 String[] strp = new String[20];
	String joined="";
	int wdth=0;
	String S = "Change the size of this string to check its ability of multiple line string moving";
	
	//automatic focus on frame to move the string
	public Multi_Line_drawString() {
		setFocusable(true);
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

	public void keyReleased(KeyEvent arg0) {}
	public void keyTyped(KeyEvent arg0) {}
	void splitStringInLine(Graphics g,  String str){
		
		wdth = g.getFontMetrics().stringWidth(joined);
		
		//System.out.println("Joined " +joined);
		//check if the window size is greater than the words length size so join the chachter and return
		if(wdth<windlen)
    	{
    	joined+=" "+str;
    	return ;
    	}
		strp[0] =joined;
    // if the width of chachter is equal to window length insert new line in string and increast the windows size by 2 bcz new line added
		joined+="\n"+str; 
		windlen=windlen*2;
		//System.out.println(" c ");
	}

	private void drawString(Graphics g, String S, int x, int y) {	
		width = g.getFontMetrics().stringWidth(S)-120;
		windlen= this.getWidth();
		// check the legth of string with window width 
		if(width < windlen) {
			g.drawString(S, x, y);
		}
		else {
			
			// split string into words 
			for (String line : S.split(" "))	{
            	splitStringInLine(g,line);
			}
			g.drawString(joined, x, y += g.getFontMetrics().getHeight());
	        System.out.println(joined);
		}    
    }
	
	// paint to draw the string
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		addKeyListener(this);
        g.setFont(g.getFont().deriveFont(20f));
        drawString(g, S, x, y);
        addKeyListener(this);
	}


	public static void main(String[] args) {
		JFrame myframe = new JFrame("Multiple Line String ");
		myframe.add(new Multi_Line_drawString());
		myframe.setLocation(200, 200);
		myframe.setSize(800,400);
		myframe.setVisible(true);
	

	}
	

}
