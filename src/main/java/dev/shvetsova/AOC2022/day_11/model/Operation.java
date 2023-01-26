package dev.shvetsova.AOC2022.day_11.model;

import java.util.function.LongBinaryOperator;

public enum Operation implements LongBinaryOperator {
    ADD("\\+", (a, b) -> a + b),
    MULT("\\*", (a, b) -> a * b);

    public String getSing() {
        return sing;
    }

    private final String sing;
    private final LongBinaryOperator operator;

    Operation(String sing, LongBinaryOperator operator) {
        this.sing = sing;
        this.operator = operator;
    }

    public static Operation get(String o) {
        if (o.contains("+")) return ADD;
        if (o.contains("*")) return MULT;
        return null;
    }

    @Override
    public long applyAsLong(long left, long right) {
        return operator.applyAsLong(left, right);
    }
}
