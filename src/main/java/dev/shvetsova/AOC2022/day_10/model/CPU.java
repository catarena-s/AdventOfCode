package dev.shvetsova.AOC2022.day_10.model;

import dev.shvetsova.AOC2022.utils.Printer;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CPU {
    private final CRT crt = new CRT();
    private int x = 1;
    private int sum = 0;

    public int getSum() {
        return sum;
    }

    public void execute(final String[] lines) {
        int cyrcleIndex = 0;
        for (String line : lines) {
            String[] com = line.split(" ");
            Instruction instruction = Instruction.get(com[0].trim());
            cyrcleIndex = cyrcle(instruction, cyrcleIndex, com.length == 2 ? Integer.parseInt(com[1]) : 0);
        }
    }

    private int getSignal(final int x, final int cyrcleIndex) {
        return x * cyrcleIndex;
    }

    private int cyrcle(final Instruction instruction, int cyrcleIndex, final int val) {
        final Set<Integer> it = new HashSet<>(Arrays.asList(20, 60, 100, 140, 180, 220));
        for (int i = 0; i < instruction.getValue(); i++) {
            cyrcleIndex++;
            crt.draw(cyrcleIndex);
            if (it.contains(cyrcleIndex)) {
                sum += getSignal(x, cyrcleIndex);
            }
        }
        x += val;
        crt.sprintMove(x);
        return cyrcleIndex;
    }

    public void print() {
        for (String[] s : crt.crt) {
            Printer.printMessage(Arrays.toString(s).replace(",", ""));
        }
    }
}
