package com.company;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * Main Methode zum Ausführen des Fensters um von dortaus über controllerKlasse
 * Aktionen steuern zu können
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
