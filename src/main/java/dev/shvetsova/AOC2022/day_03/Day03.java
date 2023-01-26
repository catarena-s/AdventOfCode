package dev.shvetsova.AOC2022.day_03;

import dev.shvetsova.AOC2022.Puzzle;
import dev.shvetsova.AOC2022.day_03.model.Group;
import dev.shvetsova.AOC2022.day_03.model.Priority;
import dev.shvetsova.AOC2022.utils.Printer;

import java.io.IOException;

/**
 * --- Day 3: Rucksack Reorganization ---
 **/
public class Day03 extends Puzzle {

    public static void main(String[] args) {
        Day03 puzzle = new Day03();
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
        Priority priority = new Priority();
        String[] lines = this.getLines();

        int res = 0;
        for (int i = 0; i < lines.length; i += 3) {
            Group group = new Group();
            group.init(lines, i, i + 1, i + 2);
            res += priority.getOrDefault(group.getCommonSubject(), 0);
        }
        Printer.printMessage(msg + res);
    }

    @Override
    protected String getDataForCurrentDay() {
        return Day03.class.getSimpleName();
    }
}
