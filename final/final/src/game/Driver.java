package game;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import gameClasses.Game;
public class Driver
{
	public static Color c;
	static Game game = new Game(800,800);
	public static boolean running = true;
	private static int score = 0;
	public static void main(String[] args)
	{
		c = Color.BLUE;
		game.setTitle("The Floor Is Lava");
		game.setCursor(game.getToolkit().createCustomCursor(
	            new BufferedImage(3, 3, BufferedImage.TYPE_INT_ARGB), new Point(0, 0),
	            "null"));
		game.setLocationRelativeTo(null);
		while(running)
		{
			game.panel.setBackground(c);
			game.repaint();
			game.panel.repaint();
			game.panel.getObs().move();
			game.panel.getPlayer().fall();
			//wait---
			try{Thread.sleep(50);}catch(Exception e){}
			
			if(game.panel.getPlayer().getX() == game.panel.getObs().getX() && game.panel.getPlayer().getY() == 425)
			{
				running = !running;
				game.panel.repaint();
				game.repaint();
			}
			else
			{
				score++;
			}
			System.out.println(score);
		}
	}
}
