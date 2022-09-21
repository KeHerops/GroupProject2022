package entity;

import java.awt.image.BufferedImage;

// This will be the super class or parent class for player class or any another entity classes

//This class will store variables that will be used in player, monster and NPC classes

public class Entity {
	
	public int x, y;
	public int speed;
	
	public BufferedImage up1, up2, down1, down2, right1, right2, left1, left2;
	public String direction;
}
