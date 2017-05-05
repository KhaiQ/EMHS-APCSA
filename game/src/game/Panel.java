package game;


import java.awt.Color;
import java.awt.Graphics;
import java.sql.Driver;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

import gameClasses.Movement;
import gameClasses.Player;

public class Panel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private static Player player = new Player(20);

	
	public static Player getPlayer() 
	{
		return player;
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
		g.setColor(gameClasses.Driver.c);
		player.drawChar(g);
	}
}
