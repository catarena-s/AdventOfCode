package dev.shvetsova.AOC2022.day_09;

import dev.shvetsova.AOC2022.Puzzle;
import dev.shvetsova.AOC2022.day_09.model.RopeBridge;
import dev.shvetsova.AOC2022.utils.Printer;

/**
 * --- Day 9: Rope Bridge ---
 **/
public class Day09 extends Puzzle {

    public static void main(String[] args) {
        Day09 puzzle = new Day09();
        //test input ------------------------------------------
        puzzle.execute(true, true, "");//task 1
        puzzle.execute(true, false, "_2"); //task 2
        //puzzle input ----------------------------------------
        puzzle.execute(false, true, "");//task 1
        puzzle.execute(false, false, ""); //task 2
    }

    @Override
    protected void execute(boolean isTest, boolean isTask1, String suffix) {
        super.execute(isTest, isTask1, suffix);

        try {
            RopeBridge bridge = new RopeBridge(this.getLines(), isTask1 ? 1 : 9);
            Printer.printMessage(msg + bridge.getTailWay());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected String getDataForCurrentDay() {
        return Day09.class.getSimpleName();
    }
}
