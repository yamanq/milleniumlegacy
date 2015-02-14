package milleniumlegacy;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingFrame extends JPanel
{
	private static final long serialVersionUID = -1902119798739765822L;

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		g.setColor( Color.BLACK );
	}

}
