package game;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

import gameClasses.Cloud;
import gameClasses.Obstacle;
import gameClasses.Player;

public class Panel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private Player player = new Player(60);
	private Obstacle obs = new Obstacle(100);
	private Cloud cloud = new Cloud(100);
	
	public Player getPlayer() 
	{
		return player;
	}

	public Obstacle getObs()
	{
		return obs;
	}
	
	public void setPlayer(Player player) 
	{
		this.player = player;
	}
	
	public Panel()
	{
		setVisible(true);	
	}  
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.GREEN);
		g.fillRect(0, 420, 800, 400);
		cloud.drawCloud(g);
		obs.drawObstacle(g);
		player.drawChar(g);
		gameOver(g);
	}
	
	public void gameOver(Graphics g)
	{
		if(!Driver.running)
		{
			g.setColor(Color.RED);
			g.setFont(new Font("TimesRoman", Font.PLAIN, 100));
			g.drawString(new String("Game Over"), 300, 400);
		}
	}

	public Cloud getCloud() 
	{
		return cloud;
	}

	public void setCloud(Cloud cloud) 
	{
		this.cloud = cloud;
	}
}
