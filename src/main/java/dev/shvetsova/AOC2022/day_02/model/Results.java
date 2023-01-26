package dev.shvetsova.AOC2022.day_02.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Results {
    WIN(6), LOST(0), DRAW(3);
    private final int value;

    public static Results get(String v) {
        return switch (v) {
            case "X" -> LOST;
            case "Y" -> DRAW;
            case "Z" -> WIN;
            default -> null;
        };
    }
}
