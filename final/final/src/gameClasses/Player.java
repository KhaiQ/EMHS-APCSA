package gameClasses;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import gameClasses.Game;

public class Player extends JComponent implements game.Character
{

	private static final long serialVersionUID = 1L;
	private int x , y ;
	public int size;
	private int yMotion;
	private Color playerColor = Color.GRAY;
	
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
		g.setColor(getPlayerColor());
		g.fillOval(x, y, size, size);
	}
	
	public void Update(Game g)
	{
		g.repaint();
	}
	
	public void fall()
	{
		if(y < 425)
		{
			if(yMotion < 15)
				yMotion += 3;
		}
		else
			y = 425;
		y += yMotion;	
		if(y > 425)
			y = 425;
	}
	
	public void jump()
	{
		if(yMotion > 0)
			yMotion = 0;
		yMotion = -30;
	}

	public Color getPlayerColor() {
		return playerColor;
	}

	public void setPlayerColor(Color playerColor) {
		this.playerColor = playerColor;
	}
	
}
