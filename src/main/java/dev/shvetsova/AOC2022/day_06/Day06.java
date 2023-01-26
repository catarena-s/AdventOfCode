package dev.shvetsova.AOC2022.day_06;

import dev.shvetsova.AOC2022.Puzzle;
import dev.shvetsova.AOC2022.utils.Printer;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/** --- Day 6: Tuning Trouble --- **/
public class Day06 extends Puzzle {
    public static void main(String[] args) {
        Day06 puzzle = new Day06();
        //test input ------------------------------------------
//        puzzle.execute(true, true);//task 1
        puzzle.execute(true, false, 14);//task 2
        //puzzle input ----------------------------------------
//         puzzle.execute(false, true,7); //task 1
        puzzle.execute(false, false, 14); //task 2
    }

    private void execute(boolean isTest, boolean isTask1, int size) {
        super.execute(isTest, isTask1);

        Deque<String> deque = new ArrayDeque<>(List.of(this.getInputString().split("")));
        Deque<String> marker = new ArrayDeque<>();
        while (marker.size() < size) {
            String s1 = deque.pop();
            while (marker.contains(s1)) {
                marker.removeFirst();
            }
            marker.addLast(s1);
        }
        Printer.printMessage(msg + (this.getInputString().length() - deque.size()));

    }


    @Override
    protected String getDataForCurrentDay() {
        return Day06.class.getSimpleName();
    }
}
