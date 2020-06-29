package com.company;

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

        //Pfad der json Datei
        final String path = "C:\\Users\\janni\\Desktop\\Befehlscode.json";

        //Den Parser erstellen
        JsonArrayParser parser = new JsonArrayParser();

        //Liste zum Ausgeben und weiterentwickelen erstellen
        ArrayList<CommandCode> commandArray = parser.parse(path);


        //Testweise mal alle Werte aus der json ausgeben
        for(int i = 0; i<commandArray.size(); i++){
            commandArray.get(i).printValues();
        }

        //*********************END***************************



    }
}

