package dev.shvetsova.AOC2022.day_03.model;

import java.util.HashMap;

public class Priority extends HashMap<Character, Integer> {
    public Priority() {
       init('a', 1);
       init('A', 27);
    }

    private void init(char elem, int def) {
        put(elem, def);
        for (int i = 1; i < 26; i++) {
            char e = (char) (elem + i);
            put(e, i + def);
        }
    }
}
