package Graphics;

import java.awt.Graphics;


import javax.swing.JPanel;

import Classes.Cloud;
import Classes.Obj;
import Classes.Player;
import Classes.World;

public class Panel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private Player player;
	private Obj object;
	private Cloud cloud;
	private World world = new World();
	
	
	public Panel()
	{
		player = Player.player;
		object = Obj.object;
		setCloud(Cloud.cloud);
		this.setVisible(true);
	}
	
	public void addPlayer(Player player)
	{
		this.player = player;
	}
	
	public void addObject(Obj object)
	{
		this.object = object;
	}
	
	public void addCloud(Cloud cloud)
	{
		this.setCloud(cloud);
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		world.draw(g);
		player.draw(g);
		cloud.draw(g);
		if((int)(Math.random() * 2) == 1)
		object.draw1(g);
		else
		object.draw2(g);
	}
	
	public void update()
	{
		revalidate();
		repaint();
	}

	public Cloud getCloud() {
		return cloud;
	}

	public void setCloud(Cloud cloud) {
		this.cloud = cloud;
	}
}
