package com.company;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadInJson {

	// Author: Philipp Mayer

	private String path;

	JSONParser jp = new JSONParser();

	public void readJson() {

		try {

			Object obj = jp.parse(new FileReader("‪/Users/Philipp.mayer/Desktop/Testlauf.json"));

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

}
