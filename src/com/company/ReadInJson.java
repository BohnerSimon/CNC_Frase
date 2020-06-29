package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadInJson {

	// Author: Philipp Mayer

	JSONParser parser = new JSONParser();

	public void readJson(String path) {

		try {

			// Datei mit Pfad einlesen
			Object object = parser.parse(new FileReader(path));

			// Erstellen eines Json-Objektes
			JSONObject jsonCommands = (JSONObject) object;

			//JSONObject jsonSingle =(JSONObject) jsonCommands.get("commands");


			// Json Array, welches java.util.list unterstützt, in dem alle Befehle gespeichert werden
			JSONArray commandsList = (JSONArray) jsonCommands.get("commands");





			for (int i = 0; i < commandsList.size(); i++) {

				System.out.println(commandsList.get(i));

			}



			
			
			//So sieht das JSON-Array ausgegeben aus
//			{"number":"N0010","code":"M03","parameters":{}}
//			{"number":"N0020","code":"M08","parameters":{}}
//			{"number":"N0030","code":"G01","parameters":{"x":0,"y":100}}
//			{"number":"N0040","code":"G02","parameters":{"x":0,"y":10,"i":0,"j":5}}

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
