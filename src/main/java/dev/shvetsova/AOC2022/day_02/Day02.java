package dev.shvetsova.AOC2022.day_02;

import dev.shvetsova.AOC2022.Puzzle;
import dev.shvetsova.AOC2022.day_02.model.Game;
import dev.shvetsova.AOC2022.utils.Printer;

/**
 * --- Day 2: Rock Paper Scissors ---
 **/
public class Day02 extends Puzzle {
    public static void main(String[] args) {
        Day02 puzzle = new Day02();
        //test input ------------------------------------------
        puzzle.execute(true, true);  //task 1
        puzzle.execute(true, false);//task 2
        //puzzle input ----------------------------------------
        puzzle.execute(false, true); //task 1
        puzzle.execute(false, false); //task 2
    }

    @Override
    protected void execute(boolean isTest, boolean isTask1) {
        super.execute(isTest, isTask1);

        String[] lines = this.getLines();

        int res = 0;
        for (String line : lines) {
            if (line.isBlank()) continue;
            String[] split = line.split(" ");
            Game game = new Game(split[1], split[0]);
            if (isTask1) res += game.getResultStrategyOne();
            else
                res += game.getResultStrategyTwo();
        }
        Printer.printMessage(msg + res);
    }

    @Override
    protected String getDataForCurrentDay() {
        return Day02.class.getSimpleName();
    }
}
