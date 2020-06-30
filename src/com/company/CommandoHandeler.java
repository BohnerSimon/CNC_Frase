package com.company;

/**
 * Behandlung und abarbeitung der im commandArray gespeichert und zugewiedenen Commands
 *
 * @author Jannik Orth
 */
public class CommandoHandeler extends GUIConfig{

    /*
    Bekommt ein Objekt von CommandoCode übergeben und kann dann auf weitere klassen zugreifen
     */
    public void cutCode(CommandCode paramList) {

        switch (paramList.getBefehl()) {
            case "M00":
                M00(paramList);
                break;
            case "M02":
                M02(paramList);
                break;
            case "M03":
                M03(paramList);
                break;
            case "M04":
                M04(paramList);
                break;
            case "M05":
                M05(paramList);
                break;
            case "M08":
                M08(paramList);
                break;
            case "M09":
                M09(paramList);
                break;
            case "M13":
                M13(paramList);
                break;
            case "M14":
                M14(paramList);
                break;


            case "G00":
                G00(paramList);
                break;
            case "G01":
                G01(paramList);
                break;
            case "G02":
                G02(paramList);
                break;
            case "G03":
                G03(paramList);
                break;
            case "G28":
                G28(paramList);
                break;
        }
    }



    // TODO: 30.06.2020 Implementierung der M und G Befehle -> entweder hier oder in seperater klasse zur berechnung? 
    private void M00(CommandCode paramList) { //Programmhalt
        System.out.println("m00");

        //Spindel aus
        //Vorschub aus
        //Kühlmittel aus
        //Bohrspeed = 0
    }

    private void M02(CommandCode paramList) { //Programm Ende
        System.out.println("m02");
        //Programm Ende
        //Spindel aus
        //Vorschub aus
        //Kühlmittel aus
        //Bohrspeed = 0
    }

    private void M03(CommandCode paramList) { //laufen Uhrzeigersinn
        System.out.println("m03");

        //Spindel ein
        //Vorschub ein?
        //Drehrichtung rechts
        //Bohrspeed = 2
    }

    private void M04(CommandCode paramList) { //laufen gegen Uhrzeigersinn
        System.out.println("m04");
        //Spindel ein
        //Vorschub ein?
        //Drehrichtung links
        //Bohrspeed = 2
    }

    private void M05(CommandCode paramList) { //Spindel aus
        System.out.println("m05");
        //Spindel aus
        //Bohrspeed = 2
    }

    private void M08(CommandCode paramList) { //Kühlung einschalten
        System.out.println("m08");
        //Kühlung ein
        //Bohrspeed = 3
    }

    private void M09(CommandCode paramList) { //Kühlung ausschalten
        System.out.println("m09");
        //Kühlung aus
        //Bohrspeed = 2
    }

    private void M13(CommandCode paramList) { //laufen mit Kühlung rechtsrum
        System.out.println("m13");
        //Spindel ein
        //Vorschub ein?
        //Drehrichtung rechts
        //Kühlmittel an
        //Bohrspeed = 3
    }

    private void M14(CommandCode paramList) { //laufen mit Kühlung linksrum
        System.out.println("m14");
        //Spindel ein
        //Vorschub ein?
        //Drehrichtung links
        //Kühlmittel an
        //Bohrspeed = 3
    }

    private void G00(CommandCode paramList) { //Verfahren im Eilgang
        System.out.println("g00");
        //!!!Nur möglich wenn fräser aus!!!
    }

    private void G01(CommandCode paramList) { //Gerade fräsen
        System.out.println("g01");
        //Gerade
    }

    private void G02(CommandCode paramList) { //Kreis in Uhrzeigersinn
        System.out.println("g02");
        //Kreisinterpolation im Uhrzeigersinn
    }

    private void G03(CommandCode paramList) { //Kreis gegen Uhrzeigersinn
        System.out.println("g03");
        //Kreisinterpolation gegen Uhrzeigersinn
    }

    private void G28(CommandCode paramList) { //Zurück zum start
        System.out.println("g28");
        //Homeposition
    }

}
