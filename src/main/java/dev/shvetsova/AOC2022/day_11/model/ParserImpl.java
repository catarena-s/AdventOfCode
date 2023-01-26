package dev.shvetsova.AOC2022.day_11.model;

import java.util.Map;

public class ParserImpl {
//    public int parse(String[] input, Monkey current, int index, Map<Integer, Monkey> allMonkey) {
//        for (int i = index; i < index + 5; i++) {
//            String[] items = input[i].split(":");
//            Stage stage = Stage.get(items[0].trim().toLowerCase());
//            switch (stage) {
//                case STARTING_ITEMS -> current.initMonkeyItems(items);
//                case OPERATION -> current.initOperation(items);
//                case TEST -> {
//                    current.setDiv(Integer.parseInt(items[1].replace("divisible by ", "").trim()));
//
//                    String[] isTrue = input[++i].split(":");
//                    initTestResult(current, allMonkey, isTrue[1], true);
//
//                    String[] isFalse = input[++i].split(":");
//                    initTestResult(current, allMonkey, isFalse[1], false);
//                }
//                default -> {
//                    return index;
//                }
//            }
//        }
//        return index + 4;
//    }

    public void initMonkey(String[] input, int beginIndex, Map<Integer, Monkey> allMonkey) {
        int monkeyIndex = getInt(input[beginIndex]);
        Monkey current = allMonkey.getOrDefault(monkeyIndex, new Monkey());
        allMonkey.put(monkeyIndex, current);

        String[] items = input[beginIndex + 1].split(":");
        current.initMonkeyItems(items);

        items = input[beginIndex + 2].split(":");
        current.initOperation(items);

        items = input[beginIndex + 3].split(":");
        current.setDiv(getInt(items[1]));

        String[] isTrue = input[beginIndex+4].split(":");
        initTestResult(current, allMonkey, isTrue[1], true);

        String[] isFalse = input[beginIndex+5].split(":");
        initTestResult(current, allMonkey, isFalse[1], false);

    }

    private void initTestResult(Monkey current, Map<Integer, Monkey> allMonkey, String throwTo, boolean isTrue) {
        int nextMonkeyIndex = getInt(throwTo);
        Monkey next = allMonkey.getOrDefault(nextMonkeyIndex, new Monkey());
        if (isTrue) {
            current.setIfTrue(next);
        } else {
            current.setIfFalse(next);
        }
        allMonkey.put(nextMonkeyIndex, next);
    }

    private int getInt(String inputLine) {
        return Integer.parseInt(clearString(inputLine.trim()));
    }

    private String clearString(String inputLine) {
        return inputLine.replaceAll("\\D", "");
    }
}
