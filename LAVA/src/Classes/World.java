package Classes;

import java.awt.Color;
import java.awt.Graphics;

public class World
{
	private int groundX = 0, groundY = 400, groundLength = 800, groundHeight = 400;

	public World()
	{
		
	}
	
	public void draw(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillRect(0,0,800,800);
		g.setColor(Color.green);
		g.fillRect(groundX, groundY, groundLength, groundHeight);
	}
}
