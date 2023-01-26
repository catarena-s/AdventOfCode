package dev.shvetsova.AOC2022.day_10.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CRT {
    protected final String[][] crt = new String[6][40];
    private final Set<Integer> sprite;

    public CRT() {
        sprite = new HashSet<>(Arrays.asList(0, 1, 2));
        for (String[] strings : crt) {
            Arrays.fill(strings, "");
        }
    }

    public void sprintMove(int x) {
        sprite.clear();
        sprite.add(x);
        sprite.add(x - 1);
        sprite.add(x + 1);
    }

    public void draw(int cycle) {
        int line = (cycle - 1) / 40;
        int index = (cycle - 1) % 40;
        crt[line][index] = (sprite.contains(index)) ? "#" : ".";
    }
}
