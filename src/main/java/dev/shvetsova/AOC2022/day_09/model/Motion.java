package dev.shvetsova.AOC2022.day_09.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Motion {
    RIGHT(1, 0),
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0);

    private final int dx;
    private final int dy;

    public static Motion get(final String input) {
        return switch (input) {
            case "R" -> RIGHT;
            case "U" -> UP;
            case "D" -> DOWN;
            case "L" -> LEFT;
            default -> throw new RuntimeException("Wrong motion command");
        };
    }
}
