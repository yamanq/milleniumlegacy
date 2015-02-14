package milleniumlegacy;

import java.awt.Color;
import java.awt.Graphics;

public class Tile 
{
	int x,y;
	char terrain;
	public Tile(int x, int y, char terrain)
	{
		this.x = x;
		this.y = y;
		this.terrain = terrain;
	}
	public void Render(Graphics g)
	{
		if (terrain == 'g')
		{
			g.setColor(Color.GREEN);
			g.fillRect(x*16, y*16, 16,16);
		}
		else
		{
			g.setColor(Color.BLUE);
			g.fillRect(x*16, y*16, 16,16);
		}
	}
}
