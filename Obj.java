package Classes;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Obj extends JComponent
{ 
	private static final long serialVersionUID = 1L;
	
	private int x, y;
	private int size;
	
	public static Obj object = new Obj();

	
	public Obj()
	{
		x = 800;
		y = 400;
		size = 50;
	}
	
	public void draw1(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillRect(x, y - 30, size + 10, (size * 2) - 20);
	}
	
	public void draw2(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillRect(x, y - 50, size + 10, size*2);
	}
	
	public void move()
	{
		if(x>-200)
			x-=20;
		else if(x<=0)
			x = 800;
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
	
	public void update()
	{
		
	}
}
