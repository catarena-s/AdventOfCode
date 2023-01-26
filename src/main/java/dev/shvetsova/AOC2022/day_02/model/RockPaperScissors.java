package dev.shvetsova.AOC2022.day_02.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Rock Paper Scissors is a game between two players.
 * Each game contains many rounds; in each round, the players each simultaneously choose one of Rock, Paper, or Scissors
 * using a hand shape. Then, a winner for that round is selected: Rock defeats Scissors,
 * Scissors defeats Paper, and Paper defeats Rock.
 * If both players choose the same shape, the round instead ends in a draw.
 */
@Getter
@RequiredArgsConstructor
public enum RockPaperScissors {
    ROCK(1),
    PAPER(2),
    SCISSORS(3);

    private final int value;

    public RockPaperScissors ifWin() {
        return switch (this) {
            case ROCK -> SCISSORS;
            case PAPER -> ROCK;
            case SCISSORS -> PAPER;
        };
    }

    public RockPaperScissors ifLost() {
        return switch (this) {
            case ROCK -> PAPER;
            case PAPER -> SCISSORS;
            case SCISSORS -> ROCK;
        };
    }

    public static RockPaperScissors get(String v) {
        return switch (v) {
            case "A", "X" -> ROCK;
            case "Y", "B" -> PAPER;
            case "Z", "C" -> SCISSORS;
            default -> null;
        };

    }
}
