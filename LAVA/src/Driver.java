import Classes.Cloud;
import Classes.Obj;
import Classes.Player;
import Graphics.Frame;

public class Driver 
{
	private static Frame f = new Frame("LAVA");
	private static boolean running = true;
	
	public static void main(String[] args) 
	{
		while(running)
		{
			f.update();
			Player.player.fall();
			Obj.object.move();
			Cloud.cloud.move();
			try
			{
			Thread.sleep(50);
			}
			catch(Exception e)
			{
					
			}
		}		
	}
}
