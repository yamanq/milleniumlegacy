package milleniumlegacy;

import javax.swing.*;

public class GUI {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
		
	}
	public static void createAndShowGUI()
	{
		JFrame f = new JFrame("Millenium Legacy");
		MainGame  draw = new MainGame();
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.getContentPane().add(draw);
		f.setResizable(false);
		f.pack();
		f.setSize(825, 625);
		f.setVisible(true);
	}
	
}

