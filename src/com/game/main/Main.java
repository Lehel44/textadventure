package com.game.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Map;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.game.entities.Station;

public class Main {
	public static String stationName = "Station1.txt";
	public static Station station = new Station();

	public static void main(String[] args) {

		View view = new View();
		view.init();

		while (true) {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			// Kezd��llom�s f�jl neve

			JSONParser parser = new JSONParser();
			try {

				// Station beolvas�sa f�jlb�l JSON-be
				Object obj = parser.parse(new FileReader(stationName));
				System.out.println("????");
				// Station tulajdons�gok ment�se
				JSONObject jsonStation = (JSONObject) obj;
				String jsonStory = (String) jsonStation.get("story");
				Map<String, String> jsonExits = (Map) jsonStation.get("exits");
				// Station be�ll�t�sa JSONObject-b�l
				station.setStory(jsonStory);
				station.setExits(jsonExits);
				// Station tulajdons�gok kiirat�sa
				station.printStory();
				station.printExitLabels();
				// JTextArea �s JButtonok be�ll�t�sa
				// view.setStory(jsonStory);
				view.getTextArea().setText(jsonStory);
				int i = 0;
				for (String text : station.getExits().keySet()) {
					if (i == 0) {
						view.getButton1().setText(text);
					}
					if (i == 1) {
						view.getButton2().setText(text);
					}
					if (i == 2) {
						view.getButton3().setText(text);
					}
					i++;
				}
				i = 0;
				// view.getF().revalidate();
				// view.getF().repaint();
//				String line = br.readLine();
//
//				stationName = station.getExits().get(line) + ".txt";
				
			} catch (Exception e) {
				e.printStackTrace();

			}
		}

	}
}