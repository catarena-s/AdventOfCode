package dev.shvetsova.AOC2022.day_04;

import dev.shvetsova.AOC2022.Puzzle;
import dev.shvetsova.AOC2022.utils.Printer;

import java.io.IOException;

/**
 * --- Day 4: Camp Cleanup ---
 **/
public class Day04 extends Puzzle {
    public static void main(String[] args) {
        Day04 puzzle = new Day04();
        //test input ------------------------------------------
//        puzzle.execute(true, true);//task 1
        puzzle.execute(true, false);//task 2
        //puzzle input ----------------------------------------
//        puzzle.execute(false, true); //task 1
        puzzle.execute(false, false); //task 2
    }

    @Override
    protected void execute(boolean isTest, boolean isTask1) {
        super.execute(isTest, isTask1);
        int res = 0;
        for (String line : this.getLines()) {
            String[] pair = line.split(",");
            Task elf1 = new Task(pair[0]);
            Task elf2 = new Task(pair[1]);

            if (elf1.compare(elf2)) {
                res++;
            }
        }
        Printer.printMessage(msg + res);
    }

    @Override
    protected String getDataForCurrentDay() {
        return Day04.class.getSimpleName();
    }

}
