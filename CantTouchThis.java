package assignment6;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class CantTouchThis implements ActionListener, MouseMotionListener, MouseListener {
	
	JFrame window = new JFrame("Can't Click Me");
	Container content;
	JButton b = new JButton("Can't touch this!");
	
	public CantTouchThis(){
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		content = window.getContentPane();
        content.addMouseListener(this);        
        content.addMouseMotionListener(this);
        JPanel mine = new JPanel(new FlowLayout(FlowLayout.CENTER));
        b.getPreferredSize();
		mine.add(b);
		b.addActionListener(this);
		JPanel blank = new JPanel ();
		blank.getPreferredSize();
		JPanel blank1 = new JPanel();
		blank1.getPreferredSize();
		window.add(blank1, BorderLayout.NORTH);
		window.add(blank, BorderLayout.SOUTH);
		window.add(mine, BorderLayout.CENTER);
		window.setLocationRelativeTo(null);
		window.setSize(500, 110);
		window.setVisible(true);
	}
	
	public static void main (String[] args){
		new CantTouchThis();
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		System.out.println("YOU TOUCHED ME!!!");
		//only prints if spacebar is pressed
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		b.setEnabled(false);
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		b.setEnabled(false);
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		b.setEnabled(false);
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		b.setEnabled(false);
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		b.setEnabled(true);
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		b.setEnabled(true);
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		b.setEnabled(false);
		b.setEnabled(true);
	}
}
