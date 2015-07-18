package com.game.entities;

import java.util.HashMap;
import java.util.Map;

import com.game.fight.Fight;

public class Station {

	private String story;
	private Map<String, String> exits;
	private Fight fight;
	
	
	public Station() {
		exits = new HashMap<>();
	}

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}


	public Map<String, String> getExits() {
		return exits;
	}

	public void setExits(Map<String, String> exits) {
		this.exits = exits;
	}
	
	public Fight getFight() {
		return fight;
	}

	public void setFight(Fight fight) {
		this.fight = fight;
	}

	public void printStory() {
		System.out.println(story);
	}
	
	public void printExitLabels() {
		for(String s : exits.keySet()) {
			System.out.print(s + "   ");
		}
		System.out.println();
	}
	
	@Override
	public String toString() {
		return this.getClass().getName();
	}
	
}

