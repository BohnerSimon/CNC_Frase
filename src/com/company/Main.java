package com.company;

import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
	// write your code here
       
	   ReadInJson json = new ReadInJson();
	   
	   Scanner scanner = new Scanner(System.in);
	   
	   System.out.println("Geben sie bitte den Dateipfad der JSON-Datei an.");
	   String path = scanner.nextLine();
	   
	   //"C:\\Users\\Philipp.mayer\\Desktop\\Befehlscode.json"
	   
	   json.readJson(path);
	   
	   
	   
	   
	   
	   
	   

    }
}

