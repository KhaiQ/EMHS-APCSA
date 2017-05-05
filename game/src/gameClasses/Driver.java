package gameClasses;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Driver
{
	public static Color c;
	static Game game = new Game(800,800);

	public static void main(String[] args)
	{
		while(true)
		{
			game.repaint();
			game.panel.repaint();
			c = new Color((int) (Math.random()*255),(int) (Math.random()*255),(int) (Math.random()*255));
			game.panel.getPlayer().fall();
			//wait---
			try{Thread.sleep(50);}catch(Exception e){}
		}
	}
}
