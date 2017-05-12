package Classes;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Player extends JComponent
{
	private static final long serialVersionUID = 1L;
	
	private int x, y;
	private int yMotion = 0;
	private int size;
	
	public static Player player = new Player();
	
	public Player()
	{
		setX(100);
		setY(400);
		size = 50;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(Color.DARK_GRAY);
		g.fillOval(x, y, size, size);
	}
	
	public void jump()
	{
		if(yMotion > 0)
			yMotion = 0;
		yMotion = -30;
		y += yMotion;
	}
	
	public void fall()
	{
		if(y <= 400)
		{
			if(yMotion < 15)
				yMotion += 3;
		}
		y += yMotion;
		if(y >= 400)
			y = 400;
	}
	
	public void update()
	{
		
	}

	public int getX() 
	{
		return x;
	}

	public void setX(int x) 
	{
		this.x = x;
	}

	public int getY() 
	{
		return y;
	}

	public void setY(int y) 
	{
		this.y = y;
	}

	public int getyMotion() 
	{
		return yMotion;
	}

	public void setyMotion(int yMotion) 
	{
		this.yMotion = yMotion;
	}
}
