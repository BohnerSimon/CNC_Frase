package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.security.Guard;


/**
 * Main Methode zum Ausfuehren des Fensters um von dortaus ueber controllerKlasse
 * Aktionen steuern zu koennen
 *
 * Hier wird nur das Fenster ertellt
 *
 * @author Jannik Orth
 */
public class ExecuteFrame extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("GUI_Config.fxml"));
        primaryStage.setTitle("CNC Simulation");
        primaryStage.setScene(new Scene(root, 1200, 650));
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }

}
