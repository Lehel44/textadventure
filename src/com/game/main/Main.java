package com.game.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.game.entities.Station;
import com.game.fight.Fight;
import com.game.player.Player;

public class Main {

	public static void main(String[] args) {

		//Egy Player �s egy enemy l�trehoz�sa
		Player player = new Player();
		player.setAttack(35);
		player.setHealth(100);
		player.setName("M�t� : player");
		//TEST COMMIT
		Player enemy = new Player();
		enemy.setAttack(23);
		enemy.setHealth(100);
		enemy.setName("Lehel : az istencs�sz�r enemy");
		
		//Fight l�trehoz�sa
		Fight fight = new Fight();
		
		//Player �s enemy hozz�ad�sa a fight-hoz
		fight.setPlayer(player);
		fight.setEnemy(enemy);
		
		//�llom�s l�trehoz�sa
		Station station1 = new Station();
		Station station2 = new Station();
		Station station3 = new Station();
		Station station4 = new Station();
		
		//Station1
		station1.setStory("Melyik utat v�lasztod?");
		station1.getExits().put("Bal", station2);
		station1.getExits().put("K�z�ps�", station3);
		station1.getExits().put("Jobb", station4);
		// Fight hozz�ad�sa Station 1-hez
		station1.setFight(fight);
		
		//Station2
		station2.setStory("Melyik ajt�t v�lasztod?");
		station2.getExits().put("Piros", station2);
		station2.getExits().put("K�k", station3);
		station2.getExits().put("Z�ld", station1);
		station2.setFight(fight);
		
		//Kiindul� �llom�s
		station1.printStory();
		station1.getFight().doFight(station1.getFight().getPlayer(), station1.getFight().getEnemy());
		station1.printExitLabels();
		
		//Utols� �llom�s
		Station lastStation = station1;
		
		while(true) {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			try {
				// K�vetkez� �llom�s beolvas�sa
				String line = br.readLine();
				// K�vetkez� �llom�s bet�lt�se
				lastStation = lastStation.getExits().get(line);
				// Jelenlegi �llom�s sztorij�nak kiirat�sa
				lastStation.printStory();
				// Ha van fight, akkor �rjuk ki
				if(lastStation.getFight() != null) {
					System.out.println("FIGHT ELKEZDVE!");
					//Elind�tja a fightot, k�t player param�terrel
					lastStation.getFight().doFight(lastStation.getFight().getPlayer(), lastStation.getFight().getEnemy());
				}
				else {
					System.out.println("lasStation.getfight == null");
				}
				lastStation.printExitLabels();

			} catch (IOException e) {
				e.printStackTrace();
			} 
		}

	}

}
