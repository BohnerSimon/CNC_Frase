package com.company;

/**
 * zur Speicherung der einzelnen Kommandobefehle in einer Arraylist diesen Typs.
 * Spätere Manipulation der Werte ist möglich.
 *
 * @author Jannik Orth
 */
public class CommandCode{
    // DatenTyp ArrayList
    private String pos;
    private String befehl;
    private double x;
    private double y;
    private double i;
    private double j;

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getBefehl() {
        return befehl;
    }

    public void setBefehl(String befehl) {
        this.befehl = befehl;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getI() {
        return i;
    }

    public void setI(double i) {
        this.i = i;
    }

    public double getJ() {
        return j;
    }

    public void setJ(double j) {
        this.j = j;
    }

    public void printValues() {
        System.out.println(pos + " " + befehl + " x" + x + " y" + y + " i" + i + " j" + j);
    }

    public CommandCode(String pos, String befehl, double x, double y, double i, double j) {
        this.pos = pos;
        this.befehl = befehl;
        this.x = x;
        this.y = y;
        this.i = i;
        this.j = j;
    }
}
