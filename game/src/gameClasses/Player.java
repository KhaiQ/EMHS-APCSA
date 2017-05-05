package gameClasses;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Player extends JComponent implements game.Character
{
	private int x , y ;
	public int size;
	private int gravity = 10;
	
	public Player(int s)
	{
		x = 100;
		y = 400;
		size = s;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getX()
	{
		return x;
	}
	
	public void setY(int y)
	{
		this.y = y;
	}
	
	public void setX(int x)
	{
		this.x = x;
	}
	
	public void drawChar(Graphics g)
	{
		super.paintComponent(g);
		g.fillOval(x, y, size, size);
	}
	
	public void Update(Game g)
	{
		g.repaint();
	}
	
	public void fall()
	{
		if(y<400)
		{
			y+=60;
		}
	}
	
	public void jump()
	{
			y-=400;
	}
	
}
