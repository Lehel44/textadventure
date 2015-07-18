package com.game.entities;

public class Item {
	
	protected String name;
	protected int healthValue;
	protected int attackValue;
	protected int defenseValue;
	protected int luckValue;
	protected int swiftnessValue;
	
	/**
	 * Konstruktor.
	 */
	public Item() {
	}

	public Item(String name, int healthValue, int attackValue,
			int defenseValue, int luckValue, int swiftnessValue) {
		super();
		this.name = name;
		this.healthValue = healthValue;
		this.attackValue = attackValue;
		this.defenseValue = defenseValue;
		this.luckValue = luckValue;
		this.swiftnessValue = swiftnessValue;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealthValue() {
		return healthValue;
	}

	public void setHealthValue(int healthValue) {
		this.healthValue = healthValue;
	}

	public int getAttackValue() {
		return attackValue;
	}

	public void setAttackValue(int attackValue) {
		this.attackValue = attackValue;
	}

	public int getDefenseValue() {
		return defenseValue;
	}

	public void setDefenseValue(int defenseValue) {
		this.defenseValue = defenseValue;
	}

	public int getLuckValue() {
		return luckValue;
	}

	public void setLuckValue(int luckValue) {
		this.luckValue = luckValue;
	}

	public int getSwiftnessValue() {
		return swiftnessValue;
	}

	public void setSwiftnessValue(int swiftnessValue) {
		this.swiftnessValue = swiftnessValue;
	}
	
	/**
	 * Kiírja egy item statisztikáit.
	 */
	public void printItem() {
		System.out.println("\n");
		System.out.println(name);
		System.out.println("Életerõ: " + healthValue);
		System.out.println("Támadóérték: " + attackValue);
		System.out.println("Védekezés: " + defenseValue);
		System.out.println("Gyorsaság: " + swiftnessValue);
		System.out.println("Szerencse: " + luckValue);
		System.out.println("----------------------");
	}
	
	
}
