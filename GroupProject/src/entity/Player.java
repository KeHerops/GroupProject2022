package entity;

import java.awt.Color;
import java.awt.Graphics2D;

import main.GamePanel;
import main.KeyHandler;

public class Player extends Entity{

	GamePanel gp;
	KeyHandler keyH;
	
	public Player(GamePanel gp, KeyHandler keyH) {
		this.gp=gp;
		this.keyH=keyH;
		
		setDefaultValues();
		
	}
	public void setDefaultValues() {
		x=100;
		y=100;
		speed=4;
	}
	public void update() {
		// in java the upper left corner is X:0 Y:0
				if (keyH.upPressed == true) { // Y values decreases as you go up
					y -= speed;
				}
				if (keyH.downPressed == true) { // Y values increases as you go down
					y += speed;
				}
				if (keyH.leftPressed == true) { // X values decreases as you go left
					x -= speed;
				}
				if (keyH.rightPressed == true) { // X values increases as you go right
					x += speed;
				}
	}
	public  void draw(Graphics2D g2) {
		g2.setColor(Color.white);
		g2.fillRect(x, y, gp.tileSize, gp.tileSize);
		
		
	}
}
