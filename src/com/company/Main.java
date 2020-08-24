package com.company;

import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
/*
        ReadInJson json = new ReadInJson();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben sie bitte den Dateipfad der JSON-Datei an.");
        String path = scanner.nextLine();

        //"C:\\Users\\Philipp.mayer\\Desktop\\Befehlscode.json"
        //C:\Users\janni\Desktop\Befehlscode.json

        json.readJson(path);
*/

        //***************************************************
        //          USEING of JsonArrayParser
        //*******************BEGIN***************************

        //Pfad der json Datei ->Replace durch openfile/eingabefeld
        //final String path = "C:\\Users\\Philipp.mayer\\Desktop\\Befehlscode.json";
        final String path = "C:\\Users\\bohne\\IdeaProjects\\CNC_Frase\\Files\\Json\\Befehlscode.json";
        //Den Parser erstellen
        JsonArrayParser parser = new JsonArrayParser();

        //Liste zum Ausgeben und weiterentwickelen erstellen
        ArrayList<CommandCode> commandArray = parser.parse(path);


        //Testweise mal alle Werte aus der json ausgeben
        for(int i = 0; i<commandArray.size(); i++){
            commandArray.get(i).printValues();
        }
        //*********************END***************************




/*      JETZT IN EXECUTER
        //***************************************************
        //          USEING of SettingsParser
        //*******************BEGIN***************************

        //Pfad der json Datei ->Replace durch openfile/eingabefeld
        final String settingsPath = "C:\\Users\\janni\\iCloudDrive\\DHBW\\S2_Programmieren 2\\Projekt\\A_dateien\\Settings.json";

        //Den Parser erstellen
        JsonSettingsParser settingsParser = new JsonSettingsParser();
        settingsParser.readSettings(settingsPath);
        settingsParser.printSettings();     //ausgabe alle einstellungswerte -> Alle setzbar und holbar
        settingsParser.setHomePosX(5);      //
        settingsParser.printSettings();     //


        //*********************END***************************
*/

    }
}

