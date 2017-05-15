package Classes;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Cloud extends JComponent
{	
	private static final long serialVersionUID = 1L;
	private int x;
	private int y;
	private int size;
	
	public static Cloud cloud = new Cloud();

	
	public Cloud()
	{
		size = 100;
		y = 100;
		x = 800;
	}
	
	public void draw(Graphics g)
	{
		g.setColor(Color.WHITE);
		g.fillRect(x, y,size,size);
	}
	
	public void move()
	{
		if(x > -200)
		{
			x -= 5;
		}
		else if(x <= 0)
		{
			x = 800;
		}
		y += (int)(Math.random()*.5);
		y -= (int)(Math.random()*.5);
		
		if(y > 200 && x < -150)
		{
			y = (int)(Math.random()*100); 
		}
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
	
	public void update()
	{
		
	}
}
