package milleniumlegacy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JPanel;

public class MainGame extends JPanel
{
	private static final long serialVersionUID = -1902119798739765822L;
	ImageLoader IL = new ImageLoader();
	BufferedImage player = IL.loadImage("Untitled.png");
	ArrayList<Tile> map = Map.readyMap();
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor( Color.BLACK );
		g.drawImage(player, 200,300, null);
		for (Tile t : map)
		{
			t.Render(g);
		}
	}

}
