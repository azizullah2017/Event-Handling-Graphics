package assignment3;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Marks_Pie_Chart extends JPanel {
	String name[] = { "Omar Khan", "Arbab Rahim", "Bilal Jan" };
	int engl[] = { 40, 20, 30 };
	int urdu[] = { 25, 50, 40 };
	int math[] = { 35, 45, 15 };
	
	public void paintComponent(Graphics g)
	{
		 Graphics2D g1 = (Graphics2D) g;
		 g1.setStroke(new BasicStroke(2));
		// g1.setColor(Color.black);
		 //g.drawOval(100, 100, 100, 100);
		 //g1.setColor(Color.gray);
		 Font f = new Font("", Font.BOLD, 14);
		 g.setFont(f);
		 g1.setColor(Color.gray);
		 for (int i=0,plus =0; i<=2;i++, plus+=200 ) {
		 g.drawString(name[i], 120+plus, 70);
		 g.drawString(Integer.toString(engl[i]+urdu[i]+math[i])+"/150", 120+plus, 90);
		 
		 }
		 			
		 //g.fillOval(100, 100, 100, 100);
		 float st=0, en=0; int sum;
		 for (int i=0,j=0; i<=400;i+=200,j++ )
		 {
		 g1.setColor(Color.red);
		 sum=engl[j]+urdu[j]+math[j];
		 st=(engl[j]*360)/sum;
		 //System.out.println(engl[j]);
		 g.fillArc(100+i, 100, 100, 100, 0,(int) st );		 
		 g1.setColor(Color.blue);
		 en=(urdu[j]*360)/sum;
		 g.fillArc(100+i, 100, 100, 100, (int) st,(int) en);
		// System.out.println("start "+st+"    end   "+en);
		 st=st+en;
		 en=(math[j]*360)/sum;
		 //System.out.println("start  "+st+"      end  "+en);
		 g1.setColor(Color.green);
		 g.fillArc(100+i, 100, 100, 100, (int)st, (int)en);
		 }
		// Rectangle r = new Rectangle(100,50,50,200);
		//		 g1.draw(r);
				 
		 
	}
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
	    frame.setSize(700, 300);
	    frame.setTitle("Graphs");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setLocationRelativeTo(null);  
	    Marks_Pie_Chart draw = new Marks_Pie_Chart();
	    frame.add(draw);
	    frame.setVisible(true);
	}

}
