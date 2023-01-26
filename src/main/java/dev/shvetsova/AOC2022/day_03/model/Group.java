package dev.shvetsova.AOC2022.day_03.model;

import java.util.HashSet;
import java.util.Set;

public class Group {
    private final Set<Character> rucksack1 = new HashSet<>();
    private final Set<Character> rucksack2 = new HashSet<>();
    private final Set<Character> rucksack3 = new HashSet<>();

    public void init(String[] lines, int first, int second, int third) {
        initSet(lines[first], rucksack1);
        initSet(lines[second], rucksack2);
        initSet(lines[third], rucksack3);
    }

    private void initSet(String lines, Set<Character> rucksack) {
        for (char c : lines.toCharArray()) {
            rucksack.add(c);
        }
    }

    public Character getCommonSubject() {
        rucksack1.retainAll(rucksack2);
        rucksack3.retainAll(rucksack2);
        rucksack3.retainAll(rucksack1);
        return rucksack3.stream().findFirst().orElse(' ');
    }
}
