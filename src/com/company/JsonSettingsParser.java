package com.company;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;


/**
 * Liest die Settings.json Datei aus dem eingegebenen Pfad ein
 * und setzt die darin gespeicherten Werte.
 * Gibt dem Anwender die Möglichkeit alle eingelesenen Werte ausgeben zu lassen
 *
 * @author Jannik Orth
 */
public class JsonSettingsParser {
    // Deklaration aller Einstellfaktoren
    private long homePosX;
    private long homePosY;
    private long speedCooling;
    private long speedNoCooling;
    private long speedNoDrill;
    private long drillDiameter;
    private String surfaceColor;
    private String surfaceDrilledColor;
    private String drillColor;
    private String homePosColor;

    public long getHomePosX() {
        return homePosX;
    }

    public void setHomePosX(long homePosX) {
        this.homePosX = homePosX;
    }

    public long getHomePosY() {
        return homePosY;
    }

    public void setHomePosY(long homePosY) {
        this.homePosY = homePosY;
    }

    public long getSpeedCooling() {
        return speedCooling;
    }

    public void setSpeedCooling(long speedCooling) {
        this.speedCooling = speedCooling;
    }

    public long getSpeedNoCooling() {
        return speedNoCooling;
    }

    public void setSpeedNoCooling(long speedNoCooling) {
        this.speedNoCooling = speedNoCooling;
    }

    public long getSpeedNoDrill() {
        return speedNoDrill;
    }

    public void setSpeedNoDrill(long speedNoDrill) {
        this.speedNoDrill = speedNoDrill;
    }

    public long getDrillDiameter() {
        return drillDiameter;
    }

    public void setDrillDiameter(long drillDiameter) {
        this.drillDiameter = drillDiameter;
    }

    public String getSurfaceColor() {
        return surfaceColor;
    }

    public void setSurfaceColor(String surfaceColor) {
        this.surfaceColor = surfaceColor;
    }

    public String getSurfaceDrilledColor() {
        return surfaceDrilledColor;
    }

    public void setSurfaceDrilledColor(String surfaceDrilledColor) {
        this.surfaceDrilledColor = surfaceDrilledColor;
    }

    public String getDrillColor() {
        return drillColor;
    }

    public void setDrillColor(String drillColor) {
        this.drillColor = drillColor;
    }

    public String getHomePosColor() {
        return homePosColor;
    }

    public void setHomePosColor(String homePosColor) {
        this.homePosColor = homePosColor;
    }


    /*
     * Methode zum Einlesen der gespeicherten Einstellungen
     */
    public void readSettings(String settingsPath) {
        try {
            File settings = new File(settingsPath);

            Object obj = new JSONParser().parse(new FileReader(String.valueOf(settings)));

            JSONObject object = (JSONObject) obj;


            homePosX = (long) object.get("homePosX");
            homePosY = (long) object.get("homePosY");
            speedCooling = (long) object.get("speedCooling");
            speedNoCooling = (long) object.get("speedNoCooling");
            speedNoDrill = (long) object.get("speedNoDrill");
            drillDiameter = (long) object.get("drillDiameter");
            surfaceColor = object.get("surfaceColor").toString();
            surfaceDrilledColor = (String) object.get("surfaceDrilledColor");
            drillColor = object.get("drillColor").toString();
            homePosColor = (String) object.get("homePosColor");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /*
     * Ausgabe aller Einstellungswerte in der Konsole
     */
    public void printSettings() {
        System.out.println("homePosX_" + homePosX);
        System.out.println("homePosY_" + homePosY);
        System.out.println("speedCooling_" + speedCooling);
        System.out.println("speedNoCooling_" + speedNoCooling);
        System.out.println("speedNoDrill_" + speedNoDrill);
        System.out.println("drillDiameter_" + drillDiameter);
        System.out.println("surfaceColor_" + surfaceColor);
        System.out.println("surfaceDrilledColor_" + surfaceDrilledColor);
        System.out.println("drillColor_" + drillColor);
        System.out.println("homePosColor_" + homePosColor);
    }
}
