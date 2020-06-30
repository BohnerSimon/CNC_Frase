package com.company;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
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
    public ArrayList<CommandCode> commandArray;

    private boolean jsonCommandsLoaded = false;
    private boolean jsonSettingsLoaded = false;

    public void handle_btnStart(ActionEvent actionEvent) throws InterruptedException {
        // TODO: 30.06.2020 Startknopf zum ausführen der commands
        // new Status
        if(jsonCommandsLoaded && jsonSettingsLoaded) {
            CommandoHandeler exe = new CommandoHandeler();


        /*
        mit jeder Abfrage ien Status erstekllen und die KoordinatenListe ausgeben und dann nach ausgabe des
        CommandoHandler über bspWeise einen "painter" die koordianten
        abrufen und malen
        status lables updaten?
         */


            //Ausführen aller Commands todo Thread Sleep zwischdrinne?
            for (int i = 0; i < commandArray.size(); i++) {
                exe.cutCode(commandArray.get(i));
                //Thread.sleep(500);
            }

        }else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ein Fehler ist augetreten");
            alert.setHeaderText("Die Commands oder Settings JSON Datei ist nicht eingelesen.");
            alert.setContentText("Vergewissere dich dass du alles eingelesen hast bevor du startest.");

            alert.showAndWait();
        }
    }


    public void handle_btnStop(ActionEvent actionEvent) {
        // TODO: 30.06.2020 Stoppen des Programms/ evtl auch pausieren erstmal
    }

    public void handle_btnLoadSettings(ActionEvent actionEvent) {
        final String settingsPath = "C:\\Users\\janni\\iCloudDrive\\DHBW\\S2_Programmieren 2\\Projekt\\A_dateien\\Settings.json";

        //Den Parser erstellen
        JsonSettingsParser settingsParser = new JsonSettingsParser();
        settingsParser.readSettings(settingsPath);

        setLabels(settingsParser);

        jsonSettingsLoaded = true;
    }

    public void handle_btnloadCommands(ActionEvent actionEvent) {
        final String path = "C:\\Users\\janni\\iCloudDrive\\DHBW\\S2_Programmieren 2\\Projekt\\A_dateien\\Befehlscode.json";

        //Den Parser erstellen
        JsonArrayParser parser = new JsonArrayParser();

        //Liste zum Ausgeben und weiterentwickelen erstellen
        commandArray = parser.parse(path);

        jsonCommandsLoaded = true;

        //Testweise mal alle Werte aus der json ausgeben
        for(int i = 0; i<commandArray.size(); i++){
            commandArray.get(i).printValues();
        }
    }



    private void setLabels(JsonSettingsParser settingsParser){
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
}
