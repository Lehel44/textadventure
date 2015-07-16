package com.game.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.game.entities.Station;
import com.game.fight.Fight;
import com.game.player.Player;

public class Main {

	public static void main(String[] args) {

		//Egy Player és egy enemy létrehozása
		Player player = new Player();
		player.setAttack(35);
		player.setHealth(100);
		player.setName("Máté : player");
		//TEST COMMIT
		Player enemy = new Player();
		enemy.setAttack(23);
		enemy.setHealth(100);
		enemy.setName("Lehel : az istencsászár enemy");
		
		//Fight létrehozása
		Fight fight = new Fight();
		
		//Player és enemy hozzáadása a fight-hoz
		fight.setPlayer(player);
		fight.setEnemy(enemy);
		
		//Állomás létrehozása
		Station station1 = new Station();
		Station station2 = new Station();
		Station station3 = new Station();
		Station station4 = new Station();
		
		//Station1
		station1.setStory("Melyik utat választod?");
		station1.getExits().put("Bal", station2);
		station1.getExits().put("Középsõ", station3);
		station1.getExits().put("Jobb", station4);
		// Fight hozzáadása Station 1-hez
		station1.setFight(fight);
		
		//Station2
		station2.setStory("Melyik ajtót választod?");
		station2.getExits().put("Piros", station2);
		station2.getExits().put("Kék", station3);
		station2.getExits().put("Zöld", station1);
		station2.setFight(fight);
		
		//Kiinduló állomás
		station1.printStory();
		station1.getFight().doFight(station1.getFight().getPlayer(), station1.getFight().getEnemy());
		station1.printExitLabels();
		
		//Utolsó állomás
		Station lastStation = station1;
		
		while(true) {
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			try {
				// Következõ állomás beolvasása
				String line = br.readLine();
				// Következõ állomás betöltése
				lastStation = lastStation.getExits().get(line);
				// Jelenlegi állomás sztorijának kiiratása
				lastStation.printStory();
				// Ha van fight, akkor írjuk ki
				if(lastStation.getFight() != null) {
					System.out.println("FIGHT ELKEZDVE!");
					//Elindítja a fightot, két player paraméterrel
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
