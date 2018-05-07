package assignment3;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class Differentiating_between_Event_Sources extends MouseAdapter {
	public void mouseClicked(MouseEvent ev)
	{
	System.out.println(((AbstractButton) ev.getSource()).getText());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      JFrame fr = new JFrame();
      JButton btn1 = new JButton(" Button No. 1");
      JButton btn2 = new JButton(" Button No. 2");
      fr.add(btn2);
      fr.add(btn1);
      
    GroupLayout layout = new GroupLayout(fr.getContentPane());
  	fr.getContentPane().setLayout(layout);
      
      layout.setAutoCreateGaps(true);
  	layout.setAutoCreateContainerGaps(true);

  	layout.setHorizontalGroup(layout.createSequentialGroup()
  			.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
  					.addComponent(btn1)
  					.addComponent(btn2)
  					));
  	
  	
  	layout.linkSize(SwingConstants.HORIZONTAL, btn1, btn2);

	layout.setVerticalGroup(layout.createSequentialGroup()
	   
	        .addComponent(btn1)
	        .addComponent(btn2));
  			
	btn1.addMouseListener(new Differentiating_between_Event_Sources());
	btn2.addMouseListener(new Differentiating_between_Event_Sources());
	
      fr.setSize(300,300);
      fr.setVisible(true);
	}

}
