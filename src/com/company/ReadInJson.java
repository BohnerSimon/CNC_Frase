package com.company;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadInJson {

	// Author: Philipp Mayer

	private String path;

	JSONParser parser = new JSONParser();

	public void readJson() {

		try {

			// Datei mit Pfad einlesen
			Object object = parser.parse(new FileReader("‪/Users/Philipp.mayer/Desktop/Testlauf.json"));

			// Erstellen eines Json-Objektes
			JSONObject jsonObject = (JSONObject) object;

			// Json Array, welches java.util.list unterstützt
			JSONArray commandListJson = (JSONArray) jsonObject.get("s");

			//
			ArrayList<CommandCode> commandsList = new ArrayList<CommandCode>();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
