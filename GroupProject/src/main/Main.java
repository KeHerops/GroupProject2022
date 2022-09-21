package main;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// some option for the window but not the details of the size and contents of
		// the window, check GamePanel.java
		JFrame window = new JFrame(); // creating a window using the JFRAME class.
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // This is to allow closing when pressing the x
		window.setResizable(false); // we're not allowing to resize I believe to keep the tiles consistent
		window.setTitle("2D Adventure of blue hair boy"); // name of window

		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);

		window.pack(); // causes this window to be sized to fit the preferred size and layouts of its
						// subcomponents (=GamePanel)

		window.setLocationRelativeTo(null); // will open window in middle of screen
		window.setVisible(true); // so we can see?
		
		gamePanel.startGameThread();
	}

}

/*
 * Concept of 2D gaming: Most important thing and what makes it different
 * compared to like a textbased game, is existence of time. Game will continue
 * to run and you must make your world continue on without your input.
 * to create time in our world we use threading.
 */
