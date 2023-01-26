package dev.shvetsova.AOC2022.day_11;

import dev.shvetsova.AOC2022.Puzzle;
import dev.shvetsova.AOC2022.day_11.model.TestMonkey;
import dev.shvetsova.AOC2022.utils.Printer;

import java.io.IOException;

/**
 * --- Day 11: Monkey in the Middle ---
 **/
public class Day11 extends Puzzle {
    public static void main(String[] args) {
        Day11 puzzle = new Day11();
        //test input ------------------------------------------
        puzzle.execute(true, true, 20);//task 1
        puzzle.execute(true, false, 20); //task 2
        //puzzle input ----------------------------------------
        puzzle.execute(false,  true, 10_000);//task 1
        puzzle.execute(false,  false, 10_000); //task 2
    }
    private void execute(boolean isTest, boolean isTask1, int count) {
        super.execute(isTest,isTask1);

        TestMonkey monkeys = new TestMonkey(this.getLines());
        monkeys.inspectionRounds(count, isTask1);
        Printer.printMessage(msg + monkeys.getLevelOfMonkeyBusiness());
    }

    @Override
    protected String getDataForCurrentDay() {
        return Day11.class.getSimpleName();
    }
}
