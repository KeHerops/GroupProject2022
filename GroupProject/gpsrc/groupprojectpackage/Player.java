package groupprojectpackage;

import java.util.ArrayList;

public class Player extends Entity {

	private final int DEFAULT_INVENTORY_SIZE = 5;
	ArrayList<Item> inventory = new ArrayList<>();

	Player(String name, int health) {
		setName(name);
		setHealth(health);
		setMaxHealth(health);
		setAttackValue(6);

	}

	public void playerAttack(Monster enemy) {
		enemy.damaged(getAttackValue());
	}

	public void addItem(Item item) {

		if (isFull()) {
			System.out.println("Your inventory is full!");
		} else {
			inventory.add(item);
			System.out.println(item.getName() + " was sucessfully added to your inventory.");
		}

	}

	public void useItem(Potions item) {
		if (getHealth() == getMaxHealth()) {
			System.out.println("You are at max health already.");
		} else if (!inventory.contains(item)) {
			System.out.println("You don't have " + item.getName());
		} else {
			healed(item.getHealingValue());
			System.out.println("You drank the potion and was healed for " + item.getHealingValue());
			inventory.remove(item);
		}
	}

	public boolean isFull() {
		if (inventory.size() == DEFAULT_INVENTORY_SIZE) {
			return true;
		}
		return false;
	}

	public void displayInventory() {
		int count = 1;
		if (inventory.isEmpty())
			System.out.println("Inventory is empty");
		else {
			for (Item i : inventory) {
				System.out.println(count++ + ". " + i.getName());
			}
		}
	}

}
