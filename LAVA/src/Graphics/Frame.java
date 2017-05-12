package Graphics;

import Classes.Player;
import Graphics.Panel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

public class Frame extends JFrame implements ActionListener, MouseListener
{

	private static final long serialVersionUID = 1L;
	Panel p = new Panel();
	public Frame(String Title)
	{
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,800);
		this.setTitle(Title);
		this.add(p);
		this.addMouseListener((MouseListener) this);
	}
	
	public void update()
	{
		p.update();
		this.revalidate();
		this.repaint();
	}
	@Override
	public void mouseClicked(MouseEvent e) 
	{
		
	}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
		
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{
		
	}

	@Override
	public void mousePressed(MouseEvent e) 
	{
		if(Player.player.getY() == 400)
			Player.player.jump();
	}

	@Override
	public void mouseReleased(MouseEvent e) 
	{
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}
}
