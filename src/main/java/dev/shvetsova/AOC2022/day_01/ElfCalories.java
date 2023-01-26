package dev.shvetsova.AOC2022.day_01;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Comparator;
import java.util.HashMap;

@Getter
@EqualsAndHashCode
public class ElfCalories extends HashMap<Integer, Integer> {
    private int maxCalories = 0;
    private int elfHasMostCalories = 0;

    public void init(final String[] lines) {
        int totalCalories = 0;
        int elfIndex = 1;
        for (String line : lines) {
            if (line.isBlank()) {
                put(elfIndex++, totalCalories);
                totalCalories = 0;
                continue;
            }
            totalCalories += Integer.parseInt(line.trim());
            if (totalCalories > maxCalories) {
                maxCalories = totalCalories;
                elfHasMostCalories = elfIndex;
            }
        }
    }

    public int getSumTopThreeElves() {
        return values().stream()
                .sorted(Comparator.reverseOrder()) // сортировка по возрастанию
                .limit(3).mapToInt(a -> a).sum();
    }
}
