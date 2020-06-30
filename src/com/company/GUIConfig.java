package com.company;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;

/**
 * ControllerKlasse für fxml Datei
 * Hier werden ActionListener von Buttons etc. initialisiert
 *
 * @author Jannik Orth
 */
public class GUIConfig {
    public Button btnLoadSettings;
    public Button btnLoadCommands;
    public Button btnStart;
    public Button btnStop;
    public Label lblFraser;
    public Label lblDrehrichtung;
    public Label lblKuhlung;
    public Label lblSpeed;
    public Label lblHomePosX;
    public Label lblHomePosY;
    public Label lblSpeedCooling;
    public Label lblSpeedNoCooling;
    public Label lblSpeedNoDrill;
    public Label lblDrillDiameter;
    public Label lblSurfaceColor;
    public Label lblSurfaceDrilledColor;
    public Label lblDrillColor;
    public Label lblHomePosColor;

    public void handle_btnStart(ActionEvent actionEvent) {
    }

    public void handle_btnStop(ActionEvent actionEvent) {
    }

    public void handle_btnLoadSettings(ActionEvent actionEvent) {
        final String settingsPath = "C:\\Users\\janni\\iCloudDrive\\DHBW\\S2_Programmieren 2\\Projekt\\A_dateien\\Settings.json";

        //Den Parser erstellen
        JsonSettingsParser settingsParser = new JsonSettingsParser();
        settingsParser.readSettings(settingsPath);

        lblHomePosX.setText(Long.toString(settingsParser.getHomePosX()));
        lblHomePosY.setText(Long.toString(settingsParser.getHomePosY()));
        lblSpeedCooling.setText(Long.toString(settingsParser.getSpeedCooling()));
        lblSpeedNoCooling.setText(Long.toString(settingsParser.getSpeedNoCooling()));
        lblSpeedNoDrill.setText(Long.toString(settingsParser.getSpeedNoDrill()));
        lblDrillDiameter.setText(Long.toString(settingsParser.getDrillDiameter()));
        lblSurfaceColor.setText(settingsParser.getSurfaceColor());
        lblSurfaceDrilledColor.setText(settingsParser.getSurfaceDrilledColor());
        lblDrillColor.setText(settingsParser.getDrillColor());
        lblHomePosColor.setText(settingsParser.getHomePosColor());
    }

    public void handle_btnloadCommands(ActionEvent actionEvent) {
        final String path = "C:\\Users\\janni\\iCloudDrive\\DHBW\\S2_Programmieren 2\\Projekt\\A_dateien\\Befehlscode.json";

        //Den Parser erstellen
        JsonArrayParser parser = new JsonArrayParser();

        //Liste zum Ausgeben und weiterentwickelen erstellen
        ArrayList<CommandCode> commandArray = parser.parse(path);


        //Testweise mal alle Werte aus der json ausgeben
        for(int i = 0; i<commandArray.size(); i++){
            commandArray.get(i).printValues();
        }
    }
}
