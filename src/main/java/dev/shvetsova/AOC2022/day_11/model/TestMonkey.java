package dev.shvetsova.AOC2022.day_11.model;

import java.util.HashMap;
import java.util.Map;

public class TestMonkey {
    private final Map<Integer, Monkey> monkeys = new HashMap<>();

    public TestMonkey(String[] inputLines) {
        Parser parser = new Parser();
        for (int i = 0; i < inputLines.length; i += 7) {
            parser.initMonkey(inputLines, i, monkeys);
        }
    }

    public void inspectionRounds(int countTest, boolean isTask1) {
        long productOfTestValues = 1;
        for (Monkey monkey : monkeys.values()) {
            productOfTestValues *= monkey.getDiv();
        }
        for (int i = 0; i < countTest; i++) {
            oneRound(isTask1, productOfTestValues);
        }
    }

    private void oneRound(boolean isTask1, long productOfTestValues) {
        for (Monkey m : monkeys.values()) {
            WorryLevel worryLevel = m.getThings();
            while (!worryLevel.isEmpty()) {
                long newVal = m.monkeyInspection(worryLevel.poll());
                if (!isTask1) {
                    if (newVal > productOfTestValues) newVal %= productOfTestValues;
                } else {
                    newVal /= 3;
                }
                m.test(newVal);
            }
        }
    }

    public long getLevelOfMonkeyBusiness() {
        return monkeys.values().stream()
                .sorted().limit(2)
                .mapToLong(Monkey::getCountTest)
                .reduce(1, (a, b) -> a * b);
    }

}
