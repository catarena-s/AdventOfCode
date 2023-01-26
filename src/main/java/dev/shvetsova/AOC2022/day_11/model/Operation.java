package dev.shvetsova.AOC2022.day_11.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.LongBinaryOperator;
@Getter
@RequiredArgsConstructor
public enum Operation implements LongBinaryOperator {
    ADD("\\+", Long::sum),
    MULT("\\*", (a, b) -> a * b);

    private final String sing;
    private final LongBinaryOperator operator;

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
