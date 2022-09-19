package main;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class GamePanel extends JPanel implements Runnable {
	// SCREEN SETTINGS
	final int originalTileSize = 16; // 16x16 tiles
	// thing to note, this tile size will be too small on modern screens, we will
	// multiply it to make it bigger (scale it)
	final int scale = 3; // 16x3 = 48
	final int tileSize = originalTileSize * scale; // 48x48
	final int maxScreenCol = 16; // setting column of screen (can only change this value)
	final int maxScreenRow = 12; // setting row of screen (can only change this value)
	final int screenWidth = tileSize * maxScreenCol; // 48 * 16=768 pixels
	final int screenHeight = tileSize * maxScreenRow; // 48 * 12 =576 pixels

	// FPS set
	int FPS = 60;
	KeyHandler keyH = new KeyHandler(); // Instantiate keyhandler
	Thread gameThread; // keeps program running until you stop it, keeps process running, implements
						// Runnable ^^^ check class

	// set player's default position
	int playerX = 100;
	int playerY = 100;
	int playerSpeed = 4;

	public GamePanel() {
		this.setPreferredSize(new Dimension(screenWidth, screenHeight));// gonna have to look up this
		this.setBackground(Color.black);
		this.setDoubleBuffered(true); // if set to true, all drawing from this component will be done in an off screen
										// painting buffer, helps with performance and game's rendering performance
		this.addKeyListener(keyH); // so this panel can recognize key inputs
		this.setFocusable(true); // with this, this GamePanel can be "focused" to receive key input
	}

	public void startGameThread() {
		gameThread = new Thread(this); // the "this" means we are passing GamePanel class to this thread constructor
		gameThread.start(); // will call the run method
	}

	@Override
	public void run() {
		// when we call the gameThread, it will run this method run
		while (gameThread != null) {
			// System.out.println("The game loop is running\n");
			// depending on FPS, we update it that many times per second

			long currentTime = System.nanoTime(); // returns the current value of the running Java Virtual Machine's
													// high resolution time source, in nanoseconds

			// 1. UPDATE: update information such as character positions
			update();
			// 2.DRAW: draw the screen with the updated information
			repaint(); // this is how you call the paintComponent
		}
	}

	public void update() {
		// in java the upper left corner is X:0 Y:0
		if (keyH.upPressed == true) { // Y values decreases as you go up
			playerY -= playerSpeed;
		}
		if (keyH.downPressed == true) { // Y values increases as you go down
			playerY += playerSpeed;
		}
		if (keyH.leftPressed == true) { // X values decreases as you go left
			playerX -= playerSpeed;
		}
		if (keyH.rightPressed == true) { // X values increases as you go right
			playerX += playerSpeed;
		}
	}

	public void paintComponent(Graphics g) { // Graphics- A class that as many functions to draw objects on the screen

		super.paintComponent(g); // important to add super, super-parent class of this class, when using
									// paintComponent method use this super, GamePanel is a subclass of JPanel
		Graphics2D g2 = (Graphics2D) g; // Graphics 2D class extends the Graphics class to provide more sophisticated
										// control over geometry, coordinate transformations, color management, and
										// text layout. changing the type of g from Graphics to Graphics2D
		g2.setColor(Color.white);
		g2.fillRect(playerX, playerY, tileSize, tileSize);
		g2.dispose(); // Dispose of this graphics context and release any system resources that it is
						// using, still works but good practice to save some memory
	}
}
