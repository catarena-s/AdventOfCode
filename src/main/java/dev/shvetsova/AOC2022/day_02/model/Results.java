package dev.shvetsova.AOC2022.day_02.model;

public enum Results {
    WIN(6), LOST(0), DRAW(3);
    private final int value;

    Results(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Results get(String v) {
        switch (v) {
            case "X":
                return LOST;
            case "Y":
                return DRAW;
            case "Z":
                return WIN;
            default:
                return null;
        }
    }
}
