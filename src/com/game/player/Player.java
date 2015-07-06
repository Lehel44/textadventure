package com.game.player;

import java.util.HashMap;
import java.util.Map;

import com.game.entities.Item;
 
public class Player {
	
	private String name;
	private int health = 100;
	private int attack = 0;
	private int defense = 0;
	private int luck = 0;
	private int swiftness = 0;
	private Map<String, Item> inventory;
	private int skillPoints = 20;
	
	public Player() {
		inventory = new HashMap<>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	public int getLuck() {
		return luck;
	}
	
	public void setLuck(int luck) {
		this.luck = luck;
	}
	
	public int getSkillPoints() {
		return skillPoints;
	}
	
	public void setSkillPoints(int skillPoints) {
		this.skillPoints = skillPoints;
	}
	
	public int getSwiftness() {
		return swiftness;
	}
	
	public void setSwiftness(int swiftness) {
		this.swiftness = swiftness;
	}
	
	
	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public void setInventory(Map<String, Item> inventory) {
		this.inventory = inventory;
	}
	
	
	public Map<String, Item> getInventory() {
		return inventory;
	}

	public void printSkillPoints() {
		System.out.println("Elosztható pontjaid: " + skillPoints);
	}
	
	public void printStats() {
		System.out.println(name);
		System.out.println("-----------------------");
		System.out.println("Életerõ: " + health);
		System.out.println("Támadóerõ: " + attack);
		System.out.println("Védekezés: " + defense);
		System.out.println("Gyorsaság: " + swiftness);
		System.out.println("Szerencse: " + luck);
		System.out.println("\n");
	}
	
	public void printInventory() {
		for(Item item : inventory.values()) {
			item.printItem();
		}
	}
}
