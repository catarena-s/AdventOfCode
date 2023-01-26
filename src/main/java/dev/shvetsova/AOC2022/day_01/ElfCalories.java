package dev.shvetsova.AOC2022.day_01;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;

public class ElfCalories extends HashMap<Integer, Integer> {
    int maxCalories = 0;
    int elfHasMostCalories = 0;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ElfCalories that = (ElfCalories) o;
        return maxCalories == that.maxCalories && elfHasMostCalories == that.elfHasMostCalories;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxCalories, elfHasMostCalories);
    }

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
