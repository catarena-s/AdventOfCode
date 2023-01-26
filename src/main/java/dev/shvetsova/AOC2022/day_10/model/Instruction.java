package dev.shvetsova.AOC2022.day_10.model;

public enum Instruction {
    // addx V takes two cycles to complete. After two cycles, the X register is increased by the value V. (V can be negative.)
    ADDX(2),
    //noop takes one cycle to complete. It has no other effect.
    NOOP(1);

    private final int value;

    Instruction(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Instruction get(String trim) {
        return switch (trim) {
            case "addx" -> ADDX;
            case "noop" -> NOOP;
            default -> null;
        };
    }
}
