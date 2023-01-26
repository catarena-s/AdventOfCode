package dev.shvetsova.AOC2022.day_09.model;

public enum Motion {
    RIGHT(1,0),
    UP(0,1),
    DOWN(0,-1),
    LEFT(-1,0);

    private final int dx;
    private final int dy;

    public int getDx() {
        return dx;
    }

    public int getDy() {
        return dy;
    }

    Motion(final int dx, final int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public static Motion get(final String input) throws Exception {
        return switch (input) {
            case "R" -> RIGHT;
            case "U" -> UP;
            case "D" -> DOWN;
            case "L" -> LEFT;
            default -> throw new Exception("Wrong motion command");
        };
    }
}
