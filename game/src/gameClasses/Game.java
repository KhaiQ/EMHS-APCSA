package gameClasses;


import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

import game.Panel;

public class Game extends JFrame implements game.Game,MouseListener, MouseMotionListener,KeyListener
{
	public Panel panel = new Panel();
	private static final long serialVersionUID = 1L;
	private boolean gameOver = false;
	private int width, height;	
	private int prevX, prevY;
	public Game(int w , int h)
	{	
		setLayout(new GridLayout(1,1));
		add(panel,0,0);
		panel.repaint();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		height = h; 
		width = w;
		setVisible(!gameOver);
		setSize(width, height);	
		addMouseMotionListener((MouseMotionListener) this);
		addMouseListener((MouseListener) this);

	}

	@Override
	public void mouseDragged(MouseEvent e)
	{
		if(e.getX()>100)
		{
			panel.getPlayer().size += 10;
		}
		if(e.getX() < 100)
		{
			panel.getPlayer().size -= 10;
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) 
	{
		panel.getPlayer().setX(e.getX());
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		panel.getPlayer().jump();
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
