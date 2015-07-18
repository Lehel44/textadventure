package com.game.fight;

import java.util.Random;

import com.game.player.Player;

public class Fight {
	
	Player player;
	Player enemy;
	
	Random random;
	int x;
	
	public Fight() {
		random = new Random();
		// 1 vagy 0
		x = random.nextInt(2); 
	}
	
	
	public Player getPlayer() {
		return player;
	}



	public void setPlayer(Player player) {
		this.player = player;
	}



	public Player getEnemy() {
		return enemy;
	}



	public void setEnemy(Player enemy) {
		this.enemy = enemy;
	}


	// Harc szimul�ci�
	public void doFight(Player player, Player enemy) {
			String whoFirst, whoSecond;
			Player first, second;
			System.out.println("Random sz�m: " + x);
			if(x == 1) {
				System.out.println("Te kezdesz.");
				first = player;
				second = enemy;
				whoFirst = player.getName();
				whoSecond = enemy.getName();
			}
			else {
				System.out.println("Az ellenf�l kezd \n");
				first = enemy;
				second = player;
				whoFirst = enemy.getName();
				whoSecond = player.getName();
			}
			while(player.getHealth() > 0 && enemy.getHealth() > 0) {
			System.out.println(whoFirst + " t�mad");
			System.out.println("_______________________");
			attack(first, second);
			second.printStats();
			System.out.println(whoSecond + " t�mad");
			System.out.println("_______________________");
			attack(second, first);
			first.printStats();
		}
		
		
		
	}
	
	// Sebz�s
	public void attack(Player attacker, Player defender) {
		defender.setHealth(defender.getHealth() - attacker.getAttack());
	}
	
}
