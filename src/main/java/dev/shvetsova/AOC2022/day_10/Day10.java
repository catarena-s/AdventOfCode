package dev.shvetsova.AOC2022.day_10;

import dev.shvetsova.AOC2022.Puzzle;
import dev.shvetsova.AOC2022.day_10.model.CPU;
import dev.shvetsova.AOC2022.utils.Printer;

/** --- Day 10: Cathode-Ray Tube --- **/
public class Day10 extends Puzzle {
    public static void main(String[] args) {
        Day10 puzzle = new Day10();
        //test input ------------------------------------------
        puzzle.execute(true, true); //task 1
        puzzle.execute(true, false); //task 2
        //puzzle input ----------------------------------------
        puzzle.execute(false, true); //task 1
        puzzle.execute(false, false); //task 2
    }

    @Override
    protected void execute(boolean isTest, boolean isTask1) {
        super.execute(isTest, isTask1);

        String[] lines = this.getLines();
        CPU cpu = new CPU();
        cpu.execute(lines);

        if (isTask1)
            Printer.printMessage(msg + cpu.getSum());
        else {
            Printer.printMessage(msg);
            cpu.print();
        }
    }

    @Override
    protected String getDataForCurrentDay() {
        return Day10.class.getSimpleName();
    }
}
