package gameClasses;

import java.awt.Color;
import java.awt.Graphics;

public class Cloud 
{

	private int x, y;
	private int size;
	
	public Cloud(int size)
	{
		this.size = size;
		y = 100;
		x = 800;
	}
	
	public void drawCloud(Graphics g)
	{
		g.setColor(Color.WHITE);
		g.fillRect(x, y,size,size);
	}
	
	public void move()
	{
		if(x>-200)
			x-=5;
		else if(x<=0)
			x = 800;
		y += (int)(Math.random()*.5);
		y-= (int)(Math.random()*.5);
		if(y>200 && x < -150)
			y = (int)(Math.random()*100); 
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}

	
}
