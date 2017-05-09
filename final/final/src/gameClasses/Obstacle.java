package gameClasses;

import java.awt.Color;
import java.awt.Graphics;

public class Obstacle
{
	private int x, y;
	private int size;
	public Obstacle(int size)
	{
		x = 800;
		y = 420;
		this.size = size;
	}
	
	public void drawObstacle(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillRect(x, y, size/2 ,size/2 );
	}
	
	public void move()
	{
		if(x>-200)
			x-=20;
		else if(x<=0)
			x = 800;
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
