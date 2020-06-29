package com.company;

public class CommandoHandeler {

    public void cutCode (CommandCode paramList) {

        switch (paramList.getBefehl()) {
            case "M00": //Programmhalt
                M00(paramList);
                break;
            case "M02": //Programm Ende
                M02(paramList);
                break;
            case "M03": // Spindel ein; Rechtslauf
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

    private void M00(CommandCode paramList) { //Programmhalt
        //Spindel aus
        //Vorschub aus
        //Kühlmittel aus
        //Bohrspeed = 0
    }

    private void M02(CommandCode paramList) { //Programm Ende
        //Programm Ende
        //Spindel aus
        //Vorschub aus
        //Kühlmittel aus
        //Bohrspeed = 0
    }

    private void M03(CommandCode paramList) { //laufen Uhrzeigersinn
        //Spindel ein
        //Vorschub ein?
        //Drehrichtung rechts
        //Bohrspeed = 2
    }

    private void M04(CommandCode paramList) { //laufen gegen Uhrzeigersinn
        //Spindel ein
        //Vorschub ein?
        //Drehrichtung links
        //Bohrspeed = 2
    }

    private void M05(CommandCode paramList) { //Spindel aus
        //Spindel aus
        //Bohrspeed = 2
    }

    private void M08(CommandCode paramList) { //Kühlung einschalten
        //Kühlung ein
        //Bohrspeed = 3
    }

    private void M09(CommandCode paramList) { //Kühlung ausschalten
        //Kühlung aus
        //Bohrspeed = 2
    }

    private void M13(CommandCode paramList) { //laufen mit Kühlung rechtsrum
        //Spindel ein
        //Vorschub ein?
        //Drehrichtung rechts
        //Kühlmittel an
        //Bohrspeed = 3
    }

    private void M14(CommandCode paramList) { //laufen mit Kühlung linksrum
        //Spindel ein
        //Vorschub ein?
        //Drehrichtung links
        //Kühlmittel an
        //Bohrspeed = 3
    }

    private void G00(CommandCode paramList) { //Verfahren im Eilgang
        //!!!Nur möglich wenn fräser aus!!!
    }

    private void G01(CommandCode paramList) { //Gerade fräsen
        //Gerade
    }

    private void G02(CommandCode paramList) { //Kreis in Uhrzeigersinn
        //Kreisinterpolation im Uhrzeigersinn
    }

    private void G03(CommandCode paramList) { //Kreis gegen Uhrzeigersinn
        //Kreisinterpolation gegen Uhrzeigersinn
    }

    private void G28(CommandCode paramList) { //Zurück zum start
        //Homeposition
    }


}
