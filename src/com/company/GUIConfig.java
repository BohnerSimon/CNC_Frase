package com.company;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.text.TextFlow;

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
    public Button btnPause;
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

    public TextArea txtAreaLog;


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


            // TODO: 02.07.2020 Übergabe des commandArray an Berechnungsklasse (Commando Hndler -> Ausgabe einer brechneten Form mit den Anweisungen)
            //          hierzu muss klar sein wie wir die ausgabe brauchen um die Fräsung darstellen zu lassen

            // TODO: 02.07.2020 übergabe der Ausgabe der Berechnung an Prüfklasse -> return true/false ob Korrekt oder mit fehler

            // TODO: 02.07.2020 Wenn TRUE rückgabe dann übergabe der berechneten Werte an einen "Painter zur Darstellung"
            //          (for LOOP für jeden schritt etw machen? also auch statusWerte ändern bei m Commands usw.)


            //Ausführen aller Commands todo Thread Sleep zwischdrinne?
            for (int i = 0; i < commandArray.size(); i++) {
                exe.cutCode(commandArray.get(i));

                // TODO: 02.07.2020 Muss in eigenem Thread laufen dass geupdatet wird.
                // Selbig mit der Methode/Klasse zur Darstellung, sonst wird am ende der berechnung alles auf einmal angezeigt
                txtAreaLog.appendText(commandArray.get(i).getBefehl());

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
        // TODO: 30.06.2020 Stoppen des laufenden Programms
    }

    public void handle_btnPause(ActionEvent actionEvent) {
        // TODO: 02.07.2020 Pausieren des laufenden Programms
    }


    public void handle_btnLoadSettings(ActionEvent actionEvent) {
        final String settingsPath = "C:\\Users\\janni\\iCloudDrive\\DHBW\\S2_Programmieren 2\\Projekt\\A_dateien\\Settings.json";

        //Den Parser erstellen
        JsonSettingsParser settingsParser = new JsonSettingsParser();
        settingsParser.readSettings(settingsPath);

        setLabels(settingsParser);

        jsonSettingsLoaded = true;
    }


    public void handle_btnLoadCommands(ActionEvent actionEvent) {
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
