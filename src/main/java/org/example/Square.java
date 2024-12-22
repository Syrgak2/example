package org.example;

public class Square {
    private int firstSide;
    private int secondSide;
    private int ploshad;

    public Square(int firstSide, int secondSide, int ploshad) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.ploshad = ploshad;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
        this.ploshad = firstSide * secondSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
        this.ploshad = firstSide * secondSide;
    }

    public int getPloshad() {
        return ploshad;
    }

    public void setPloshad(int ploshad) {
        this.ploshad = ploshad;
    }
}
