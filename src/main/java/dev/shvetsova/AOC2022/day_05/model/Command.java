package dev.shvetsova.AOC2022.day_05.model;

import lombok.Getter;

@Getter
public class Command {
    private int move;
    private int from;
    private int to;

    public Command(String line) {
        String[] split = line.split(" ");
        for (int i = 0; i < split.length; i++) {
            switch (split[i].trim()) {
                case "move" -> move = Integer.parseInt(split[++i].trim());
                case "from" -> from = Integer.parseInt(split[++i].trim());
                case "to" -> to = Integer.parseInt(split[++i].trim());
                default -> {
                }
            }
        }
    }


}
