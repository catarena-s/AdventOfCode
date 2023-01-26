package dev.shvetsova.AOC2022;

import dev.shvetsova.AOC2022.day_01.Day01;
import dev.shvetsova.AOC2022.day_02.Day02;
import dev.shvetsova.AOC2022.day_03.Day03;
import dev.shvetsova.AOC2022.day_04.Day04;
import dev.shvetsova.AOC2022.day_05.Day05;
import dev.shvetsova.AOC2022.day_06.Day06;
import dev.shvetsova.AOC2022.day_07.Day07;
import dev.shvetsova.AOC2022.day_08.Day08;
import dev.shvetsova.AOC2022.day_09.Day09;
import dev.shvetsova.AOC2022.day_10.Day10;
import dev.shvetsova.AOC2022.day_11.Day11;
import dev.shvetsova.AOC2022.utils.Printer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) throws Exception {
        printAllPuzzles();
//printDays();
    }

    void createPaths() {
           /*     String fileStr = Puzzle.PUZZLE_INPUT_PATH;//+Puzzle.TEST_INPUT_FILE;
//        String fileStr2 ="src/dev/shvetsova/AdventOfCode2022/resources/";//+Puzzle.TEST_INPUT_FILE;

//        for (int i = 4; i < 26; i++) {
//            Path fileTarger = Paths.get(String.format(fileStr,i));
//            if(!Files.isDirectory(fileTarger)) {
//                Files.delete(fileTarger);
//                Files.createDirectories(fileTarger);
//            }
//        }

        for (int i = 1; i < 26; i++) {
            String fileName = String.format(Puzzle.TEST_INPUT_FILE, String.format("Day%02d", i), "");
//            Path fileSource = Path.of(fileStr2 + fileName);
//            Path fileTarger = Paths.get(String.format(fileStr + fileName, i));
            Path file = Path.of(String.format(fileStr, i, fileName));
//            Files.createFile(file);
            if (!Files.isExecutable(file)) {
                Files.createFile(file);
//                Files.copy(fileSource, fileTarger, StandardCopyOption.REPLACE_EXISTING);
                //  Files.copy(fileTarger, fileSource);
            }
        }
*/
//            Path file = Path.of(String.format(fileStr+"/test", i));
//            Path file = Path.of(String.format(fileStr, i));
//            Files.createFile(file);
//            Files.createDirectories(file);

//        }
    }

    private static void printAllPuzzles() throws Exception {
        Printer.printMessage("---------------------Day 1---------------------");
        Day01.main(new String[1]);
        Printer.printMessage("---------------------Day 2---------------------");
        Day02.main(new String[1]);
        Printer.printMessage("---------------------Day 3---------------------");
        Day03.main(new String[1]);
        Printer.printMessage("---------------------Day 4---------------------");
        Day04.main(new String[1]);
        Printer.printMessage("---------------------Day 5---------------------");
        Day05.main(new String[1]);
        Printer.printMessage("---------------------Day 6---------------------");
        Day06.main(new String[1]);
        Printer.printMessage("---------------------Day 7---------------------");
        Day07.main(new String[1]);
        Printer.printMessage("---------------------Day 8---------------------");
        Day08.main(new String[1]);
        Printer.printMessage("---------------------Day 9---------------------");
        Day09.main(new String[1]);
        Printer.printMessage("---------------------Day 10---------------------");
        Day10.main(new String[1]);
        Printer.printMessage("---------------------Day 11---------------------");
        Day11.main(new String[1]);
        Printer.printMessage("---------------------Day 12---------------------");
        // Day12.main(new String[1]);
        Printer.printMessage("---------------------Day 13---------------------");
        //Day13.main(new String[1]);
        Printer.printMessage("---------------------Day 14---------------------");
        //Day14.main(new String[1]);
        Printer.printMessage("---------------------Day 15---------------------");
        //Day15.main(new String[1]);
        Printer.printMessage("---------------------Day 16---------------------");
        //Day16.main(new String[1]);
        Printer.printMessage("---------------------Day 17---------------------");
        //Day17.main(new String[1]);
        Printer.printMessage("---------------------Day 18---------------------");
        //Day18.main(new String[1]);
        Printer.printMessage("---------------------Day 19---------------------");
        //Day19.main(new String[1]);
        Printer.printMessage("---------------------Day 20---------------------");
        //Day20.main(new String[1]);
        Printer.printMessage("---------------------Day 21---------------------");
        //Day21.main(new String[1]);
        Printer.printMessage("---------------------Day 22---------------------");
        //Day22.main(new String[1]);
        Printer.printMessage("---------------------Day 23---------------------");
        //Day23.main(new String[1]);
        Printer.printMessage("---------------------Day 24---------------------");
        //Day24.main(new String[1]);
        Printer.printMessage("---------------------Day 25---------------------");
        //Day25.main(new String[1]);


    }

    private static void printDays() {
        for (int i = 13; i < 26; i++) {
            System.out.printf(" Printer.printMessage(\"---------------------Day %d---------------------\");\n", i);
            System.out.printf(" //Day%d.main(new String[1]);\n", i);
            // System.out.printf("<a href=\"https://adventofcode.com/2022/day/%d\">Day %1$d</a><br>\n",i);
            // System.out.printf("[Day %d](https://adventofcode.com/2022/day/%1$d)    \n",i);
        }
    }

    public static void createDirectory() throws IOException {
        String str = "src/dev/shvetsova/AdventOfCode2022/day_%d/model/";
        for (int i = 10; i < 26; i++) {
            Path file = Path.of(String.format(str, i));
            Files.createDirectories(file);
        }
    }

    /*

    "C:\Program Files\Java\jdk-18.0.1.1\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.2\lib\idea_rt.jar=52055:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2022.1.2\bin" -Dfile.encoding=windows-1251 -classpath F:\YandexPracticum\AdventOfCode2022\out\production\AdventOfCode2022 dev.shvetsova.AOC2022.Main
[Day 1](https://adventofcode.com/2022/day/1)
[Day 2](https://adventofcode.com/2022/day/2)
[Day 3](https://adventofcode.com/2022/day/3)
[Day 4](https://adventofcode.com/2022/day/4)
[Day 5](https://adventofcode.com/2022/day/5)
[Day 6](https://adventofcode.com/2022/day/6)
[Day 7](https://adventofcode.com/2022/day/7)
[Day 8](https://adventofcode.com/2022/day/8)
[Day 9](https://adventofcode.com/2022/day/9)
[Day 10](https://adventofcode.com/2022/day/10)
[Day 11](https://adventofcode.com/2022/day/11)
[Day 12](https://adventofcode.com/2022/day/12)
[Day 13](https://adventofcode.com/2022/day/13)
[Day 14](https://adventofcode.com/2022/day/14)
[Day 15](https://adventofcode.com/2022/day/15)
[Day 16](https://adventofcode.com/2022/day/16)
[Day 17](https://adventofcode.com/2022/day/17)
[Day 18](https://adventofcode.com/2022/day/18)
[Day 19](https://adventofcode.com/2022/day/19)
[Day 20](https://adventofcode.com/2022/day/20)
[Day 21](https://adventofcode.com/2022/day/21)
[Day 22](https://adventofcode.com/2022/day/22)
[Day 23](https://adventofcode.com/2022/day/23)
[Day 24](https://adventofcode.com/2022/day/24)
[Day 25](https://adventofcode.com/2022/day/25)

Process finished with exit code 0

    */
}
