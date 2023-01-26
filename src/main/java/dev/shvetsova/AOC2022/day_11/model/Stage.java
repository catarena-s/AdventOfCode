package dev.shvetsova.AOC2022.day_11.model;

public enum Stage {
    STARTING_ITEMS,
    OPERATION,
    TEST;

    public static Stage get(String item) {
        return switch (item) {
            case "starting items" -> STARTING_ITEMS;
            case "operation" -> OPERATION;
            case "test" -> TEST;
            default -> null;
        };
    }
}
