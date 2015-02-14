package milleniumlegacy;

import java.awt.Graphics;

import javax.imageio.ImageIO;
import javax.swing.*;

public class GUI {

	public static void main(String[] args) {
			  JFrame f = new JFrame("Millenium Legacy");
			  f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			  f.setContentPane(new JPanel() {
				  public void paintComponent(Graphics g) {
						super.paintComponent(g);
					}
			  });
				f.setResizable(false);
				f.pack();
				f.setSize(825, 625);
				f.setVisible(true);
	}
}
